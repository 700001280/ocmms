// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.City;
import com.ocmms.cmms.repository.AddressRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect AddressRepository_Roo_Jpa_Repository {
    
    declare @type: AddressRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @return Long
     */
    public abstract long AddressRepository.countByCity(City city);
    
}
