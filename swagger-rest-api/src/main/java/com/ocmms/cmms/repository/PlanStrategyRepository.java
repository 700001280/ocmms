package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.plan.PlanStrategy;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlanStrategyRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "planstrategy", path = "planstrategy")
public interface PlanStrategyRepository extends  PlanStrategyRepositoryCustom,
		PagingAndSortingRepository<PlanStrategy, Long>{
}
