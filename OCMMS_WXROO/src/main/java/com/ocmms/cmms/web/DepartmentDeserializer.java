package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Department;
import com.ocmms.cmms.service.api.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = DepartmentDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Department.class)
public class DepartmentDeserializer extends JsonObjectDeserializer<Department> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private DepartmentService departmentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param departmentService
     * @param conversionService
     */
    @Autowired
    public DepartmentDeserializer(@Lazy DepartmentService departmentService, ConversionService conversionService) {
        this.departmentService = departmentService;
        this.conversionService = conversionService;
    }
}
