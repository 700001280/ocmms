package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskOperationText;
import com.ocmms.cmms.model.pm.task.QTaskOperationText;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskOperationTextRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskOperationTextRepositoryImpl extends QueryDslRepositorySupportExt<TaskOperationText>
		implements TaskOperationTextRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskOperationTextRepositoryImpl() {
		super(TaskOperationText.class);
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
	public static final String OPERATION_TEXT_NUMBER = "operationTextNumber";

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
	public static final String TASK_OPERATION_HEADER = "taskOperationHeader";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_OPERATION_TEXT_CODE = "taskOperationTextCode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OPERATION_SHORT_TEXT = "operationShortText";

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
	public Page<TaskOperationText> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskOperationText taskOperationText = QTaskOperationText.taskOperationText;
		JPQLQuery<TaskOperationText> query = from(taskOperationText);
		Path<?>[] paths = new Path<?>[] { taskOperationText.taskOperationHeader,
				taskOperationText.taskOperationTextCode, taskOperationText.operationTextNumber,
				taskOperationText.operationShortText, taskOperationText.recordStatus, taskOperationText.createdDate,
				taskOperationText.createdBy, taskOperationText.lastModifiedDate, taskOperationText.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(TASK_OPERATION_HEADER, taskOperationText.taskOperationHeader)
				.map(TASK_OPERATION_TEXT_CODE, taskOperationText.taskOperationTextCode)
				.map(OPERATION_TEXT_NUMBER, taskOperationText.operationTextNumber)
				.map(OPERATION_SHORT_TEXT, taskOperationText.operationShortText)
				.map(RECORD_STATUS, taskOperationText.recordStatus).map(CREATED_DATE, taskOperationText.createdDate)
				.map(CREATED_BY, taskOperationText.createdBy)
				.map(LAST_MODIFIED_DATE, taskOperationText.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskOperationText.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskOperationText);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskOperationText> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskOperationText taskOperationText = QTaskOperationText.taskOperationText;
		JPQLQuery<TaskOperationText> query = from(taskOperationText);
		Path<?>[] paths = new Path<?>[] { taskOperationText.taskOperationHeader,
				taskOperationText.taskOperationTextCode, taskOperationText.operationTextNumber,
				taskOperationText.operationShortText, taskOperationText.recordStatus, taskOperationText.createdDate,
				taskOperationText.createdBy, taskOperationText.lastModifiedDate, taskOperationText.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskOperationText.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(TASK_OPERATION_HEADER, taskOperationText.taskOperationHeader)
				.map(TASK_OPERATION_TEXT_CODE, taskOperationText.taskOperationTextCode)
				.map(OPERATION_TEXT_NUMBER, taskOperationText.operationTextNumber)
				.map(OPERATION_SHORT_TEXT, taskOperationText.operationShortText)
				.map(RECORD_STATUS, taskOperationText.recordStatus).map(CREATED_DATE, taskOperationText.createdDate)
				.map(CREATED_BY, taskOperationText.createdBy)
				.map(LAST_MODIFIED_DATE, taskOperationText.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskOperationText.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskOperationText);
	}
}
