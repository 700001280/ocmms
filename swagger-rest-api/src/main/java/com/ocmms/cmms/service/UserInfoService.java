package com.ocmms.cmms.service;

import com.ocmms.cmms.jwt.controllers.IOStockResult;
import com.ocmms.cmms.jwt.domain.UserLogin;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;




public interface UserInfoService{
	
	public UserLogin getCurrentUser();

	public String getUserMail();

	public Employee getCurrentEmployee();

	public Boolean checkCurrentEmployeeRole(String role);
	
	public IOStockResult handleInstock(MaterialInstockDetail materialInstockDetail);
	
	public IOStockResult handleOutstock(MaterialOutstockDetail materialOutstockDetail);
	
	public String getFileSavePath();	
	
}


