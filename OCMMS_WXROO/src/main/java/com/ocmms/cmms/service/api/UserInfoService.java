package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.hrm.Employee;
import io.springlets.security.jpa.domain.UserLogin;


public interface UserInfoService{
	
	public UserLogin getCurrentUser();

	public String getUserMail();

	public Employee getCurrentEmployee();

	public Boolean checkCurrentEmployeeRole(String role);
	
	public String getFileSavePath();	
	
}


