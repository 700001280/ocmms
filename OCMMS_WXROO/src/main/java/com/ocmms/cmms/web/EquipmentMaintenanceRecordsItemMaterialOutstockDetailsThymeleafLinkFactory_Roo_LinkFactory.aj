// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory implements MethodLinkFactory<EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController>;
    
    declare @type: EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.REMOVEFROMMATERIALOUTSTOCKDETAILS = "removeFromMaterialOutstockDetails";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.REMOVEFROMMATERIALOUTSTOCKDETAILSBATCH = "removeFromMaterialOutstockDetailsBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController> EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.getControllerClass() {
        return EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMMATERIALOUTSTOCKDETAILS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromMaterialOutstockDetails(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMMATERIALOUTSTOCKDETAILSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromMaterialOutstockDetailsBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
