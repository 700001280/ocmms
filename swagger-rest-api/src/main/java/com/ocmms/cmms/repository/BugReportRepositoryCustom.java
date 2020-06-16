package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.BugReport;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = BugReportRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface BugReportRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BugReport> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BugReport> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
