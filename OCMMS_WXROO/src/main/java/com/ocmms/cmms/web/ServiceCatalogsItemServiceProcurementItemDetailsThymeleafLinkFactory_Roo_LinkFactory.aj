// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.ServiceCatalogsItemServiceProcurementItemDetailsThymeleafController;
import com.ocmms.cmms.web.ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory implements MethodLinkFactory<ServiceCatalogsItemServiceProcurementItemDetailsThymeleafController>;
    
    declare @type: ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.REMOVEFROMSERVICEPROCUREMENTITEMDETAILS = "removeFromServiceProcurementItemDetails";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.REMOVEFROMSERVICEPROCUREMENTITEMDETAILSBATCH = "removeFromServiceProcurementItemDetailsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<ServiceCatalogsItemServiceProcurementItemDetailsThymeleafController> ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.getControllerClass() {
        return ServiceCatalogsItemServiceProcurementItemDetailsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents ServiceCatalogsItemServiceProcurementItemDetailsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMSERVICEPROCUREMENTITEMDETAILS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromServiceProcurementItemDetails(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMSERVICEPROCUREMENTITEMDETAILSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromServiceProcurementItemDetailsBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
