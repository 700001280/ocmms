package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerUpRollerMaintenanceRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "pelletizeruprollermaintenancerecord", path = "pelletizeruprollermaintenancerecord")
public interface PelletizerUpRollerMaintenanceRecordRepository extends  PelletizerUpRollerMaintenanceRecordRepositoryCustom,
		PagingAndSortingRepository<PelletizerUpRollerMaintenanceRecord, Long>{
}
