package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = OperationalWorkCenterRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "operationalworkcenter", path = "operationalworkcenter")
public interface OperationalWorkCenterRepository extends  OperationalWorkCenterRepositoryCustom,
		PagingAndSortingRepository<OperationalWorkCenter, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param mainWorkCenter
	 * @return Long
	 */
	public abstract long countByMainWorkCenter(MainWorkCenter mainWorkCenter);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plannerGroup
	 * @return Long
	 */
	public abstract long countByPlannerGroup(PlannerGroup plannerGroup);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @return Long
	 */
	public abstract long countByCostCenter(CostCenter costCenter);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param responsible
	 * @return Long
	 */
	public abstract long countByResponsible(WorkCenterResponsible responsible);
}
