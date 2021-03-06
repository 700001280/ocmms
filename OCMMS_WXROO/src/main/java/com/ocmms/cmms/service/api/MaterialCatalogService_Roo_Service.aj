// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.service.api.MaterialCatalogService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect MaterialCatalogService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     */
    public abstract void MaterialCatalogService.delete(MaterialCatalog materialCatalog);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<MaterialCatalog> MaterialCatalogService.save(Iterable<MaterialCatalog> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void MaterialCatalogService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.save(MaterialCatalog entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<MaterialCatalog> MaterialCatalogService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<MaterialCatalog> MaterialCatalogService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long MaterialCatalogService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialCatalog> MaterialCatalogService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialCatalog> MaterialCatalogService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param documentsToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToDocuments(MaterialCatalog materialCatalog, Iterable<Long> documentsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param documentsToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromDocuments(MaterialCatalog materialCatalog, Iterable<Long> documentsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param documents
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setDocuments(MaterialCatalog materialCatalog, Iterable<Long> documents);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param equipmentBomsToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToEquipmentBoms(MaterialCatalog materialCatalog, Iterable<Long> equipmentBomsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param equipmentBomsToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromEquipmentBoms(MaterialCatalog materialCatalog, Iterable<Long> equipmentBomsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param equipmentBoms
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setEquipmentBoms(MaterialCatalog materialCatalog, Iterable<Long> equipmentBoms);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param imagesToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToImages(MaterialCatalog materialCatalog, Iterable<Long> imagesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param imagesToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromImages(MaterialCatalog materialCatalog, Iterable<Long> imagesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param images
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setImages(MaterialCatalog materialCatalog, Iterable<Long> images);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param instockDetailsToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToInstockDetails(MaterialCatalog materialCatalog, Iterable<Long> instockDetailsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param instockDetailsToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromInstockDetails(MaterialCatalog materialCatalog, Iterable<Long> instockDetailsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param instockDetails
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setInstockDetails(MaterialCatalog materialCatalog, Iterable<Long> instockDetails);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialAttributesToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToMaterialAttributes(MaterialCatalog materialCatalog, Iterable<Long> materialAttributesToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialAttributesToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromMaterialAttributes(MaterialCatalog materialCatalog, Iterable<Long> materialAttributesToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialAttributes
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setMaterialAttributes(MaterialCatalog materialCatalog, Iterable<Long> materialAttributes);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialPlantInfosToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToMaterialPlantInfos(MaterialCatalog materialCatalog, Iterable<Long> materialPlantInfosToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialPlantInfosToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromMaterialPlantInfos(MaterialCatalog materialCatalog, Iterable<Long> materialPlantInfosToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialPlantInfos
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setMaterialPlantInfos(MaterialCatalog materialCatalog, Iterable<Long> materialPlantInfos);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialProcurementItemDetailsToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToMaterialProcurementItemDetails(MaterialCatalog materialCatalog, Iterable<Long> materialProcurementItemDetailsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialProcurementItemDetailsToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromMaterialProcurementItemDetails(MaterialCatalog materialCatalog, Iterable<Long> materialProcurementItemDetailsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialProcurementItemDetails
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setMaterialProcurementItemDetails(MaterialCatalog materialCatalog, Iterable<Long> materialProcurementItemDetails);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialStorageLocationInfosToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToMaterialStorageLocationInfos(MaterialCatalog materialCatalog, Iterable<Long> materialStorageLocationInfosToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialStorageLocationInfosToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromMaterialStorageLocationInfos(MaterialCatalog materialCatalog, Iterable<Long> materialStorageLocationInfosToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialStorageLocationInfos
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setMaterialStorageLocationInfos(MaterialCatalog materialCatalog, Iterable<Long> materialStorageLocationInfos);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialVendorInfosToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToMaterialVendorInfos(MaterialCatalog materialCatalog, Iterable<Long> materialVendorInfosToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialVendorInfosToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromMaterialVendorInfos(MaterialCatalog materialCatalog, Iterable<Long> materialVendorInfosToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param materialVendorInfos
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setMaterialVendorInfos(MaterialCatalog materialCatalog, Iterable<Long> materialVendorInfos);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param outstockDetailsToAdd
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.addToOutstockDetails(MaterialCatalog materialCatalog, Iterable<Long> outstockDetailsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param outstockDetailsToRemove
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.removeFromOutstockDetails(MaterialCatalog materialCatalog, Iterable<Long> outstockDetailsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param outstockDetails
     * @return MaterialCatalog
     */
    public abstract MaterialCatalog MaterialCatalogService.setOutstockDetails(MaterialCatalog materialCatalog, Iterable<Long> outstockDetails);
    
}
