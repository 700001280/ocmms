// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafController;
import com.ocmms.cmms.web.MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory implements MethodLinkFactory<MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafController>;
    
    declare @type: MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.REMOVEFROMMATERIALINSTOCKDETAILS = "removeFromMaterialInstockDetails";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.REMOVEFROMMATERIALINSTOCKDETAILSBATCH = "removeFromMaterialInstockDetailsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafController> MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.getControllerClass() {
        return MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents MaterialProcurementItemDetailsItemMaterialInstockDetailsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMMATERIALINSTOCKDETAILS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromMaterialInstockDetails(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMMATERIALINSTOCKDETAILSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromMaterialInstockDetailsBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
