// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.AssetClassificationsItemEquipmentsThymeleafController;
import com.ocmms.cmms.web.AssetClassificationsItemEquipmentsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect AssetClassificationsItemEquipmentsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: AssetClassificationsItemEquipmentsThymeleafLinkFactory implements MethodLinkFactory<AssetClassificationsItemEquipmentsThymeleafController>;
    
    declare @type: AssetClassificationsItemEquipmentsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String AssetClassificationsItemEquipmentsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String AssetClassificationsItemEquipmentsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String AssetClassificationsItemEquipmentsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String AssetClassificationsItemEquipmentsThymeleafLinkFactory.REMOVEFROMEQUIPMENTS = "removeFromEquipments";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String AssetClassificationsItemEquipmentsThymeleafLinkFactory.REMOVEFROMEQUIPMENTSBATCH = "removeFromEquipmentsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String AssetClassificationsItemEquipmentsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<AssetClassificationsItemEquipmentsThymeleafController> AssetClassificationsItemEquipmentsThymeleafLinkFactory.getControllerClass() {
        return AssetClassificationsItemEquipmentsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents AssetClassificationsItemEquipmentsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMEQUIPMENTS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromEquipments(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMEQUIPMENTSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromEquipmentsBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
