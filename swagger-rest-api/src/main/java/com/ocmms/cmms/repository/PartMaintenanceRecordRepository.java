package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartMaintenanceRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "partmaintenancerecord", path = "partmaintenancerecord")
public interface PartMaintenanceRecordRepository extends  PartMaintenanceRecordRepositoryCustom,
		PagingAndSortingRepository<PartMaintenanceRecord, Long> {
}
