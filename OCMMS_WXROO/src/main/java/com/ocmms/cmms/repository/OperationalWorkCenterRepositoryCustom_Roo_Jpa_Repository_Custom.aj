// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.repository.OperationalWorkCenterRepositoryCustom;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect OperationalWorkCenterRepositoryCustom_Roo_Jpa_Repository_Custom {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mainWorkCenter
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<OperationalWorkCenter> OperationalWorkCenterRepositoryCustom.findByMainWorkCenter(MainWorkCenter mainWorkCenter, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plannerGroup
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<OperationalWorkCenter> OperationalWorkCenterRepositoryCustom.findByPlannerGroup(PlannerGroup plannerGroup, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param costCenter
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<OperationalWorkCenter> OperationalWorkCenterRepositoryCustom.findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<OperationalWorkCenter> OperationalWorkCenterRepositoryCustom.findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param responsible
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<OperationalWorkCenter> OperationalWorkCenterRepositoryCustom.findByResponsible(WorkCenterResponsible responsible, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<OperationalWorkCenter> OperationalWorkCenterRepositoryCustom.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<OperationalWorkCenter> OperationalWorkCenterRepositoryCustom.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
}
