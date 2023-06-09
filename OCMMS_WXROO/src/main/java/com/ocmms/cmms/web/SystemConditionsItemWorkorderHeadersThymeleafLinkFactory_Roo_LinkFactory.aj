// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.SystemConditionsItemWorkorderHeadersThymeleafController;
import com.ocmms.cmms.web.SystemConditionsItemWorkorderHeadersThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect SystemConditionsItemWorkorderHeadersThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: SystemConditionsItemWorkorderHeadersThymeleafLinkFactory implements MethodLinkFactory<SystemConditionsItemWorkorderHeadersThymeleafController>;
    
    declare @type: SystemConditionsItemWorkorderHeadersThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.REMOVEFROMWORKORDERHEADERS = "removeFromWorkorderHeaders";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.REMOVEFROMWORKORDERHEADERSBATCH = "removeFromWorkorderHeadersBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<SystemConditionsItemWorkorderHeadersThymeleafController> SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.getControllerClass() {
        return SystemConditionsItemWorkorderHeadersThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents SystemConditionsItemWorkorderHeadersThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMWORKORDERHEADERS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromWorkorderHeaders(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMWORKORDERHEADERSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromWorkorderHeadersBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
