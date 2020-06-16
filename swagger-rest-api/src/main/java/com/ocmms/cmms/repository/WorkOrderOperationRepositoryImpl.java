package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderOperation;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkOrderOperationRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderOperationRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderOperation>
		implements WorkOrderOperationRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderOperationRepositoryImpl() {
		super(WorkOrderOperation.class);
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
	public static final String OPERATIONAL_WORK_CENTER = "operationalWorkCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_ORDER = "workOrder";

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
	public static final String WORKER_NUMBER = "workerNumber";

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
	public static final String PLAN_WORKER_HOURS = "planWorkerHours";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OPERATION_RELATIONSHIP = "operationRelationship";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderOperation> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderOperation workOrderOperation = QWorkOrderOperation.workOrderOperation;
		JPQLQuery<WorkOrderOperation> query = from(workOrderOperation);
		Path<?>[] paths = new Path<?>[] { workOrderOperation.workOrder, workOrderOperation.operationalWorkCenter,
				workOrderOperation.operationRelationship, workOrderOperation.description,
				workOrderOperation.workerNumber, workOrderOperation.planWorkerHours, workOrderOperation.recordStatus,
				workOrderOperation.createdDate, workOrderOperation.createdBy, workOrderOperation.lastModifiedDate,
				workOrderOperation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER, workOrderOperation.workOrder)
				.map(OPERATIONAL_WORK_CENTER, workOrderOperation.operationalWorkCenter)
				.map(OPERATION_RELATIONSHIP, workOrderOperation.operationRelationship)
				.map(DESCRIPTION, workOrderOperation.description).map(WORKER_NUMBER, workOrderOperation.workerNumber)
				.map(PLAN_WORKER_HOURS, workOrderOperation.planWorkerHours)
				.map(RECORD_STATUS, workOrderOperation.recordStatus).map(CREATED_DATE, workOrderOperation.createdDate)
				.map(CREATED_BY, workOrderOperation.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderOperation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderOperation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderOperation);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderOperation> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderOperation workOrderOperation = QWorkOrderOperation.workOrderOperation;
		JPQLQuery<WorkOrderOperation> query = from(workOrderOperation);
		Path<?>[] paths = new Path<?>[] { workOrderOperation.workOrder, workOrderOperation.operationalWorkCenter,
				workOrderOperation.operationRelationship, workOrderOperation.description,
				workOrderOperation.workerNumber, workOrderOperation.planWorkerHours, workOrderOperation.recordStatus,
				workOrderOperation.createdDate, workOrderOperation.createdBy, workOrderOperation.lastModifiedDate,
				workOrderOperation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderOperation.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER, workOrderOperation.workOrder)
				.map(OPERATIONAL_WORK_CENTER, workOrderOperation.operationalWorkCenter)
				.map(OPERATION_RELATIONSHIP, workOrderOperation.operationRelationship)
				.map(DESCRIPTION, workOrderOperation.description).map(WORKER_NUMBER, workOrderOperation.workerNumber)
				.map(PLAN_WORKER_HOURS, workOrderOperation.planWorkerHours)
				.map(RECORD_STATUS, workOrderOperation.recordStatus).map(CREATED_DATE, workOrderOperation.createdDate)
				.map(CREATED_BY, workOrderOperation.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderOperation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderOperation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderOperation);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderOperation> findByWorkOrder(WorkOrderHeader workOrder, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderOperation workOrderOperation = QWorkOrderOperation.workOrderOperation;
		JPQLQuery<WorkOrderOperation> query = from(workOrderOperation);
		Assert.notNull(workOrder, "workOrder is required");
		query.where(workOrderOperation.workOrder.eq(workOrder));
		Path<?>[] paths = new Path<?>[] { workOrderOperation.workOrder, workOrderOperation.operationalWorkCenter,
				workOrderOperation.operationRelationship, workOrderOperation.description,
				workOrderOperation.workerNumber, workOrderOperation.planWorkerHours, workOrderOperation.recordStatus,
				workOrderOperation.createdDate, workOrderOperation.createdBy, workOrderOperation.lastModifiedDate,
				workOrderOperation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER, workOrderOperation.workOrder)
				.map(OPERATIONAL_WORK_CENTER, workOrderOperation.operationalWorkCenter)
				.map(OPERATION_RELATIONSHIP, workOrderOperation.operationRelationship)
				.map(DESCRIPTION, workOrderOperation.description).map(WORKER_NUMBER, workOrderOperation.workerNumber)
				.map(PLAN_WORKER_HOURS, workOrderOperation.planWorkerHours)
				.map(RECORD_STATUS, workOrderOperation.recordStatus).map(CREATED_DATE, workOrderOperation.createdDate)
				.map(CREATED_BY, workOrderOperation.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderOperation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderOperation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderOperation);
	}
}
