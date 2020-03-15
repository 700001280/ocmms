package com.ocmms.cmms.wx.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.Key;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.ocmms.cmms.wx.aes.AesException;
import com.ocmms.cmms.wx.aes.SHA1;
import com.ocmms.cmms.wx.aes.WXBizMsgCrypt;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.service.api.EquipmentService;
import com.ocmms.cmms.service.api.LotoInfoService;
import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.bean.WxMaTemplateData;
import cn.binarywang.wx.miniapp.bean.WxMaTemplateMessage;
import cn.binarywang.wx.miniapp.bean.WxMaUniformMessage;
import cn.binarywang.wx.miniapp.bean.WxMaKefuMessage;
import cn.binarywang.wx.miniapp.bean.WxMaKefuMessage.KfImage;
import cn.binarywang.wx.miniapp.bean.WxMaKefuMessage.KfLink;
import cn.binarywang.wx.miniapp.bean.WxMaKefuMessage.KfMaPage;
import cn.binarywang.wx.miniapp.bean.WxMaKefuMessage.KfText;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.springlets.security.jpa.domain.UserLoginInfo;
import io.springlets.security.jpa.service.api.UserLoginService;
import me.chanjar.weixin.common.error.WxErrorException;

@RestController
@RequestMapping(value = "/api")
public class WeiXinController {
	private static Logger logger = LoggerFactory.getLogger(WeiXinController.class);

	@Autowired
	private UserLoginService userLoginService;

	@Autowired
	private EquipmentService equipmentService;

	@Autowired
	private LotoInfoService lotoInfoService;

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

	@RequestMapping(value = "/wxlogin")
	public ResponseEntity<?> wxOauth(@RequestHeader(name = "code", defaultValue = "") String code,
			@RequestParam(name = "xcode", defaultValue = "") String xcode) throws Exception {
		UserLoginInfo userLoginInfo = this.getUserRoles(code);
		if (userLoginInfo == null) {
			return ResponseEntity.ok("false");
		} else {
			Key key = Keys.hmacShaKeyFor(this.appkey.getBytes());
			Map<String, Object> claims = new HashMap<String, Object>();
			claims.put("username", userLoginInfo.getUsername());
			claims.put("roles", userLoginInfo.getUserLoginRoles());
			String jws = Jwts.builder().setClaims(claims).signWith(key).compact();
			String[] result = new String[] { userLoginInfo.getUsername(), jws };
			return ResponseEntity.ok(result);
		}
	}

	public UserLoginInfo getUserRoles(String code) {
		UserLoginInfo userLoginInfo = null;
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
					String openid = sessionObj.get("openid").toString();
					logger.info("Get WEIXIN Mini App OpenID:{}", openid);
					//userLoginInfo = userLoginService.findDetailsByOpenid(openid);
				}
			}
		}

		return userLoginInfo;
	}

	@RequestMapping(value = "/equipments/{id}")
	public ResponseEntity<?> getEquipmentById(@PathVariable("id") Long id) throws Exception {
		Equipment equipment = this.equipmentService.findOne(id);
		if (equipment == null) {
			return ResponseEntity.ok("Cannot find this equipment!");
		} else {			
			return ResponseEntity.ok(equipment);
		}
	}

	

	@RequestMapping(value = "/message/{formId}")
	public String sendTemplateMsg(@PathVariable("formId") String formId) {

		// 1,配置小程序信息
		WxMaDefaultConfigImpl wxConfig = new WxMaDefaultConfigImpl();
		wxConfig.setAppid(appid);// 小程序appid
		wxConfig.setSecret(secret);// 小程序AppSecret

		WxMaService wxMaService = new WxMaServiceImpl();
		wxMaService.setWxMaConfig(wxConfig);

		// 2,设置模版信息（keyword1：类型，keyword2：内容）
		List<WxMaTemplateData> templateDataList = new ArrayList<>();
		WxMaTemplateData data1 = new WxMaTemplateData("keyword1", "红包已到账", "#DC143C");
		templateDataList.add(data1);
		templateDataList.add(new WxMaTemplateData("keyword2", "刘骞", ""));
		templateDataList.add(new WxMaTemplateData("keyword3", "0.02元", "#DC143C"));
		templateDataList.add(new WxMaTemplateData("keyword4", "成功成为您店铺的会员", ""));
		templateDataList.add(new WxMaTemplateData("keyword5", "卓志海", ""));
		templateDataList.add(new WxMaTemplateData("keyword6", "暂无推荐店铺", ""));

		// 3，设置推送消息
		WxMaTemplateMessage templateMessage = WxMaTemplateMessage.builder().toUser("oJdeH5M1ky4jDOBc-gh1xVmYnfbQ")// 要推送的用户openid
				.formId(formId)// 收集到的formid
				.templateId("Wg6Hh0ZhBq8pKfPM6JsS2byHjpRvLXiGjDdwNUDvGvI")// 推送的模版id（在小程序后台设置）
				.data(templateDataList)// 模版信息
				.page("pages/index/index")// 要跳转到小程序那个页面
				.build();
		// 4，发起推送
		try {
			wxMaService.getMsgService().sendTemplateMsg(templateMessage);
		} catch (WxErrorException e) {
			System.out.println("推送失败：" + e.getMessage());
			return e.getMessage();
		}
		return "推送成功";
	}

	@RequestMapping(value = "/sendmessage/{formId}")
	public String sendUniformMsg(@PathVariable("formId") String formId) {

		// 1,配置小程序信息
		WxMaDefaultConfigImpl wxConfig = new WxMaDefaultConfigImpl();
		wxConfig.setAppid(appid);// 小程序appid
		wxConfig.setSecret(secret);// 小程序AppSecret

		WxMaService wxMaService = new WxMaServiceImpl();
		wxMaService.setWxMaConfig(wxConfig);

		// 2,设置模版信息（keyword1：类型，keyword2：内容）
		WxMaUniformMessage wmum = new WxMaUniformMessage();
		wmum.setToUser("oJdeH5M1ky4jDOBc-gh1xVmYnfbQ");
		wmum.setTemplateId("Wg6Hh0ZhBq8pKfPM6JsS2byHjpRvLXiGjDdwNUDvGvI");
		wmum.setPage("pages/index/index");
		wmum.setFormId(formId);
		wmum.addData(new WxMaTemplateData("keyword1", "红包已到账", "#DC143C"));
		wmum.addData(new WxMaTemplateData("keyword2", "刘骞", ""));
		wmum.addData(new WxMaTemplateData("keyword3", "0.02元", "#DC143C"));
		wmum.addData(new WxMaTemplateData("keyword4", "成功成为您店铺的会员", ""));
		wmum.addData(new WxMaTemplateData("keyword5", "卓志海", ""));
		wmum.addData(new WxMaTemplateData("keyword6", "暂无推荐店铺", ""));

		// 3，发起推送
		try {
			wxMaService.getMsgService().sendUniformMsg(wmum);
		} catch (WxErrorException e) {
			System.out.println("推送失败：" + e.getMessage());
			return e.getMessage();
		}
		return "推送成功";
	}

	@RequestMapping(value = "/checksignature", method = RequestMethod.GET)
	public ResponseEntity<?> checkKefuSignature(@RequestParam(name = "signature", defaultValue = "") String signature,
			@RequestParam(name = "timestamp", defaultValue = "") String timestamp,
			@RequestParam(name = "nonce", defaultValue = "") String nonce,
			@RequestParam(name = "echostr", defaultValue = "") String echostr) throws Exception {

		String token = this.token;

		logger.info("Get WEIXIN Mini App timestamp:{}", timestamp);
		logger.info("Get WEIXIN Mini App nonce:{}", nonce);
		logger.info("Get WEIXIN Mini App echostr:{}", echostr);
		logger.info("Get WEIXIN Mini App signature:{}", signature);
		String tmpStr = this.getSHA1(token, timestamp, nonce);
		logger.info("Get WEIXIN Mini App tmpStr:{}", tmpStr);
		if (signature.equals(tmpStr)) {
			logger.info("Get WEIXIN Mini App check:{}", true);
			return ResponseEntity.ok(echostr);
		} else {
			logger.info("Get WEIXIN Mini App check:{}", false);
			return ResponseEntity.ok("null");
		}
	}

	@RequestMapping(value = "/checksignature", method = RequestMethod.POST)
	public ResponseEntity<?> getKefuMsg(@RequestBody String message,
			@RequestParam(name = "msg_signature", defaultValue = "") String msg_signature,
			@RequestParam(name = "timestamp", defaultValue = "") String timestamp,
			@RequestParam(name = "nonce", defaultValue = "") String nonce,
			@RequestParam(name = "postData", defaultValue = "") String postData) throws Exception {

		logger.info("Get WEIXIN Mini App timestamp:{}", timestamp);
		logger.info("Get WEIXIN Mini App nonce:{}", nonce);
		logger.info("Get WEIXIN Mini App postData:{}", postData);
		logger.info("Get WEIXIN Mini App msg_signature:{}", msg_signature);

		WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encrypt, appid);
		String result = pc.decryptMsg(msg_signature, timestamp, nonce, message);

		logger.info("Get WEIXIN Mini App message:{}",this.getUTF8XMLString( result));

		return ResponseEntity.ok("success");

	}

	public String getSHA1(String token, String timestamp, String nonce) {
		try {
			String[] array = new String[] { token, timestamp, nonce };
			StringBuffer sb = new StringBuffer();
			// 字符串排序
			Arrays.sort(array);
			for (int i = 0; i < 3; i++) {
				sb.append(array[i]);
			}
			String str = sb.toString();
			// SHA1签名生成
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(str.getBytes());
			byte[] digest = md.digest();

			StringBuffer hexstr = new StringBuffer();
			String shaHex = "";
			for (int i = 0; i < digest.length; i++) {
				shaHex = Integer.toHexString(digest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexstr.append(0);
				}
				hexstr.append(shaHex);
			}
			return hexstr.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "failure";
		}
	}

	@RequestMapping(value = "/sendkefumsg/{message}")
	public ResponseEntity<?> sendKeFuMsg(@PathVariable("message") String message) {

		// 1,配置小程序信息
		WxMaDefaultConfigImpl wxConfig = new WxMaDefaultConfigImpl();
		wxConfig.setAppid(appid);// 小程序appid
		wxConfig.setSecret(secret);// 小程序AppSecret

		WxMaService wxMaService = new WxMaServiceImpl();
		wxMaService.setWxMaConfig(wxConfig);

		// 2,设置模版信息（keyword1：类型，keyword2：内容）
		WxMaKefuMessage wmkm = new WxMaKefuMessage();
		wmkm.setToUser("oJdeH5M1ky4jDOBc-gh1xVmYnfbQ");
		wmkm.setMsgType("text");
		wmkm.setText(new KfText(message));

		// 3，发起推送
		try {
			wxMaService.getMsgService().sendKefuMsg(wmkm);
		} catch (WxErrorException e) {
			return ResponseEntity.ok(("推送失败：" + e.getMessage()));

		}
		return ResponseEntity.ok(("推送成功"));
	}

	/**
	 * * Get XML String of utf-8
	 * 
	 * @return XML-Formed string
	 */
	public String getUTF8XMLString(String xml) {
		// A StringBuffer Object
		StringBuffer sb = new StringBuffer();
		sb.append(xml);
		String xmString = "";
		String xmlUTF8 = "";
		try {
			xmString = new String(sb.toString().getBytes("UTF-8"));
			xmlUTF8 = URLEncoder.encode(xmString, "UTF-8");
			System.out.println("utf-8 编码：" + xmlUTF8);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return to String Formed
		return xmString;
	}

}
