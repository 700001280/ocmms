package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderTimeSheet;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkOrderTimeSheetRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderTimeSheetRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderTimeSheet>
		implements WorkOrderTimeSheetRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderTimeSheetRepositoryImpl() {
		super(WorkOrderTimeSheet.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_ORDER_OPERATION = "workOrderOperation";

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
	public static final String WORKER = "worker";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_HOURS = "workHours";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String APPROVER = "approver";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_DATE = "workDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String APPROVE_DATE = "approveDate";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderTimeSheet> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderTimeSheet workOrderTimeSheet = QWorkOrderTimeSheet.workOrderTimeSheet;
		JPQLQuery<WorkOrderTimeSheet> query = from(workOrderTimeSheet);
		Path<?>[] paths = new Path<?>[] { workOrderTimeSheet.workOrderOperation, workOrderTimeSheet.worker,
				workOrderTimeSheet.workHours, workOrderTimeSheet.workDate, workOrderTimeSheet.approver,
				workOrderTimeSheet.approveDate, workOrderTimeSheet.recordStatus, workOrderTimeSheet.createdDate,
				workOrderTimeSheet.createdBy, workOrderTimeSheet.lastModifiedDate, workOrderTimeSheet.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_OPERATION, workOrderTimeSheet.workOrderOperation)
				.map(WORKER, workOrderTimeSheet.worker).map(WORK_HOURS, workOrderTimeSheet.workHours)
				.map(WORK_DATE, workOrderTimeSheet.workDate).map(APPROVER, workOrderTimeSheet.approver)
				.map(APPROVE_DATE, workOrderTimeSheet.approveDate).map(RECORD_STATUS, workOrderTimeSheet.recordStatus)
				.map(CREATED_DATE, workOrderTimeSheet.createdDate).map(CREATED_BY, workOrderTimeSheet.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderTimeSheet.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderTimeSheet.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderTimeSheet);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderTimeSheet> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderTimeSheet workOrderTimeSheet = QWorkOrderTimeSheet.workOrderTimeSheet;
		JPQLQuery<WorkOrderTimeSheet> query = from(workOrderTimeSheet);
		Path<?>[] paths = new Path<?>[] { workOrderTimeSheet.workOrderOperation, workOrderTimeSheet.worker,
				workOrderTimeSheet.workHours, workOrderTimeSheet.workDate, workOrderTimeSheet.approver,
				workOrderTimeSheet.approveDate, workOrderTimeSheet.recordStatus, workOrderTimeSheet.createdDate,
				workOrderTimeSheet.createdBy, workOrderTimeSheet.lastModifiedDate, workOrderTimeSheet.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderTimeSheet.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_OPERATION, workOrderTimeSheet.workOrderOperation)
				.map(WORKER, workOrderTimeSheet.worker).map(WORK_HOURS, workOrderTimeSheet.workHours)
				.map(WORK_DATE, workOrderTimeSheet.workDate).map(APPROVER, workOrderTimeSheet.approver)
				.map(APPROVE_DATE, workOrderTimeSheet.approveDate).map(RECORD_STATUS, workOrderTimeSheet.recordStatus)
				.map(CREATED_DATE, workOrderTimeSheet.createdDate).map(CREATED_BY, workOrderTimeSheet.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderTimeSheet.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderTimeSheet.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderTimeSheet);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderOperation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderTimeSheet> findByWorkOrderOperation(WorkOrderOperation workOrderOperation,
			GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderTimeSheet workOrderTimeSheet = QWorkOrderTimeSheet.workOrderTimeSheet;
		JPQLQuery<WorkOrderTimeSheet> query = from(workOrderTimeSheet);
		Assert.notNull(workOrderOperation, "workOrderOperation is required");
		query.where(workOrderTimeSheet.workOrderOperation.eq(workOrderOperation));
		Path<?>[] paths = new Path<?>[] { workOrderTimeSheet.workOrderOperation, workOrderTimeSheet.worker,
				workOrderTimeSheet.workHours, workOrderTimeSheet.workDate, workOrderTimeSheet.approver,
				workOrderTimeSheet.approveDate, workOrderTimeSheet.recordStatus, workOrderTimeSheet.createdDate,
				workOrderTimeSheet.createdBy, workOrderTimeSheet.lastModifiedDate, workOrderTimeSheet.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER_OPERATION, workOrderTimeSheet.workOrderOperation)
				.map(WORKER, workOrderTimeSheet.worker).map(WORK_HOURS, workOrderTimeSheet.workHours)
				.map(WORK_DATE, workOrderTimeSheet.workDate).map(APPROVER, workOrderTimeSheet.approver)
				.map(APPROVE_DATE, workOrderTimeSheet.approveDate).map(RECORD_STATUS, workOrderTimeSheet.recordStatus)
				.map(CREATED_DATE, workOrderTimeSheet.createdDate).map(CREATED_BY, workOrderTimeSheet.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderTimeSheet.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderTimeSheet.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderTimeSheet);
	}
}
