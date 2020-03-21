package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;

import io.springlets.security.jpa.domain.UserLogin;


public interface UserInfoService{
	
	public UserLogin getCurrentUser();

	public String getUserMail();

	public Employee getCurrentEmployee();

	public Boolean checkCurrentEmployeeRole(String role);
	
	public Boolean addMaterialInstockQuantity(MaterialInstockDetail materialInstockDetail);
	
	public Boolean subMaterialOutstockQuantity(MaterialOutstockDetail materialOutstockDetail);
	
	public String getFileSavePath();	
	
}


