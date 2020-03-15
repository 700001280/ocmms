package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Company;
import com.ocmms.cmms.service.api.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = CompanyDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Company.class)
public class CompanyDeserializer extends JsonObjectDeserializer<Company> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CompanyService companyService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param companyService
     * @param conversionService
     */
    @Autowired
    public CompanyDeserializer(@Lazy CompanyService companyService, ConversionService conversionService) {
        this.companyService = companyService;
        this.conversionService = conversionService;
    }
}
