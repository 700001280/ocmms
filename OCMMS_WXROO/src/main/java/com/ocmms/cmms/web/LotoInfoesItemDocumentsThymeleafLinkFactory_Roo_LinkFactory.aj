// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.LotoInfoesItemDocumentsThymeleafController;
import com.ocmms.cmms.web.LotoInfoesItemDocumentsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect LotoInfoesItemDocumentsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: LotoInfoesItemDocumentsThymeleafLinkFactory implements MethodLinkFactory<LotoInfoesItemDocumentsThymeleafController>;
    
    declare @type: LotoInfoesItemDocumentsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfoesItemDocumentsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfoesItemDocumentsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfoesItemDocumentsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfoesItemDocumentsThymeleafLinkFactory.REMOVEFROMDOCUMENTS = "removeFromDocuments";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfoesItemDocumentsThymeleafLinkFactory.REMOVEFROMDOCUMENTSBATCH = "removeFromDocumentsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfoesItemDocumentsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<LotoInfoesItemDocumentsThymeleafController> LotoInfoesItemDocumentsThymeleafLinkFactory.getControllerClass() {
        return LotoInfoesItemDocumentsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents LotoInfoesItemDocumentsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
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
