/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocmms.cmms;

import java.awt.GraphicsEnvironment;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.ocmms.cmms.batch.servicematerialdetail.ServiceMaterialDetailJobLauncher;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.service.api.EquipmentService;

import io.springlets.security.jpa.domain.LoginRole;
import io.springlets.security.jpa.domain.UserLogin;
import io.springlets.security.jpa.domain.UserLoginRole;
import io.springlets.security.jpa.service.api.LoginRoleService;
import io.springlets.security.jpa.service.api.UserLoginRoleService;
import io.springlets.security.jpa.service.api.UserLoginService;

/**
 *
 * @author 700001280
 */
@Component
public class InitApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(InitApplication.class);

	@Autowired
	private UserLoginService userLoginService;

	@Autowired
	private EquipmentService equipmentService;

	@Autowired
	private LoginRoleService loginRoleService;

	@Autowired
	private UserLoginRoleService userLoginRoleService;

	@Value("${spring.application.name}")
	private String name;

	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	
	

		
	@SuppressWarnings("null")
	@Override
	public void run(String... args) {

		// String code=equipmentService.getCodeString(equipmentService.findOne(-199L));
		// logger.info("barcode string is {}",code);
		// Equipment equipment=equipmentService.findEntity(code);
		// logger.info("Equipment is {}",equipment.getTag());

		if (userLoginService.countByName("admin") > 0) {
		


		
		

			GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
			for (String font : e.getAvailableFontFamilyNames()) {
				// System.out.println(font);
			}

			logger.info(name + " InitApplication complete!");
		} else {

			Calendar rightNow = Calendar.getInstance();
			Calendar thruDate = Calendar.getInstance();
			thruDate.set(2119, 12, 31);

			LoginRole loginRole = new LoginRole();
			loginRole.setName("ROLE_ADMIN");
			loginRole.setDescription("ROLE_ADMIN");
			loginRole = loginRoleService.save(loginRole);
			logger.info("Add admin role in database!");

			LoginRole loginRoleUser = new LoginRole();
			loginRoleUser.setName("ROLE_USER");
			loginRoleUser.setDescription("ROLE_USER");
			loginRoleUser = loginRoleService.save(loginRoleUser);
			logger.info("Add user role in database!");

			UserLogin userLogin = new UserLogin();
			userLogin.setUsername("admin");
			userLogin.setFromDate(rightNow);
			userLogin.setLocked(false);
			userLogin.setNeedChangePassword(false);
			userLogin.setPassword(passwordEncoder.encode("admin"));
			userLogin.setThruDate(thruDate);
			//userLogin.setOpenid("oJdeH5M1ky4jDOBc-gh1xVmYnfbQ");
			userLogin = userLoginService.save(userLogin);
			logger.info("Add admin user in database!");

			UserLogin userLoginUser = new UserLogin();
			userLoginUser.setUsername("user");
			userLoginUser.setFromDate(rightNow);
			userLoginUser.setLocked(false);
			userLoginUser.setNeedChangePassword(false);
			userLoginUser.setPassword(passwordEncoder.encode("user"));
			userLoginUser.setThruDate(thruDate);
			//userLoginUser.setOpenid("oJdeH5M1ky4jDOBc-gh1xVmYnfbQ1");
			userLoginUser = userLoginService.save(userLoginUser);
			logger.info("Add user in database!");

			UserLoginRole userLoginRole = new UserLoginRole();
			userLoginRole.setLoginRole(loginRole);
			userLoginRole.setUserLogin(userLogin);
			userLoginRoleService.save(userLoginRole);

			UserLoginRole userLoginRoleUser = new UserLoginRole();
			userLoginRoleUser.setLoginRole(loginRoleUser);
			userLoginRoleUser.setUserLogin(userLoginUser);
			userLoginRoleService.save(userLoginRoleUser);
			logger.info("Add admin and user role for admin user in database!");

		}

	}

}
