package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import com.ocmms.cmms.model.assistance.QTaskTrackingStatus;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTrackingStatusRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskTrackingStatusRepositoryImpl extends QueryDslRepositorySupportExt<TaskTrackingStatus>
		implements TaskTrackingStatusRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskTrackingStatusRepositoryImpl() {
		super(TaskTrackingStatus.class);
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
	public static final String CODE = "code";

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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTrackingStatus> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskTrackingStatus taskTrackingStatus = QTaskTrackingStatus.taskTrackingStatus;
		JPQLQuery<TaskTrackingStatus> query = from(taskTrackingStatus);
		Path<?>[] paths = new Path<?>[] { taskTrackingStatus.code, taskTrackingStatus.description,
				taskTrackingStatus.recordStatus, taskTrackingStatus.createdDate, taskTrackingStatus.createdBy,
				taskTrackingStatus.lastModifiedDate, taskTrackingStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, taskTrackingStatus.code)
				.map(DESCRIPTION, taskTrackingStatus.description).map(RECORD_STATUS, taskTrackingStatus.recordStatus)
				.map(CREATED_DATE, taskTrackingStatus.createdDate).map(CREATED_BY, taskTrackingStatus.createdBy)
				.map(LAST_MODIFIED_DATE, taskTrackingStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTrackingStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTrackingStatus);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTrackingStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskTrackingStatus taskTrackingStatus = QTaskTrackingStatus.taskTrackingStatus;
		JPQLQuery<TaskTrackingStatus> query = from(taskTrackingStatus);
		Path<?>[] paths = new Path<?>[] { taskTrackingStatus.code, taskTrackingStatus.description,
				taskTrackingStatus.recordStatus, taskTrackingStatus.createdDate, taskTrackingStatus.createdBy,
				taskTrackingStatus.lastModifiedDate, taskTrackingStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskTrackingStatus.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, taskTrackingStatus.code)
				.map(DESCRIPTION, taskTrackingStatus.description).map(RECORD_STATUS, taskTrackingStatus.recordStatus)
				.map(CREATED_DATE, taskTrackingStatus.createdDate).map(CREATED_BY, taskTrackingStatus.createdBy)
				.map(LAST_MODIFIED_DATE, taskTrackingStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTrackingStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTrackingStatus);
	}
}
