package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskActivityType;
import com.ocmms.cmms.model.pm.task.QTaskActivityType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskActivityTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskActivityTypeRepositoryImpl extends QueryDslRepositorySupportExt<TaskActivityType>
		implements TaskActivityTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskActivityTypeRepositoryImpl() {
		super(TaskActivityType.class);
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
	public Page<TaskActivityType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskActivityType taskActivityType = QTaskActivityType.taskActivityType;
		JPQLQuery<TaskActivityType> query = from(taskActivityType);
		Path<?>[] paths = new Path<?>[] { taskActivityType.code, taskActivityType.description,
				taskActivityType.recordStatus, taskActivityType.createdDate, taskActivityType.createdBy,
				taskActivityType.lastModifiedDate, taskActivityType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, taskActivityType.code)
				.map(DESCRIPTION, taskActivityType.description).map(RECORD_STATUS, taskActivityType.recordStatus)
				.map(CREATED_DATE, taskActivityType.createdDate).map(CREATED_BY, taskActivityType.createdBy)
				.map(LAST_MODIFIED_DATE, taskActivityType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskActivityType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskActivityType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskActivityType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskActivityType taskActivityType = QTaskActivityType.taskActivityType;
		JPQLQuery<TaskActivityType> query = from(taskActivityType);
		Path<?>[] paths = new Path<?>[] { taskActivityType.code, taskActivityType.description,
				taskActivityType.recordStatus, taskActivityType.createdDate, taskActivityType.createdBy,
				taskActivityType.lastModifiedDate, taskActivityType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskActivityType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, taskActivityType.code)
				.map(DESCRIPTION, taskActivityType.description).map(RECORD_STATUS, taskActivityType.recordStatus)
				.map(CREATED_DATE, taskActivityType.createdDate).map(CREATED_BY, taskActivityType.createdBy)
				.map(LAST_MODIFIED_DATE, taskActivityType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskActivityType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskActivityType);
	}
}
