package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoIssueReport;
import com.ocmms.cmms.model.loto.LotoInfo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoIssueReportRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "lotoissuereport", path = "lotoissuereport")
public interface LotoIssueReportRepository extends  LotoIssueReportRepositoryCustom,
		PagingAndSortingRepository<LotoIssueReport, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @return Long
	 */
	public abstract long countByLotoInfo(LotoInfo lotoInfo);
}
