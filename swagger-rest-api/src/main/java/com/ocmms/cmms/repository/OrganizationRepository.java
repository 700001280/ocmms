package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.hrm.Organization;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = OrganizationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "organization", path = "organization")
public interface OrganizationRepository extends  OrganizationRepositoryCustom,
		PagingAndSortingRepository<Organization, Long> {

	
}
