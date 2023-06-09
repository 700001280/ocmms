// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import com.ocmms.cmms.service.api.FailureMaintenanceReportService;
import com.ocmms.cmms.web.FailureMaintenanceReportsItemJsonController;
import io.springlets.web.NotFoundException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

privileged aspect FailureMaintenanceReportsItemJsonController_Roo_JSON {
    
    declare @type: FailureMaintenanceReportsItemJsonController: @RestController;
    
    declare @type: FailureMaintenanceReportsItemJsonController: @RequestMapping(value = "/api/failuremaintenancereports/{failureMaintenanceReport}", name = "FailureMaintenanceReportsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private FailureMaintenanceReportService FailureMaintenanceReportsItemJsonController.failureMaintenanceReportService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param failureMaintenanceReportService
     */
    @Autowired
    public FailureMaintenanceReportsItemJsonController.new(FailureMaintenanceReportService failureMaintenanceReportService) {
        this.failureMaintenanceReportService = failureMaintenanceReportService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return FailureMaintenanceReportService
     */
    public FailureMaintenanceReportService FailureMaintenanceReportsItemJsonController.getFailureMaintenanceReportService() {
        return failureMaintenanceReportService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReportService
     */
    public void FailureMaintenanceReportsItemJsonController.setFailureMaintenanceReportService(FailureMaintenanceReportService failureMaintenanceReportService) {
        this.failureMaintenanceReportService = failureMaintenanceReportService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return FailureMaintenanceReport
     */
    @ModelAttribute
    public FailureMaintenanceReport FailureMaintenanceReportsItemJsonController.getFailureMaintenanceReport(@PathVariable("failureMaintenanceReport") Long id) {
        FailureMaintenanceReport failureMaintenanceReport = failureMaintenanceReportService.findOne(id);
        if (failureMaintenanceReport == null) {
            throw new NotFoundException(String.format("FailureMaintenanceReport with identifier '%s' not found",id));
        }
        return failureMaintenanceReport;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> FailureMaintenanceReportsItemJsonController.show(@ModelAttribute FailureMaintenanceReport failureMaintenanceReport) {
        return ResponseEntity.ok(failureMaintenanceReport);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @return UriComponents
     */
    public static UriComponents FailureMaintenanceReportsItemJsonController.showURI(FailureMaintenanceReport failureMaintenanceReport) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(FailureMaintenanceReportsItemJsonController.class).show(failureMaintenanceReport))
            .buildAndExpand(failureMaintenanceReport.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedFailureMaintenanceReport
     * @param failureMaintenanceReport
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> FailureMaintenanceReportsItemJsonController.update(@ModelAttribute FailureMaintenanceReport storedFailureMaintenanceReport, @Valid @RequestBody FailureMaintenanceReport failureMaintenanceReport, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        failureMaintenanceReport.setId(storedFailureMaintenanceReport.getId());
        getFailureMaintenanceReportService().save(failureMaintenanceReport);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> FailureMaintenanceReportsItemJsonController.delete(@ModelAttribute FailureMaintenanceReport failureMaintenanceReport) {
        getFailureMaintenanceReportService().delete(failureMaintenanceReport);
        return ResponseEntity.ok().build();
    }
    
}
