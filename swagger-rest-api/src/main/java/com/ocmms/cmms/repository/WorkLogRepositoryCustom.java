package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.WorkLog;

import com.ocmms.cmms.model.assistance.WorkLogType;
import com.ocmms.cmms.model.hrm.Employee;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkLogRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkLogRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param logger
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkLog> findByLogger(Employee logger, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLogType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkLog> findByWorkLogType(WorkLogType workLogType, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkLog> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkLog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
