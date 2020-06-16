package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MainWorkCenterRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface MainWorkCenterRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MainWorkCenter> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param responsible
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MainWorkCenter> findByResponsible(WorkCenterResponsible responsible, GlobalSearch globalSearch,
			Pageable pageable);

	/**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MainWorkCenter> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param hierarchyWorkCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MainWorkCenter> findByHierarchyWorkCenter(HierarchyWorkCenter hierarchyWorkCenter,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MainWorkCenter> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MainWorkCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
