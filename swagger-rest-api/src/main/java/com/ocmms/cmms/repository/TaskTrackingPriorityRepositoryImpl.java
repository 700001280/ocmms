package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import com.ocmms.cmms.model.assistance.QTaskTrackingPriority;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTrackingPriorityRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskTrackingPriorityRepositoryImpl extends QueryDslRepositorySupportExt<TaskTrackingPriority>
		implements TaskTrackingPriorityRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskTrackingPriorityRepositoryImpl() {
		super(TaskTrackingPriority.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PRIORITY = "priority";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTrackingPriority> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskTrackingPriority taskTrackingPriority = QTaskTrackingPriority.taskTrackingPriority;
		JPQLQuery<TaskTrackingPriority> query = from(taskTrackingPriority);
		Path<?>[] paths = new Path<?>[] { taskTrackingPriority.priority, taskTrackingPriority.description,
				taskTrackingPriority.recordStatus, taskTrackingPriority.createdDate, taskTrackingPriority.createdBy,
				taskTrackingPriority.lastModifiedDate, taskTrackingPriority.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY, taskTrackingPriority.priority)
				.map(DESCRIPTION, taskTrackingPriority.description)
				.map(RECORD_STATUS, taskTrackingPriority.recordStatus)
				.map(CREATED_DATE, taskTrackingPriority.createdDate).map(CREATED_BY, taskTrackingPriority.createdBy)
				.map(LAST_MODIFIED_DATE, taskTrackingPriority.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTrackingPriority.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTrackingPriority);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTrackingPriority> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskTrackingPriority taskTrackingPriority = QTaskTrackingPriority.taskTrackingPriority;
		JPQLQuery<TaskTrackingPriority> query = from(taskTrackingPriority);
		Path<?>[] paths = new Path<?>[] { taskTrackingPriority.priority, taskTrackingPriority.description,
				taskTrackingPriority.recordStatus, taskTrackingPriority.createdDate, taskTrackingPriority.createdBy,
				taskTrackingPriority.lastModifiedDate, taskTrackingPriority.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskTrackingPriority.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY, taskTrackingPriority.priority)
				.map(DESCRIPTION, taskTrackingPriority.description)
				.map(RECORD_STATUS, taskTrackingPriority.recordStatus)
				.map(CREATED_DATE, taskTrackingPriority.createdDate).map(CREATED_BY, taskTrackingPriority.createdBy)
				.map(LAST_MODIFIED_DATE, taskTrackingPriority.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTrackingPriority.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTrackingPriority);
	}
}
