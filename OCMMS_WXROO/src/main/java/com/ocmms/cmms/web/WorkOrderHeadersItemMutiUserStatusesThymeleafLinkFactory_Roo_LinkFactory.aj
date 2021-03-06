// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.WorkOrderHeadersItemMutiUserStatusesThymeleafController;
import com.ocmms.cmms.web.WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory implements MethodLinkFactory<WorkOrderHeadersItemMutiUserStatusesThymeleafController>;
    
    declare @type: WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.REMOVEFROMMUTIUSERSTATUSES = "removeFromMutiUserStatuses";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.REMOVEFROMMUTIUSERSTATUSESBATCH = "removeFromMutiUserStatusesBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<WorkOrderHeadersItemMutiUserStatusesThymeleafController> WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.getControllerClass() {
        return WorkOrderHeadersItemMutiUserStatusesThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents WorkOrderHeadersItemMutiUserStatusesThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMMUTIUSERSTATUSES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromMutiUserStatuses(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMMUTIUSERSTATUSESBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromMutiUserStatusesBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
