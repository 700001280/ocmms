package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlannerGroup;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlannerGroupRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "plannergroup", path = "plannergroup")
public interface PlannerGroupRepository extends  PlannerGroupRepositoryCustom,
		PagingAndSortingRepository<PlannerGroup, Long>{
}
