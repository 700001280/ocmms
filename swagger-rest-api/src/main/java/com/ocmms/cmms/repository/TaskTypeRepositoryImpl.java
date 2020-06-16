package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskType;
import com.ocmms.cmms.model.pm.task.QTaskType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskTypeRepositoryImpl extends QueryDslRepositorySupportExt<TaskType> implements TaskTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskTypeRepositoryImpl() {
		super(TaskType.class);
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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TYPE = "type";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskType taskType = QTaskType.taskType;
		JPQLQuery<TaskType> query = from(taskType);
		Path<?>[] paths = new Path<?>[] { taskType.type, taskType.description, taskType.recordStatus,
				taskType.createdDate, taskType.createdBy, taskType.lastModifiedDate, taskType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, taskType.type).map(DESCRIPTION, taskType.description)
				.map(RECORD_STATUS, taskType.recordStatus).map(CREATED_DATE, taskType.createdDate)
				.map(CREATED_BY, taskType.createdBy).map(LAST_MODIFIED_DATE, taskType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskType taskType = QTaskType.taskType;
		JPQLQuery<TaskType> query = from(taskType);
		Path<?>[] paths = new Path<?>[] { taskType.type, taskType.description, taskType.recordStatus,
				taskType.createdDate, taskType.createdBy, taskType.lastModifiedDate, taskType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, taskType.type).map(DESCRIPTION, taskType.description)
				.map(RECORD_STATUS, taskType.recordStatus).map(CREATED_DATE, taskType.createdDate)
				.map(CREATED_BY, taskType.createdBy).map(LAST_MODIFIED_DATE, taskType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskType);
	}
}
