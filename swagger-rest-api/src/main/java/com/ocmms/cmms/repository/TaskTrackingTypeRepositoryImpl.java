package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTrackingType;
import com.ocmms.cmms.model.assistance.QTaskTrackingType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTrackingTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskTrackingTypeRepositoryImpl extends QueryDslRepositorySupportExt<TaskTrackingType>
		implements TaskTrackingTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskTrackingTypeRepositoryImpl() {
		super(TaskTrackingType.class);
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
	public Page<TaskTrackingType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskTrackingType taskTrackingType = QTaskTrackingType.taskTrackingType;
		JPQLQuery<TaskTrackingType> query = from(taskTrackingType);
		Path<?>[] paths = new Path<?>[] { taskTrackingType.code, taskTrackingType.description,
				taskTrackingType.recordStatus, taskTrackingType.createdDate, taskTrackingType.createdBy,
				taskTrackingType.lastModifiedDate, taskTrackingType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, taskTrackingType.code)
				.map(DESCRIPTION, taskTrackingType.description).map(RECORD_STATUS, taskTrackingType.recordStatus)
				.map(CREATED_DATE, taskTrackingType.createdDate).map(CREATED_BY, taskTrackingType.createdBy)
				.map(LAST_MODIFIED_DATE, taskTrackingType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTrackingType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTrackingType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTrackingType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskTrackingType taskTrackingType = QTaskTrackingType.taskTrackingType;
		JPQLQuery<TaskTrackingType> query = from(taskTrackingType);
		Path<?>[] paths = new Path<?>[] { taskTrackingType.code, taskTrackingType.description,
				taskTrackingType.recordStatus, taskTrackingType.createdDate, taskTrackingType.createdBy,
				taskTrackingType.lastModifiedDate, taskTrackingType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskTrackingType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, taskTrackingType.code)
				.map(DESCRIPTION, taskTrackingType.description).map(RECORD_STATUS, taskTrackingType.recordStatus)
				.map(CREATED_DATE, taskTrackingType.createdDate).map(CREATED_BY, taskTrackingType.createdBy)
				.map(LAST_MODIFIED_DATE, taskTrackingType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTrackingType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTrackingType);
	}
}
