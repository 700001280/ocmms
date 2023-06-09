// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.MeasuringRecordsItemDocumentsThymeleafController;
import com.ocmms.cmms.web.MeasuringRecordsItemDocumentsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect MeasuringRecordsItemDocumentsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: MeasuringRecordsItemDocumentsThymeleafLinkFactory implements MethodLinkFactory<MeasuringRecordsItemDocumentsThymeleafController>;
    
    declare @type: MeasuringRecordsItemDocumentsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MeasuringRecordsItemDocumentsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MeasuringRecordsItemDocumentsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MeasuringRecordsItemDocumentsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MeasuringRecordsItemDocumentsThymeleafLinkFactory.REMOVEFROMDOCUMENTS = "removeFromDocuments";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MeasuringRecordsItemDocumentsThymeleafLinkFactory.REMOVEFROMDOCUMENTSBATCH = "removeFromDocumentsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MeasuringRecordsItemDocumentsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<MeasuringRecordsItemDocumentsThymeleafController> MeasuringRecordsItemDocumentsThymeleafLinkFactory.getControllerClass() {
        return MeasuringRecordsItemDocumentsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents MeasuringRecordsItemDocumentsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
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
