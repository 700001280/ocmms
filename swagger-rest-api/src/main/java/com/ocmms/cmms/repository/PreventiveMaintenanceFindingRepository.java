package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenanceFindingRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "preventivemaintenancefinding", path = "preventivemaintenancefinding")
public interface PreventiveMaintenanceFindingRepository extends  PreventiveMaintenanceFindingRepositoryCustom,
		PagingAndSortingRepository<PreventiveMaintenanceFinding, Long> {
}
