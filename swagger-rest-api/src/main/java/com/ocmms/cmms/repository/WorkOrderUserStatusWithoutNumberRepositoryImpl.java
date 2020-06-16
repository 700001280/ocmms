package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderUserStatusWithoutNumber;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkOrderUserStatusWithoutNumberRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderUserStatusWithoutNumberRepositoryImpl
		extends QueryDslRepositorySupportExt<WorkOrderUserStatusWithoutNumber>
		implements WorkOrderUserStatusWithoutNumberRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderUserStatusWithoutNumberRepositoryImpl() {
		super(WorkOrderUserStatusWithoutNumber.class);
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
	public static final String STATUS = "status";

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
	public Page<WorkOrderUserStatusWithoutNumber> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderUserStatusWithoutNumber workOrderUserStatusWithoutNumber = QWorkOrderUserStatusWithoutNumber.workOrderUserStatusWithoutNumber;
		JPQLQuery<WorkOrderUserStatusWithoutNumber> query = from(workOrderUserStatusWithoutNumber);
		Path<?>[] paths = new Path<?>[] { workOrderUserStatusWithoutNumber.code,
				workOrderUserStatusWithoutNumber.description, workOrderUserStatusWithoutNumber.status,
				workOrderUserStatusWithoutNumber.recordStatus, workOrderUserStatusWithoutNumber.createdDate,
				workOrderUserStatusWithoutNumber.createdBy, workOrderUserStatusWithoutNumber.lastModifiedDate,
				workOrderUserStatusWithoutNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderUserStatusWithoutNumber.code)
				.map(DESCRIPTION, workOrderUserStatusWithoutNumber.description)
				.map(STATUS, workOrderUserStatusWithoutNumber.status)
				.map(RECORD_STATUS, workOrderUserStatusWithoutNumber.recordStatus)
				.map(CREATED_DATE, workOrderUserStatusWithoutNumber.createdDate)
				.map(CREATED_BY, workOrderUserStatusWithoutNumber.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderUserStatusWithoutNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderUserStatusWithoutNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderUserStatusWithoutNumber);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderUserStatusWithoutNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderUserStatusWithoutNumber workOrderUserStatusWithoutNumber = QWorkOrderUserStatusWithoutNumber.workOrderUserStatusWithoutNumber;
		JPQLQuery<WorkOrderUserStatusWithoutNumber> query = from(workOrderUserStatusWithoutNumber);
		Path<?>[] paths = new Path<?>[] { workOrderUserStatusWithoutNumber.code,
				workOrderUserStatusWithoutNumber.description, workOrderUserStatusWithoutNumber.status,
				workOrderUserStatusWithoutNumber.recordStatus, workOrderUserStatusWithoutNumber.createdDate,
				workOrderUserStatusWithoutNumber.createdBy, workOrderUserStatusWithoutNumber.lastModifiedDate,
				workOrderUserStatusWithoutNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderUserStatusWithoutNumber.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderUserStatusWithoutNumber.code)
				.map(DESCRIPTION, workOrderUserStatusWithoutNumber.description)
				.map(STATUS, workOrderUserStatusWithoutNumber.status)
				.map(RECORD_STATUS, workOrderUserStatusWithoutNumber.recordStatus)
				.map(CREATED_DATE, workOrderUserStatusWithoutNumber.createdDate)
				.map(CREATED_BY, workOrderUserStatusWithoutNumber.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderUserStatusWithoutNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderUserStatusWithoutNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderUserStatusWithoutNumber);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeaders
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderUserStatusWithoutNumber> findByWorkOrderHeadersContains(WorkOrderHeader workOrderHeaders,
			GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderUserStatusWithoutNumber workOrderUserStatusWithoutNumber = QWorkOrderUserStatusWithoutNumber.workOrderUserStatusWithoutNumber;
		JPQLQuery<WorkOrderUserStatusWithoutNumber> query = from(workOrderUserStatusWithoutNumber);
		Assert.notNull(workOrderHeaders, "workOrderHeaders is required");
		query.where(workOrderUserStatusWithoutNumber.workOrderHeaders.contains(workOrderHeaders));
		Path<?>[] paths = new Path<?>[] { workOrderUserStatusWithoutNumber.code,
				workOrderUserStatusWithoutNumber.description, workOrderUserStatusWithoutNumber.status,
				workOrderUserStatusWithoutNumber.recordStatus, workOrderUserStatusWithoutNumber.createdDate,
				workOrderUserStatusWithoutNumber.createdBy, workOrderUserStatusWithoutNumber.lastModifiedDate,
				workOrderUserStatusWithoutNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderUserStatusWithoutNumber.code)
				.map(DESCRIPTION, workOrderUserStatusWithoutNumber.description)
				.map(STATUS, workOrderUserStatusWithoutNumber.status)
				.map(RECORD_STATUS, workOrderUserStatusWithoutNumber.recordStatus)
				.map(CREATED_DATE, workOrderUserStatusWithoutNumber.createdDate)
				.map(CREATED_BY, workOrderUserStatusWithoutNumber.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderUserStatusWithoutNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderUserStatusWithoutNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderUserStatusWithoutNumber);
	}
}
