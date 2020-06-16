package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = OperationalWorkCenterRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface OperationalWorkCenterRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param mainWorkCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OperationalWorkCenter> findByMainWorkCenter(MainWorkCenter mainWorkCenter,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plannerGroup
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OperationalWorkCenter> findByPlannerGroup(PlannerGroup plannerGroup, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OperationalWorkCenter> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OperationalWorkCenter> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param responsible
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OperationalWorkCenter> findByResponsible(WorkCenterResponsible responsible,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OperationalWorkCenter> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OperationalWorkCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
