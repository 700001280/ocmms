// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.NotificationHeadersCollectionThymeleafController;
import com.ocmms.cmms.web.NotificationHeadersCollectionThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect NotificationHeadersCollectionThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: NotificationHeadersCollectionThymeleafLinkFactory implements MethodLinkFactory<NotificationHeadersCollectionThymeleafController>;
    
    declare @type: NotificationHeadersCollectionThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.LIST = "list";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.SELECT2 = "select2";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.DELETEBATCH = "deleteBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.EXPORTCSV = "exportCsv";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.EXPORTPDF = "exportPdf";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String NotificationHeadersCollectionThymeleafLinkFactory.EXPORTXLS = "exportXls";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<NotificationHeadersCollectionThymeleafController> NotificationHeadersCollectionThymeleafLinkFactory.getControllerClass() {
        return NotificationHeadersCollectionThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents NotificationHeadersCollectionThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(LIST)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).list(null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(SELECT2)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).select2(null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DELETEBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).deleteBatch(null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(EXPORTCSV)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).exportCsv(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(EXPORTPDF)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).exportPdf(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(EXPORTXLS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).exportXls(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
