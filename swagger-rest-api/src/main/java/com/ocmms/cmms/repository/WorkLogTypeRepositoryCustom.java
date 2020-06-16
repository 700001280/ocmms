package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.WorkLogType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkLogTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkLogTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkLogType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkLogType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
