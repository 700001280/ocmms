// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.PlannerGroupsCollectionThymeleafController;
import com.ocmms.cmms.web.PlannerGroupsCollectionThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect PlannerGroupsCollectionThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: PlannerGroupsCollectionThymeleafLinkFactory implements MethodLinkFactory<PlannerGroupsCollectionThymeleafController>;
    
    declare @type: PlannerGroupsCollectionThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.LIST = "list";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.SELECT2 = "select2";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.DELETEBATCH = "deleteBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.EXPORTCSV = "exportCsv";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.EXPORTPDF = "exportPdf";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlannerGroupsCollectionThymeleafLinkFactory.EXPORTXLS = "exportXls";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PlannerGroupsCollectionThymeleafController> PlannerGroupsCollectionThymeleafLinkFactory.getControllerClass() {
        return PlannerGroupsCollectionThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents PlannerGroupsCollectionThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
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
