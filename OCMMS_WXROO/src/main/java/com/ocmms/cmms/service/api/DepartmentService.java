package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.Department;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = DepartmentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Department.class)
public interface DepartmentService extends EntityResolver<Department, Long>, ValidatorService<Department> {
}
