package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.FailureDamageCause;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FailureDamageCauseRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "failuredamagecause", path = "failuredamagecause")
public interface FailureDamageCauseRepository extends  FailureDamageCauseRepositoryCustom,
		PagingAndSortingRepository<FailureDamageCause, Long>  {
}
