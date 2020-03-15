package com.ocmms.cmms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.service.api.EmployeeService;
import com.ocmms.cmms.service.api.UserInfoService;

import io.springlets.security.jpa.domain.UserLogin;
import io.springlets.security.jpa.repository.UserLoginRepository;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;


@Service
@Transactional(readOnly = true)
public class UserInfoServiceImpl implements UserInfoService{

	private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Autowired
    private JavaMailSender mailSender;
	
	@Autowired
	private UserLoginRepository userLoginService;

	@Autowired
	private EmployeeService employeeService;
	
	@Value("${spring.application.upload.savefilepath}")
	private String fileSavePath;

	public UserLogin getCurrentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		logger.info("get authentication name: " + name);
		if (name != null) {
			UserLogin currentUser = userLoginService.findByUsername(name);
			logger.info("get userLogin name: " + currentUser.toString());
			return currentUser;
		} else {
			logger.info("get userLogin name: null");
			return null;
		}
	}

	public String getUserMail() {
		String username = getCurrentUser().getUsername();
		Employee employee = employeeService.findOneByUsername(username);
		String email = employee.getEmail();
		logger.info("getUserEmail: {} ", email);
		return email;

	}

	public Employee getCurrentEmployee() {
		String username = getCurrentUser().getUsername();
		return employeeService.findOneByUsername(username);

	}

	public Boolean checkCurrentEmployeeRole(String role) {
		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities();
		boolean hasRole = false;
		for (GrantedAuthority authority : authorities) {
			hasRole = authority.getAuthority().equals(role);
			if (hasRole) {
				break;
			}
		}
		return hasRole;
	}
	
	public String getFileSavePath() {
		logger.info("fileSavePath: {} ", fileSavePath);
		return fileSavePath;

	}
	
	
}


