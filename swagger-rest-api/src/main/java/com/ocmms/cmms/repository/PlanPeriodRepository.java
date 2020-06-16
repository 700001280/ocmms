package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PlanPeriod;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlanPeriodRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "planperiod", path = "planperiod")
public interface PlanPeriodRepository extends  PlanPeriodRepositoryCustom,
		PagingAndSortingRepository<PlanPeriod, Long>{
}
