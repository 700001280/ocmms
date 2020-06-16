package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerCutterMaintenanceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerCutterMaintenanceRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "pelletizercuttermaintenancerecord", path = "pelletizercuttermaintenancerecord")
public interface PelletizerCutterMaintenanceRecordRepository extends  PelletizerCutterMaintenanceRecordRepositoryCustom,
		PagingAndSortingRepository<PelletizerCutterMaintenanceRecord, Long> {
}
