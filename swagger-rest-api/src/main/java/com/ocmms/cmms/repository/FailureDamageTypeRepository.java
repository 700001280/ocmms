package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.FailureDamageType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FailureDamageTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "failuredamagetype", path = "failuredamagetype")
public interface FailureDamageTypeRepository extends  FailureDamageTypeRepositoryCustom,
		PagingAndSortingRepository<FailureDamageType, Long> {
}
