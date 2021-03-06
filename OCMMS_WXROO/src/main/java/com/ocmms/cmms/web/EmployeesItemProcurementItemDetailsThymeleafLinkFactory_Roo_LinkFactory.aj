// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.EmployeesItemProcurementItemDetailsThymeleafController;
import com.ocmms.cmms.web.EmployeesItemProcurementItemDetailsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect EmployeesItemProcurementItemDetailsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: EmployeesItemProcurementItemDetailsThymeleafLinkFactory implements MethodLinkFactory<EmployeesItemProcurementItemDetailsThymeleafController>;
    
    declare @type: EmployeesItemProcurementItemDetailsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemProcurementItemDetailsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemProcurementItemDetailsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemProcurementItemDetailsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemProcurementItemDetailsThymeleafLinkFactory.REMOVEFROMPROCUREMENTITEMDETAILS = "removeFromProcurementItemDetails";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemProcurementItemDetailsThymeleafLinkFactory.REMOVEFROMPROCUREMENTITEMDETAILSBATCH = "removeFromProcurementItemDetailsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemProcurementItemDetailsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<EmployeesItemProcurementItemDetailsThymeleafController> EmployeesItemProcurementItemDetailsThymeleafLinkFactory.getControllerClass() {
        return EmployeesItemProcurementItemDetailsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents EmployeesItemProcurementItemDetailsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMPROCUREMENTITEMDETAILS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromProcurementItemDetails(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMPROCUREMENTITEMDETAILSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromProcurementItemDetailsBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
