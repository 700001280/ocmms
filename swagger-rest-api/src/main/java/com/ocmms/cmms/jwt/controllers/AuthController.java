package com.ocmms.cmms.jwt.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ocmms.cmms.jwt.domain.UserLogin;
import com.ocmms.cmms.jwt.payload.request.LoginRequest;
import com.ocmms.cmms.jwt.payload.response.JwtResponse;
import com.ocmms.cmms.jwt.repository.UserLoginRepository;
import com.ocmms.cmms.jwt.repository.UserLoginRoleRepository;

import com.ocmms.cmms.jwt.security.jwt.JwtUtils;
import com.ocmms.cmms.jwt.security.services.UserDetailsImpl;
import com.ocmms.cmms.jwt.security.services.UserDetailsServiceImpl;
import com.ocmms.cmms.repository.WorkLogRepository;
import com.ocmms.cmms.rest.projection.VirtualWorkLogProjection;
import com.ocmms.cmms.service.UserInfoService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AuthController {

	private static Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserLoginRepository userRepository;

	@Autowired
	UserLoginRoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	@Autowired
	JwtUtils jwtUtils;
	
	@Autowired
	private UserInfoService userInfoService;

	@Value("${wx.miniapp.appid}")
	private String appid;

	@Value("${wx.miniapp.key}")
	private String appkey;

	@Value("${wx.miniapp.secret}")
	private String secret;

	@Value("${wx.miniapp.grant_type}")
	private String grant_type;

	@Value("${wx.miniapp.jscode2session_url}")
	private String jscode2session_url;

	@Value("${wx.miniapp.token}")
	private String token;

	@Value("${wx.miniapp.encrypt}")
	private String encrypt;

	
	@PostMapping("/api/auth/login")
	public ResponseEntity<?> login(@RequestHeader(name = "code", defaultValue = "") String code,
			@Valid @RequestBody LoginRequest loginRequest) {
		logger.info("Login....");
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);

		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
				.collect(Collectors.toList());
		if (code != null && code != "") {
			String openId = this.getOpenId(code);
			if (openId != null) {
				Optional<UserLogin> userLogin = userRepository.findByUsername(userDetails.getUsername());
				if (userLogin.isPresent()) {
					UserLogin user = userLogin.get();
					user.setOpenId(openId);
					userRepository.save(user);
				}
			}
		}
		AuthResponseData authResponseData=new AuthResponseData();
		authResponseData.setCode(10001L);
		authResponseData.setMessage("获取Token成功");
		authResponseData.setData(new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(),
				userDetails.getEmail(), userDetails.getAvatar(), roles));
		return ResponseEntity.ok(authResponseData);
	}
	
	@RequestMapping("/api/user/info")
	public ResponseEntity<?> getUserInfo() {
		logger.info("Login....");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
				.collect(Collectors.toList());
		
		AuthResponseData authResponseData=new AuthResponseData();
		authResponseData.setCode(10001L);
		authResponseData.setMessage("获取 User Info 成功");
		authResponseData.setData(new JwtResponse("", userDetails.getId(), userDetails.getUsername(),
				userDetails.getEmail(), userDetails.getAvatar(), roles));
		return ResponseEntity.ok(authResponseData);
	}
	
	@RequestMapping("/api/user/logout")
	public ResponseEntity<?> getUserLogout() {
		logger.info("Login....");
		SecurityContextHolder.getContext().getAuthentication().setAuthenticated(false);	
		
		
		AuthResponseData authResponseData=new AuthResponseData();
		authResponseData.setCode(10001L);
		authResponseData.setMessage("User Logout 成功");		
		return ResponseEntity.ok(authResponseData);
	}

	@RequestMapping(value = "/api/auth/wxlogin")
	public ResponseEntity<?> wxOauth(@RequestHeader(name = "code", defaultValue = "") String code,
			@RequestParam(name = "xcode", defaultValue = "") String xcode) throws Exception {
		String openId = this.getOpenId(code);
		if (openId != null) {
			UserDetails userDetail = userDetailsService.loadUserByOpenId(openId);
			UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail,
					null, userDetail.getAuthorities());
			SecurityContextHolder.getContext().setAuthentication(authentication);

			String jwt = jwtUtils.generateJwtToken(authentication);
			UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
			List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
					.collect(Collectors.toList());

			return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(),
					userDetails.getEmail(), openId, roles));
		} else {

			return ResponseEntity.ok(new JwtResponse("", null, "", "", openId, null));
		}
	}

	public String getOpenId(String code) {
		String openId = null;
		if (code != null && code != "") {
			String param = "?appid=" + appid + "&secret=" + secret + "&grant_type=" + grant_type + "&js_code=" + code;
			String url = jscode2session_url + param;
			logger.info("Get WEIXIN Mini App OpenID URL:{}", url);
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
			if (responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK) {
				String sessionData = responseEntity.getBody();
				logger.info("Get WEIXIN Mini App sessionData:{}", sessionData);
				JSONObject sessionObj = new JSONObject(sessionData);
				if (sessionObj.has("openid")) {
					openId = sessionObj.get("openid").toString();
					logger.info("Get WEIXIN Mini App OpenID:{}", openId);

				}
			}
		}
		return openId;

	}
}
