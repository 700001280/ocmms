package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskHeader;
import com.ocmms.cmms.model.pm.task.QTaskHeader;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = TaskHeaderRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskHeaderRepositoryImpl extends QueryDslRepositorySupportExt<TaskHeader>
		implements TaskHeaderRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskHeaderRepositoryImpl() {
		super(TaskHeader.class);
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
	public static final String SYSTEM_CONDITION = "systemCondition";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String KEY_DATE = "keyDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_CENTER_RESPONSIBLE = "workCenterResponsible";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_TITLE = "taskTitle";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String GROUP_COUNTER = "groupCounter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAIN_WORK_CENTER = "mainWorkCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_TYPE = "taskType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_CODE = "taskCode";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskHeader> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskHeader taskHeader = QTaskHeader.taskHeader;
		JPQLQuery<TaskHeader> query = from(taskHeader);
		Path<?>[] paths = new Path<?>[] { taskHeader.taskType, taskHeader.taskCode, taskHeader.groupCounter,
				taskHeader.taskTitle, taskHeader.technicalObject, taskHeader.mainWorkCenter, taskHeader.organization,
				taskHeader.workCenterResponsible, taskHeader.systemCondition, taskHeader.keyDate,
				taskHeader.recordStatus, taskHeader.createdDate, taskHeader.createdBy, taskHeader.lastModifiedDate,
				taskHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TASK_TYPE, taskHeader.taskType)
				.map(TASK_CODE, taskHeader.taskCode).map(GROUP_COUNTER, taskHeader.groupCounter)
				.map(TASK_TITLE, taskHeader.taskTitle).map(TECHNICAL_OBJECT, taskHeader.technicalObject)
				.map(MAIN_WORK_CENTER, taskHeader.mainWorkCenter).map(ORGANIZATION, taskHeader.organization)
				.map(WORK_CENTER_RESPONSIBLE, taskHeader.workCenterResponsible)
				.map(SYSTEM_CONDITION, taskHeader.systemCondition).map(KEY_DATE, taskHeader.keyDate)
				.map(RECORD_STATUS, taskHeader.recordStatus).map(CREATED_DATE, taskHeader.createdDate)
				.map(CREATED_BY, taskHeader.createdBy).map(LAST_MODIFIED_DATE, taskHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskHeader> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskHeader taskHeader = QTaskHeader.taskHeader;
		JPQLQuery<TaskHeader> query = from(taskHeader);
		Path<?>[] paths = new Path<?>[] { taskHeader.taskType, taskHeader.taskCode, taskHeader.groupCounter,
				taskHeader.taskTitle, taskHeader.technicalObject, taskHeader.mainWorkCenter, taskHeader.organization,
				taskHeader.workCenterResponsible, taskHeader.systemCondition, taskHeader.keyDate,
				taskHeader.recordStatus, taskHeader.createdDate, taskHeader.createdBy, taskHeader.lastModifiedDate,
				taskHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskHeader.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TASK_TYPE, taskHeader.taskType)
				.map(TASK_CODE, taskHeader.taskCode).map(GROUP_COUNTER, taskHeader.groupCounter)
				.map(TASK_TITLE, taskHeader.taskTitle).map(TECHNICAL_OBJECT, taskHeader.technicalObject)
				.map(MAIN_WORK_CENTER, taskHeader.mainWorkCenter).map(ORGANIZATION, taskHeader.organization)
				.map(WORK_CENTER_RESPONSIBLE, taskHeader.workCenterResponsible)
				.map(SYSTEM_CONDITION, taskHeader.systemCondition).map(KEY_DATE, taskHeader.keyDate)
				.map(RECORD_STATUS, taskHeader.recordStatus).map(CREATED_DATE, taskHeader.createdDate)
				.map(CREATED_BY, taskHeader.createdBy).map(LAST_MODIFIED_DATE, taskHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskHeader);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskHeader> findByTechnicalObject(TechnicalObject technicalObject, GlobalSearch globalSearch,
			Pageable pageable) {
		QTaskHeader taskHeader = QTaskHeader.taskHeader;
		JPQLQuery<TaskHeader> query = from(taskHeader);
		Assert.notNull(technicalObject, "technicalObject is required");
		query.where(taskHeader.technicalObject.eq(technicalObject));
		Path<?>[] paths = new Path<?>[] { taskHeader.taskType, taskHeader.taskCode, taskHeader.groupCounter,
				taskHeader.taskTitle, taskHeader.technicalObject, taskHeader.mainWorkCenter, taskHeader.organization,
				taskHeader.workCenterResponsible, taskHeader.systemCondition, taskHeader.keyDate,
				taskHeader.recordStatus, taskHeader.createdDate, taskHeader.createdBy, taskHeader.lastModifiedDate,
				taskHeader.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TASK_TYPE, taskHeader.taskType)
				.map(TASK_CODE, taskHeader.taskCode).map(GROUP_COUNTER, taskHeader.groupCounter)
				.map(TASK_TITLE, taskHeader.taskTitle).map(TECHNICAL_OBJECT, taskHeader.technicalObject)
				.map(MAIN_WORK_CENTER, taskHeader.mainWorkCenter).map(ORGANIZATION, taskHeader.organization)
				.map(WORK_CENTER_RESPONSIBLE, taskHeader.workCenterResponsible)
				.map(SYSTEM_CONDITION, taskHeader.systemCondition).map(KEY_DATE, taskHeader.keyDate)
				.map(RECORD_STATUS, taskHeader.recordStatus).map(CREATED_DATE, taskHeader.createdDate)
				.map(CREATED_BY, taskHeader.createdBy).map(LAST_MODIFIED_DATE, taskHeader.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskHeader.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskHeader);
	}
}
