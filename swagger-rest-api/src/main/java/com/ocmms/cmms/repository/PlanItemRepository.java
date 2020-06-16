package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PlanItem;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlanItemRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "planitem", path = "planitem")
public interface PlanItemRepository extends  PlanItemRepositoryCustom,
		PagingAndSortingRepository<PlanItem, Long>{
}
