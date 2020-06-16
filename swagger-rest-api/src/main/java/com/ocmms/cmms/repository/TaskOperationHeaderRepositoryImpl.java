package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskOperationHeader;
import com.ocmms.cmms.model.pm.task.QTaskOperationHeader;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskOperationHeaderRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskOperationHeaderRepositoryImpl extends QueryDslRepositorySupportExt<TaskOperationHeader>
		implements TaskOperationHeaderRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskOperationHeaderRepositoryImpl() {
		super(TaskOperationHeader.class);
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
	public static final String OPERATION_NUMBER = "operationNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UNIT_FOR_WORK = "unitForWork";

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
	public static final String OPERATION_WORK_CENTER = "operationWorkCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OPERATION_SHORT_TEXT = "operationShortText";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CONTROLKEY = "controlkey";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_OPERATION_HEADER_CODE = "taskOperationHeaderCode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SYSTEM_CONDITION = "systemCondition";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OPERATION_LABOR = "operationLabor";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_HEADER_TEXT = "taskHeaderText";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NO_OF_REQUIRED_CAPACITY = "noOfRequiredCapacity";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACTIVITY_TYPE = "activityType";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskOperationHeader> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskOperationHeader taskOperationHeader = QTaskOperationHeader.taskOperationHeader;
		JPQLQuery<TaskOperationHeader> query = from(taskOperationHeader);
		Path<?>[] paths = new Path<?>[] { taskOperationHeader.taskHeaderText,
				taskOperationHeader.taskOperationHeaderCode, taskOperationHeader.operationNumber,
				taskOperationHeader.operationShortText, taskOperationHeader.operationWorkCenter,
				taskOperationHeader.activityType, taskOperationHeader.controlkey, taskOperationHeader.organization,
				taskOperationHeader.systemCondition, taskOperationHeader.operationLabor,
				taskOperationHeader.unitForWork, taskOperationHeader.noOfRequiredCapacity,
				taskOperationHeader.recordStatus, taskOperationHeader.createdDate, taskOperationHeader.createdBy,
				taskOperationHeader.lastModifiedDate, taskOperationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TASK_HEADER_TEXT, taskOperationHeader.taskHeaderText)
				.map(TASK_OPERATION_HEADER_CODE, taskOperationHeader.taskOperationHeaderCode)
				.map(OPERATION_NUMBER, taskOperationHeader.operationNumber)
				.map(OPERATION_SHORT_TEXT, taskOperationHeader.operationShortText)
				.map(OPERATION_WORK_CENTER, taskOperationHeader.operationWorkCenter)
				.map(ACTIVITY_TYPE, taskOperationHeader.activityType).map(CONTROLKEY, taskOperationHeader.controlkey)
				.map(ORGANIZATION, taskOperationHeader.organization)
				.map(SYSTEM_CONDITION, taskOperationHeader.systemCondition)
				.map(OPERATION_LABOR, taskOperationHeader.operationLabor)
				.map(UNIT_FOR_WORK, taskOperationHeader.unitForWork)
				.map(NO_OF_REQUIRED_CAPACITY, taskOperationHeader.noOfRequiredCapacity)
				.map(RECORD_STATUS, taskOperationHeader.recordStatus).map(CREATED_DATE, taskOperationHeader.createdDate)
				.map(CREATED_BY, taskOperationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, taskOperationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskOperationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskOperationHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskOperationHeader> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskOperationHeader taskOperationHeader = QTaskOperationHeader.taskOperationHeader;
		JPQLQuery<TaskOperationHeader> query = from(taskOperationHeader);
		Path<?>[] paths = new Path<?>[] { taskOperationHeader.taskHeaderText,
				taskOperationHeader.taskOperationHeaderCode, taskOperationHeader.operationNumber,
				taskOperationHeader.operationShortText, taskOperationHeader.operationWorkCenter,
				taskOperationHeader.activityType, taskOperationHeader.controlkey, taskOperationHeader.organization,
				taskOperationHeader.systemCondition, taskOperationHeader.operationLabor,
				taskOperationHeader.unitForWork, taskOperationHeader.noOfRequiredCapacity,
				taskOperationHeader.recordStatus, taskOperationHeader.createdDate, taskOperationHeader.createdBy,
				taskOperationHeader.lastModifiedDate, taskOperationHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskOperationHeader.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TASK_HEADER_TEXT, taskOperationHeader.taskHeaderText)
				.map(TASK_OPERATION_HEADER_CODE, taskOperationHeader.taskOperationHeaderCode)
				.map(OPERATION_NUMBER, taskOperationHeader.operationNumber)
				.map(OPERATION_SHORT_TEXT, taskOperationHeader.operationShortText)
				.map(OPERATION_WORK_CENTER, taskOperationHeader.operationWorkCenter)
				.map(ACTIVITY_TYPE, taskOperationHeader.activityType).map(CONTROLKEY, taskOperationHeader.controlkey)
				.map(ORGANIZATION, taskOperationHeader.organization)
				.map(SYSTEM_CONDITION, taskOperationHeader.systemCondition)
				.map(OPERATION_LABOR, taskOperationHeader.operationLabor)
				.map(UNIT_FOR_WORK, taskOperationHeader.unitForWork)
				.map(NO_OF_REQUIRED_CAPACITY, taskOperationHeader.noOfRequiredCapacity)
				.map(RECORD_STATUS, taskOperationHeader.recordStatus).map(CREATED_DATE, taskOperationHeader.createdDate)
				.map(CREATED_BY, taskOperationHeader.createdBy)
				.map(LAST_MODIFIED_DATE, taskOperationHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskOperationHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskOperationHeader);
	}
}
