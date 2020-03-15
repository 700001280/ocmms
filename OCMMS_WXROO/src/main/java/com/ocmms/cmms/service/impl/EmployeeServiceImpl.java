package com.ocmms.cmms.service.impl;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.service.api.EmployeeService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;

/**
 * = EmployeeServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = EmployeeService.class)
public class EmployeeServiceImpl implements EmployeeService {
	
	public Employee findOneByUsername(String username) {
		return this.getEmployeeRepository().findOneByUsername(username);
	}
}
