// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.repository.MaterialStorageLocationInfoRepositoryCustom;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect MaterialStorageLocationInfoRepositoryCustom_Roo_Jpa_Repository_Custom {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialStorageLocationInfo> MaterialStorageLocationInfoRepositoryCustom.findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageLocation
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialStorageLocationInfo> MaterialStorageLocationInfoRepositoryCustom.findByStorageLocation(StorageLocation storageLocation, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialStorageLocationInfo> MaterialStorageLocationInfoRepositoryCustom.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialStorageLocationInfo> MaterialStorageLocationInfoRepositoryCustom.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
