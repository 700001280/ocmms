package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaintenanceActivityTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "maintenanceactivitytype", path = "maintenanceactivitytype")
public interface MaintenanceActivityTypeRepository extends  MaintenanceActivityTypeRepositoryCustom,
		PagingAndSortingRepository<MaintenanceActivityType, Long>  {
}
