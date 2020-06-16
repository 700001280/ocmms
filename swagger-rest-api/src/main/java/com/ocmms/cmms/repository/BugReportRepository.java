package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.system.BugReport;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = BugReportRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "bugreport", path = "bugreport")
public interface BugReportRepository extends  BugReportRepositoryCustom,
		PagingAndSortingRepository<BugReport, Long>  {
}
