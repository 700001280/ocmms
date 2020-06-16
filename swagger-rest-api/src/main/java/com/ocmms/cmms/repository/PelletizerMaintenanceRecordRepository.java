package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerMaintenanceRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "pelletizermaintenancerecord", path = "pelletizermaintenancerecord")
public interface PelletizerMaintenanceRecordRepository extends  PelletizerMaintenanceRecordRepositoryCustom,
		PagingAndSortingRepository<PelletizerMaintenanceRecord, Long>{
}
