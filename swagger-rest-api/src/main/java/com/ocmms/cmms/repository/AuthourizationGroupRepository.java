package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AuthourizationGroupRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "authourizationgroup", path = "authourizationgroup")
public interface AuthourizationGroupRepository extends  AuthourizationGroupRepositoryCustom,
		PagingAndSortingRepository<AuthourizationGroup, Long>  {
}
