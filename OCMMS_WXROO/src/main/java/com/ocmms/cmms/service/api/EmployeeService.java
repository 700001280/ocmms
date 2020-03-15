package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.Employee;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EmployeeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Employee.class)
public interface EmployeeService extends EntityResolver<Employee, Long>, ValidatorService<Employee> {
	
	public Employee findOneByUsername(String username);
}
