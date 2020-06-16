package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderControlkeyRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkOrderControlkeyRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderControlkey> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderControlkey> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
