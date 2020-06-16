package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTracking;

import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import com.ocmms.cmms.model.hrm.Employee;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskTrackingRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TaskTrackingRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTracking> findByTaskTrackingStatus(TaskTrackingStatus taskTrackingStatus,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTracking> findByTaskTrackingType(TaskTrackingType taskTrackingType,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskOwner
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTracking> findByTaskOwner(Employee taskOwner, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingPriority
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTracking> findByTaskTrackingPriority(TaskTrackingPriority taskTrackingPriority,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTracking> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TaskTracking> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
