// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.ProcurementOrdersItemPurchaseExpeditesThymeleafController;
import com.ocmms.cmms.web.ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory implements MethodLinkFactory<ProcurementOrdersItemPurchaseExpeditesThymeleafController>;
    
    declare @type: ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.REMOVEFROMPURCHASEEXPEDITES = "removeFromPurchaseExpedites";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.REMOVEFROMPURCHASEEXPEDITESBATCH = "removeFromPurchaseExpeditesBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<ProcurementOrdersItemPurchaseExpeditesThymeleafController> ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.getControllerClass() {
        return ProcurementOrdersItemPurchaseExpeditesThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents ProcurementOrdersItemPurchaseExpeditesThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMPURCHASEEXPEDITES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromPurchaseExpedites(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMPURCHASEEXPEDITESBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromPurchaseExpeditesBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
