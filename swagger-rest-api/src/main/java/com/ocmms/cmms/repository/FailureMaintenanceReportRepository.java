package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FailureMaintenanceReportRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "failuremaintenancereport", path = "failuremaintenancereport")
public interface FailureMaintenanceReportRepository extends  FailureMaintenanceReportRepositoryCustom,
		PagingAndSortingRepository<FailureMaintenanceReport, Long>  {
}
