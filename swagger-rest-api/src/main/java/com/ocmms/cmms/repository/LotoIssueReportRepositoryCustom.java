package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoIssueReport;

import com.ocmms.cmms.model.loto.LotoInfo;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = LotoIssueReportRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface LotoIssueReportRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoIssueReport> findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoIssueReport> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoIssueReport> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
