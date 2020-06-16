package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenancePlanRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "preventivemaintenanceplan", path = "preventivemaintenanceplan")
public interface PreventiveMaintenancePlanRepository extends  PreventiveMaintenancePlanRepositoryCustom,
		PagingAndSortingRepository<PreventiveMaintenancePlan, Long> {
}
