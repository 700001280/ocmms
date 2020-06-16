package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.model.hrm.Organization;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkCenterResponsibleRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workcenterresponsible", path = "workcenterresponsible")
public interface WorkCenterResponsibleRepository extends  WorkCenterResponsibleRepositoryCustom,
		PagingAndSortingRepository<WorkCenterResponsible, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);
}
