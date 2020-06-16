package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AutonomousMaintenanceFindingRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "autonomousmaintenancefinding", path = "autonomousmaintenancefinding")
public interface AutonomousMaintenanceFindingRepository extends  AutonomousMaintenanceFindingRepositoryCustom,
		PagingAndSortingRepository<AutonomousMaintenanceFinding, Long>  {
}
