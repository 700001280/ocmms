package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTracking;

import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import com.ocmms.cmms.model.hrm.Employee;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTrackingRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "tasktracking", path = "tasktracking")
public interface TaskTrackingRepository extends  TaskTrackingRepositoryCustom,
		PagingAndSortingRepository<TaskTracking, Long>{

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingStatus
	 * @return Long
	 */
	public abstract long countByTaskTrackingStatus(TaskTrackingStatus taskTrackingStatus);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingType
	 * @return Long
	 */
	public abstract long countByTaskTrackingType(TaskTrackingType taskTrackingType);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskOwner
	 * @return Long
	 */
	public abstract long countByTaskOwner(Employee taskOwner);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingPriority
	 * @return Long
	 */
	public abstract long countByTaskTrackingPriority(TaskTrackingPriority taskTrackingPriority);
}
