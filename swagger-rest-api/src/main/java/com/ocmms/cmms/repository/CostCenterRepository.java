package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.fico.CostCenter;

import com.ocmms.cmms.model.hrm.Organization;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CostCenterRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "costcenter", path = "costcenter")
public interface CostCenterRepository extends  CostCenterRepositoryCustom,
		PagingAndSortingRepository<CostCenter, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);
}
