package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskHeaderText;
import com.ocmms.cmms.model.pm.task.QTaskHeaderText;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = TaskHeaderTextRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskHeaderTextRepositoryImpl extends QueryDslRepositorySupportExt<TaskHeaderText>
		implements TaskHeaderTextRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskHeaderTextRepositoryImpl() {
		super(TaskHeaderText.class);
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
	public static final String HEADER_TEXT_TITLE = "headerTextTitle";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_HEADER_TEXT_CODE = "taskHeaderTextCode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_HEADER = "taskHeader";

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
	public static final String COUNTER_LINE = "counterLine";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskHeaderText> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskHeaderText taskHeaderText = QTaskHeaderText.taskHeaderText;
		JPQLQuery<TaskHeaderText> query = from(taskHeaderText);
		Path<?>[] paths = new Path<?>[] { taskHeaderText.taskHeader, taskHeaderText.taskHeaderTextCode,
				taskHeaderText.counterLine, taskHeaderText.headerTextTitle, taskHeaderText.recordStatus,
				taskHeaderText.createdDate, taskHeaderText.createdBy, taskHeaderText.lastModifiedDate,
				taskHeaderText.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TASK_HEADER, taskHeaderText.taskHeader)
				.map(TASK_HEADER_TEXT_CODE, taskHeaderText.taskHeaderTextCode)
				.map(COUNTER_LINE, taskHeaderText.counterLine).map(HEADER_TEXT_TITLE, taskHeaderText.headerTextTitle)
				.map(RECORD_STATUS, taskHeaderText.recordStatus).map(CREATED_DATE, taskHeaderText.createdDate)
				.map(CREATED_BY, taskHeaderText.createdBy).map(LAST_MODIFIED_DATE, taskHeaderText.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskHeaderText.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskHeaderText);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskHeaderText> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskHeaderText taskHeaderText = QTaskHeaderText.taskHeaderText;
		JPQLQuery<TaskHeaderText> query = from(taskHeaderText);
		Path<?>[] paths = new Path<?>[] { taskHeaderText.taskHeader, taskHeaderText.taskHeaderTextCode,
				taskHeaderText.counterLine, taskHeaderText.headerTextTitle, taskHeaderText.recordStatus,
				taskHeaderText.createdDate, taskHeaderText.createdBy, taskHeaderText.lastModifiedDate,
				taskHeaderText.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskHeaderText.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TASK_HEADER, taskHeaderText.taskHeader)
				.map(TASK_HEADER_TEXT_CODE, taskHeaderText.taskHeaderTextCode)
				.map(COUNTER_LINE, taskHeaderText.counterLine).map(HEADER_TEXT_TITLE, taskHeaderText.headerTextTitle)
				.map(RECORD_STATUS, taskHeaderText.recordStatus).map(CREATED_DATE, taskHeaderText.createdDate)
				.map(CREATED_BY, taskHeaderText.createdBy).map(LAST_MODIFIED_DATE, taskHeaderText.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskHeaderText.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskHeaderText);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskHeaderText> findByTaskHeader(TaskHeader taskHeader, GlobalSearch globalSearch, Pageable pageable) {
		QTaskHeaderText taskHeaderText = QTaskHeaderText.taskHeaderText;
		JPQLQuery<TaskHeaderText> query = from(taskHeaderText);
		Assert.notNull(taskHeader, "taskHeader is required");
		query.where(taskHeaderText.taskHeader.eq(taskHeader));
		Path<?>[] paths = new Path<?>[] { taskHeaderText.taskHeader, taskHeaderText.taskHeaderTextCode,
				taskHeaderText.counterLine, taskHeaderText.headerTextTitle, taskHeaderText.recordStatus,
				taskHeaderText.createdDate, taskHeaderText.createdBy, taskHeaderText.lastModifiedDate,
				taskHeaderText.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TASK_HEADER, taskHeaderText.taskHeader)
				.map(TASK_HEADER_TEXT_CODE, taskHeaderText.taskHeaderTextCode)
				.map(COUNTER_LINE, taskHeaderText.counterLine).map(HEADER_TEXT_TITLE, taskHeaderText.headerTextTitle)
				.map(RECORD_STATUS, taskHeaderText.recordStatus).map(CREATED_DATE, taskHeaderText.createdDate)
				.map(CREATED_BY, taskHeaderText.createdBy).map(LAST_MODIFIED_DATE, taskHeaderText.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskHeaderText.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskHeaderText);
	}
}
