// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Province;
import com.ocmms.cmms.repository.CityRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CityRepository_Roo_Jpa_Repository {
    
    declare @type: CityRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param province
     * @return Long
     */
    public abstract long CityRepository.countByProvince(Province province);
    
}
