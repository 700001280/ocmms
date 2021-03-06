// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.TechnicalObjectsItemBillOfMaterialsThymeleafController;
import com.ocmms.cmms.web.TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory implements MethodLinkFactory<TechnicalObjectsItemBillOfMaterialsThymeleafController>;
    
    declare @type: TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.REMOVEFROMBILLOFMATERIALS = "removeFromBillOfMaterials";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.REMOVEFROMBILLOFMATERIALSBATCH = "removeFromBillOfMaterialsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<TechnicalObjectsItemBillOfMaterialsThymeleafController> TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.getControllerClass() {
        return TechnicalObjectsItemBillOfMaterialsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents TechnicalObjectsItemBillOfMaterialsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMBILLOFMATERIALS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromBillOfMaterials(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMBILLOFMATERIALSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromBillOfMaterialsBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
