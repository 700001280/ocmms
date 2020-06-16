package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderSystemStatus;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkOrderSystemStatusRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderSystemStatusRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderSystemStatus>
		implements WorkOrderSystemStatusRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderSystemStatusRepositoryImpl() {
		super(WorkOrderSystemStatus.class);
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
	public Page<WorkOrderSystemStatus> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderSystemStatus workOrderSystemStatus = QWorkOrderSystemStatus.workOrderSystemStatus;
		JPQLQuery<WorkOrderSystemStatus> query = from(workOrderSystemStatus);
		Path<?>[] paths = new Path<?>[] { workOrderSystemStatus.code, workOrderSystemStatus.description,
				workOrderSystemStatus.recordStatus, workOrderSystemStatus.createdDate, workOrderSystemStatus.createdBy,
				workOrderSystemStatus.lastModifiedDate, workOrderSystemStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderSystemStatus.code)
				.map(DESCRIPTION, workOrderSystemStatus.description)
				.map(RECORD_STATUS, workOrderSystemStatus.recordStatus)
				.map(CREATED_DATE, workOrderSystemStatus.createdDate).map(CREATED_BY, workOrderSystemStatus.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderSystemStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderSystemStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderSystemStatus);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderSystemStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderSystemStatus workOrderSystemStatus = QWorkOrderSystemStatus.workOrderSystemStatus;
		JPQLQuery<WorkOrderSystemStatus> query = from(workOrderSystemStatus);
		Path<?>[] paths = new Path<?>[] { workOrderSystemStatus.code, workOrderSystemStatus.description,
				workOrderSystemStatus.recordStatus, workOrderSystemStatus.createdDate, workOrderSystemStatus.createdBy,
				workOrderSystemStatus.lastModifiedDate, workOrderSystemStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderSystemStatus.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderSystemStatus.code)
				.map(DESCRIPTION, workOrderSystemStatus.description)
				.map(RECORD_STATUS, workOrderSystemStatus.recordStatus)
				.map(CREATED_DATE, workOrderSystemStatus.createdDate).map(CREATED_BY, workOrderSystemStatus.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderSystemStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderSystemStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderSystemStatus);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeaders
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderSystemStatus> findByWorkOrderHeadersContains(WorkOrderHeader workOrderHeaders,
			GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderSystemStatus workOrderSystemStatus = QWorkOrderSystemStatus.workOrderSystemStatus;
		JPQLQuery<WorkOrderSystemStatus> query = from(workOrderSystemStatus);
		Assert.notNull(workOrderHeaders, "workOrderHeaders is required");
		query.where(workOrderSystemStatus.workOrderHeaders.contains(workOrderHeaders));
		Path<?>[] paths = new Path<?>[] { workOrderSystemStatus.code, workOrderSystemStatus.description,
				workOrderSystemStatus.recordStatus, workOrderSystemStatus.createdDate, workOrderSystemStatus.createdBy,
				workOrderSystemStatus.lastModifiedDate, workOrderSystemStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderSystemStatus.code)
				.map(DESCRIPTION, workOrderSystemStatus.description)
				.map(RECORD_STATUS, workOrderSystemStatus.recordStatus)
				.map(CREATED_DATE, workOrderSystemStatus.createdDate).map(CREATED_BY, workOrderSystemStatus.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderSystemStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderSystemStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderSystemStatus);
	}
}
