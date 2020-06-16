package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkOrderTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
