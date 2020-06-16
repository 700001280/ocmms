package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.QTaskTracking;
import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import com.ocmms.cmms.model.hrm.Employee;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = TaskTrackingRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskTrackingRepositoryImpl extends QueryDslRepositorySupportExt<TaskTracking>
		implements TaskTrackingRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskTrackingRepositoryImpl() {
		super(TaskTracking.class);
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
	public static final String SUPPORT_VENDOR = "supportVendor";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUBMITTER = "submitter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_TRACKING_STATUS = "taskTrackingStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_TRACKING_TYPE = "taskTrackingType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSIGN_DATE = "assignDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_TRACKING_PRIORITY = "taskTrackingPriority";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TARGET_DATE = "targetDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COMPLETE_DATE = "completeDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUBMIT_DATE = "submitDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_OWNER = "taskOwner";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REFERENCE = "reference";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTracking> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskTracking taskTracking = QTaskTracking.taskTracking;
		JPQLQuery<TaskTracking> query = from(taskTracking);
		Path<?>[] paths = new Path<?>[] { taskTracking.submitDate, taskTracking.submitter, taskTracking.technicalObject,
				taskTracking.description, taskTracking.taskTrackingPriority, taskTracking.taskTrackingStatus,
				taskTracking.taskTrackingType, taskTracking.targetDate, taskTracking.assignDate,
				taskTracking.completeDate, taskTracking.reference, taskTracking.memo, taskTracking.taskOwner,
				taskTracking.supportVendor, taskTracking.recordStatus, taskTracking.lastModifiedDate,
				taskTracking.lastModifiedBy, taskTracking.createdDate, taskTracking.createdBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SUBMIT_DATE, taskTracking.submitDate)
				.map(SUBMITTER, taskTracking.submitter).map(TECHNICAL_OBJECT, taskTracking.technicalObject)
				.map(DESCRIPTION, taskTracking.description)
				.map(TASK_TRACKING_PRIORITY, taskTracking.taskTrackingPriority)
				.map(TASK_TRACKING_STATUS, taskTracking.taskTrackingStatus)
				.map(TASK_TRACKING_TYPE, taskTracking.taskTrackingType).map(TARGET_DATE, taskTracking.targetDate)
				.map(ASSIGN_DATE, taskTracking.assignDate).map(COMPLETE_DATE, taskTracking.completeDate)
				.map(REFERENCE, taskTracking.reference).map(MEMO, taskTracking.memo)
				.map(TASK_OWNER, taskTracking.taskOwner).map(SUPPORT_VENDOR, taskTracking.supportVendor)
				.map(RECORD_STATUS, taskTracking.recordStatus).map(LAST_MODIFIED_DATE, taskTracking.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTracking.lastModifiedBy).map(CREATED_DATE, taskTracking.createdDate)
				.map(CREATED_BY, taskTracking.createdBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTracking);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTracking> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskTracking taskTracking = QTaskTracking.taskTracking;
		JPQLQuery<TaskTracking> query = from(taskTracking);
		Path<?>[] paths = new Path<?>[] { taskTracking.submitDate, taskTracking.submitter, taskTracking.technicalObject,
				taskTracking.description, taskTracking.taskTrackingPriority, taskTracking.taskTrackingStatus,
				taskTracking.taskTrackingType, taskTracking.targetDate, taskTracking.assignDate,
				taskTracking.completeDate, taskTracking.reference, taskTracking.memo, taskTracking.taskOwner,
				taskTracking.supportVendor, taskTracking.recordStatus, taskTracking.lastModifiedDate,
				taskTracking.lastModifiedBy, taskTracking.createdDate, taskTracking.createdBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskTracking.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(SUBMIT_DATE, taskTracking.submitDate)
				.map(SUBMITTER, taskTracking.submitter).map(TECHNICAL_OBJECT, taskTracking.technicalObject)
				.map(DESCRIPTION, taskTracking.description)
				.map(TASK_TRACKING_PRIORITY, taskTracking.taskTrackingPriority)
				.map(TASK_TRACKING_STATUS, taskTracking.taskTrackingStatus)
				.map(TASK_TRACKING_TYPE, taskTracking.taskTrackingType).map(TARGET_DATE, taskTracking.targetDate)
				.map(ASSIGN_DATE, taskTracking.assignDate).map(COMPLETE_DATE, taskTracking.completeDate)
				.map(REFERENCE, taskTracking.reference).map(MEMO, taskTracking.memo)
				.map(TASK_OWNER, taskTracking.taskOwner).map(SUPPORT_VENDOR, taskTracking.supportVendor)
				.map(RECORD_STATUS, taskTracking.recordStatus).map(LAST_MODIFIED_DATE, taskTracking.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTracking.lastModifiedBy).map(CREATED_DATE, taskTracking.createdDate)
				.map(CREATED_BY, taskTracking.createdBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTracking);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskOwner
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTracking> findByTaskOwner(Employee taskOwner, GlobalSearch globalSearch, Pageable pageable) {
		QTaskTracking taskTracking = QTaskTracking.taskTracking;
		JPQLQuery<TaskTracking> query = from(taskTracking);
		Assert.notNull(taskOwner, "taskOwner is required");
		query.where(taskTracking.taskOwner.eq(taskOwner));
		Path<?>[] paths = new Path<?>[] { taskTracking.submitDate, taskTracking.submitter, taskTracking.technicalObject,
				taskTracking.description, taskTracking.taskTrackingPriority, taskTracking.taskTrackingStatus,
				taskTracking.taskTrackingType, taskTracking.targetDate, taskTracking.assignDate,
				taskTracking.completeDate, taskTracking.reference, taskTracking.memo, taskTracking.taskOwner,
				taskTracking.supportVendor, taskTracking.recordStatus, taskTracking.lastModifiedDate,
				taskTracking.lastModifiedBy, taskTracking.createdDate, taskTracking.createdBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SUBMIT_DATE, taskTracking.submitDate)
				.map(SUBMITTER, taskTracking.submitter).map(TECHNICAL_OBJECT, taskTracking.technicalObject)
				.map(DESCRIPTION, taskTracking.description)
				.map(TASK_TRACKING_PRIORITY, taskTracking.taskTrackingPriority)
				.map(TASK_TRACKING_STATUS, taskTracking.taskTrackingStatus)
				.map(TASK_TRACKING_TYPE, taskTracking.taskTrackingType).map(TARGET_DATE, taskTracking.targetDate)
				.map(ASSIGN_DATE, taskTracking.assignDate).map(COMPLETE_DATE, taskTracking.completeDate)
				.map(REFERENCE, taskTracking.reference).map(MEMO, taskTracking.memo)
				.map(TASK_OWNER, taskTracking.taskOwner).map(SUPPORT_VENDOR, taskTracking.supportVendor)
				.map(RECORD_STATUS, taskTracking.recordStatus).map(LAST_MODIFIED_DATE, taskTracking.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTracking.lastModifiedBy).map(CREATED_DATE, taskTracking.createdDate)
				.map(CREATED_BY, taskTracking.createdBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTracking);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingPriority
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTracking> findByTaskTrackingPriority(TaskTrackingPriority taskTrackingPriority,
			GlobalSearch globalSearch, Pageable pageable) {
		QTaskTracking taskTracking = QTaskTracking.taskTracking;
		JPQLQuery<TaskTracking> query = from(taskTracking);
		Assert.notNull(taskTrackingPriority, "taskTrackingPriority is required");
		query.where(taskTracking.taskTrackingPriority.eq(taskTrackingPriority));
		Path<?>[] paths = new Path<?>[] { taskTracking.submitDate, taskTracking.submitter, taskTracking.technicalObject,
				taskTracking.description, taskTracking.taskTrackingPriority, taskTracking.taskTrackingStatus,
				taskTracking.taskTrackingType, taskTracking.targetDate, taskTracking.assignDate,
				taskTracking.completeDate, taskTracking.reference, taskTracking.memo, taskTracking.taskOwner,
				taskTracking.supportVendor, taskTracking.recordStatus, taskTracking.lastModifiedDate,
				taskTracking.lastModifiedBy, taskTracking.createdDate, taskTracking.createdBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SUBMIT_DATE, taskTracking.submitDate)
				.map(SUBMITTER, taskTracking.submitter).map(TECHNICAL_OBJECT, taskTracking.technicalObject)
				.map(DESCRIPTION, taskTracking.description)
				.map(TASK_TRACKING_PRIORITY, taskTracking.taskTrackingPriority)
				.map(TASK_TRACKING_STATUS, taskTracking.taskTrackingStatus)
				.map(TASK_TRACKING_TYPE, taskTracking.taskTrackingType).map(TARGET_DATE, taskTracking.targetDate)
				.map(ASSIGN_DATE, taskTracking.assignDate).map(COMPLETE_DATE, taskTracking.completeDate)
				.map(REFERENCE, taskTracking.reference).map(MEMO, taskTracking.memo)
				.map(TASK_OWNER, taskTracking.taskOwner).map(SUPPORT_VENDOR, taskTracking.supportVendor)
				.map(RECORD_STATUS, taskTracking.recordStatus).map(LAST_MODIFIED_DATE, taskTracking.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTracking.lastModifiedBy).map(CREATED_DATE, taskTracking.createdDate)
				.map(CREATED_BY, taskTracking.createdBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTracking);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTracking> findByTaskTrackingStatus(TaskTrackingStatus taskTrackingStatus, GlobalSearch globalSearch,
			Pageable pageable) {
		QTaskTracking taskTracking = QTaskTracking.taskTracking;
		JPQLQuery<TaskTracking> query = from(taskTracking);
		Assert.notNull(taskTrackingStatus, "taskTrackingStatus is required");
		query.where(taskTracking.taskTrackingStatus.eq(taskTrackingStatus));
		Path<?>[] paths = new Path<?>[] { taskTracking.submitDate, taskTracking.submitter, taskTracking.technicalObject,
				taskTracking.description, taskTracking.taskTrackingPriority, taskTracking.taskTrackingStatus,
				taskTracking.taskTrackingType, taskTracking.targetDate, taskTracking.assignDate,
				taskTracking.completeDate, taskTracking.reference, taskTracking.memo, taskTracking.taskOwner,
				taskTracking.supportVendor, taskTracking.recordStatus, taskTracking.lastModifiedDate,
				taskTracking.lastModifiedBy, taskTracking.createdDate, taskTracking.createdBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SUBMIT_DATE, taskTracking.submitDate)
				.map(SUBMITTER, taskTracking.submitter).map(TECHNICAL_OBJECT, taskTracking.technicalObject)
				.map(DESCRIPTION, taskTracking.description)
				.map(TASK_TRACKING_PRIORITY, taskTracking.taskTrackingPriority)
				.map(TASK_TRACKING_STATUS, taskTracking.taskTrackingStatus)
				.map(TASK_TRACKING_TYPE, taskTracking.taskTrackingType).map(TARGET_DATE, taskTracking.targetDate)
				.map(ASSIGN_DATE, taskTracking.assignDate).map(COMPLETE_DATE, taskTracking.completeDate)
				.map(REFERENCE, taskTracking.reference).map(MEMO, taskTracking.memo)
				.map(TASK_OWNER, taskTracking.taskOwner).map(SUPPORT_VENDOR, taskTracking.supportVendor)
				.map(RECORD_STATUS, taskTracking.recordStatus).map(LAST_MODIFIED_DATE, taskTracking.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTracking.lastModifiedBy).map(CREATED_DATE, taskTracking.createdDate)
				.map(CREATED_BY, taskTracking.createdBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTracking);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskTracking> findByTaskTrackingType(TaskTrackingType taskTrackingType, GlobalSearch globalSearch,
			Pageable pageable) {
		QTaskTracking taskTracking = QTaskTracking.taskTracking;
		JPQLQuery<TaskTracking> query = from(taskTracking);
		Assert.notNull(taskTrackingType, "taskTrackingType is required");
		query.where(taskTracking.taskTrackingType.eq(taskTrackingType));
		Path<?>[] paths = new Path<?>[] { taskTracking.submitDate, taskTracking.submitter, taskTracking.technicalObject,
				taskTracking.description, taskTracking.taskTrackingPriority, taskTracking.taskTrackingStatus,
				taskTracking.taskTrackingType, taskTracking.targetDate, taskTracking.assignDate,
				taskTracking.completeDate, taskTracking.reference, taskTracking.memo, taskTracking.taskOwner,
				taskTracking.supportVendor, taskTracking.recordStatus, taskTracking.lastModifiedDate,
				taskTracking.lastModifiedBy, taskTracking.createdDate, taskTracking.createdBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SUBMIT_DATE, taskTracking.submitDate)
				.map(SUBMITTER, taskTracking.submitter).map(TECHNICAL_OBJECT, taskTracking.technicalObject)
				.map(DESCRIPTION, taskTracking.description)
				.map(TASK_TRACKING_PRIORITY, taskTracking.taskTrackingPriority)
				.map(TASK_TRACKING_STATUS, taskTracking.taskTrackingStatus)
				.map(TASK_TRACKING_TYPE, taskTracking.taskTrackingType).map(TARGET_DATE, taskTracking.targetDate)
				.map(ASSIGN_DATE, taskTracking.assignDate).map(COMPLETE_DATE, taskTracking.completeDate)
				.map(REFERENCE, taskTracking.reference).map(MEMO, taskTracking.memo)
				.map(TASK_OWNER, taskTracking.taskOwner).map(SUPPORT_VENDOR, taskTracking.supportVendor)
				.map(RECORD_STATUS, taskTracking.recordStatus).map(LAST_MODIFIED_DATE, taskTracking.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskTracking.lastModifiedBy).map(CREATED_DATE, taskTracking.createdDate)
				.map(CREATED_BY, taskTracking.createdBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskTracking);
	}
}
