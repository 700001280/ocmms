// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import com.ocmms.cmms.repository.OrganizationRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect OrganizationRepository_Roo_Jpa_Repository {
    
    declare @type: OrganizationRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationCatalog
     * @return Long
     */
    public abstract long OrganizationRepository.countByOrganizationCatalog(OrganizationCatalog organizationCatalog);
    
}
