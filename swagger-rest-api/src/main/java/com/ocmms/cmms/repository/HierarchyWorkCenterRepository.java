package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = HierarchyWorkCenterRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "hierarchyworkcenter", path = "hierarchyworkcenter")
public interface HierarchyWorkCenterRepository extends  HierarchyWorkCenterRepositoryCustom,
		PagingAndSortingRepository<HierarchyWorkCenter, Long> {

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
