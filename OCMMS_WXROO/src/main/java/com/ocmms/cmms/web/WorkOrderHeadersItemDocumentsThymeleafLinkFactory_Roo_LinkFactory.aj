// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.WorkOrderHeadersItemDocumentsThymeleafController;
import com.ocmms.cmms.web.WorkOrderHeadersItemDocumentsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect WorkOrderHeadersItemDocumentsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: WorkOrderHeadersItemDocumentsThymeleafLinkFactory implements MethodLinkFactory<WorkOrderHeadersItemDocumentsThymeleafController>;
    
    declare @type: WorkOrderHeadersItemDocumentsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemDocumentsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemDocumentsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemDocumentsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemDocumentsThymeleafLinkFactory.REMOVEFROMDOCUMENTS = "removeFromDocuments";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemDocumentsThymeleafLinkFactory.REMOVEFROMDOCUMENTSBATCH = "removeFromDocumentsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String WorkOrderHeadersItemDocumentsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<WorkOrderHeadersItemDocumentsThymeleafController> WorkOrderHeadersItemDocumentsThymeleafLinkFactory.getControllerClass() {
        return WorkOrderHeadersItemDocumentsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents WorkOrderHeadersItemDocumentsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMDOCUMENTS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromDocuments(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMDOCUMENTSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromDocumentsBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
