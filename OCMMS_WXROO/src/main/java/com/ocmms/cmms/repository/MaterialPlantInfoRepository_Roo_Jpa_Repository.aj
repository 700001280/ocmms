// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.repository.MaterialPlantInfoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialPlantInfoRepository_Roo_Jpa_Repository {
    
    declare @type: MaterialPlantInfoRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @return Long
     */
    public abstract long MaterialPlantInfoRepository.countByMaterialCatalog(MaterialCatalog materialCatalog);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @return Long
     */
    public abstract long MaterialPlantInfoRepository.countByOrganization(Organization organization);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param organization
     * @param pageable
     * @return Page
     */
    public abstract Page<MaterialPlantInfo> MaterialPlantInfoRepository.findByMaterialCatalogAndOrganization(MaterialCatalog materialCatalog, Organization organization, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param organization
     * @return Long
     */
    public abstract long MaterialPlantInfoRepository.countByMaterialCatalogAndOrganization(MaterialCatalog materialCatalog, Organization organization);
    
}
