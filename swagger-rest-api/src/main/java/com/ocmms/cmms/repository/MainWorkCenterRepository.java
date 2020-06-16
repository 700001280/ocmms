package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MainWorkCenterRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "mainworkcenter", path = "mainworkcenter")
public interface MainWorkCenterRepository extends  MainWorkCenterRepositoryCustom,
		PagingAndSortingRepository<MainWorkCenter, Long> {

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
	 * @param responsible
	 * @return Long
	 */
	public abstract long countByResponsible(WorkCenterResponsible responsible);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param department
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param hierarchyWorkCenter
	 * @return Long
	 */
	public abstract long countByHierarchyWorkCenter(HierarchyWorkCenter hierarchyWorkCenter);
}
