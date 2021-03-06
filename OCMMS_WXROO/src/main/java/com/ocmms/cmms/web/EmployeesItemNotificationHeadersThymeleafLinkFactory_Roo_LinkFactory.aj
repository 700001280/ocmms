// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.EmployeesItemNotificationHeadersThymeleafController;
import com.ocmms.cmms.web.EmployeesItemNotificationHeadersThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect EmployeesItemNotificationHeadersThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: EmployeesItemNotificationHeadersThymeleafLinkFactory implements MethodLinkFactory<EmployeesItemNotificationHeadersThymeleafController>;
    
    declare @type: EmployeesItemNotificationHeadersThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemNotificationHeadersThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemNotificationHeadersThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemNotificationHeadersThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemNotificationHeadersThymeleafLinkFactory.REMOVEFROMNOTIFICATIONHEADERS = "removeFromNotificationHeaders";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemNotificationHeadersThymeleafLinkFactory.REMOVEFROMNOTIFICATIONHEADERSBATCH = "removeFromNotificationHeadersBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EmployeesItemNotificationHeadersThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<EmployeesItemNotificationHeadersThymeleafController> EmployeesItemNotificationHeadersThymeleafLinkFactory.getControllerClass() {
        return EmployeesItemNotificationHeadersThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents EmployeesItemNotificationHeadersThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMNOTIFICATIONHEADERS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromNotificationHeaders(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMNOTIFICATIONHEADERSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromNotificationHeadersBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
