package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderUserStatusWithNumber;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderUserStatusWithNumberRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderUserStatusWithNumberRepositoryImpl
		extends QueryDslRepositorySupportExt<WorkOrderUserStatusWithNumber>
		implements WorkOrderUserStatusWithNumberRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderUserStatusWithNumberRepositoryImpl() {
		super(WorkOrderUserStatusWithNumber.class);
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
	public Page<WorkOrderUserStatusWithNumber> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderUserStatusWithNumber workOrderUserStatusWithNumber = QWorkOrderUserStatusWithNumber.workOrderUserStatusWithNumber;
		JPQLQuery<WorkOrderUserStatusWithNumber> query = from(workOrderUserStatusWithNumber);
		Path<?>[] paths = new Path<?>[] { workOrderUserStatusWithNumber.code, workOrderUserStatusWithNumber.description,
				workOrderUserStatusWithNumber.status, workOrderUserStatusWithNumber.recordStatus,
				workOrderUserStatusWithNumber.createdDate, workOrderUserStatusWithNumber.createdBy,
				workOrderUserStatusWithNumber.lastModifiedDate, workOrderUserStatusWithNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderUserStatusWithNumber.code)
				.map(DESCRIPTION, workOrderUserStatusWithNumber.description)
				.map(STATUS, workOrderUserStatusWithNumber.status)
				.map(RECORD_STATUS, workOrderUserStatusWithNumber.recordStatus)
				.map(CREATED_DATE, workOrderUserStatusWithNumber.createdDate)
				.map(CREATED_BY, workOrderUserStatusWithNumber.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderUserStatusWithNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderUserStatusWithNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderUserStatusWithNumber);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderUserStatusWithNumber> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderUserStatusWithNumber workOrderUserStatusWithNumber = QWorkOrderUserStatusWithNumber.workOrderUserStatusWithNumber;
		JPQLQuery<WorkOrderUserStatusWithNumber> query = from(workOrderUserStatusWithNumber);
		Path<?>[] paths = new Path<?>[] { workOrderUserStatusWithNumber.code, workOrderUserStatusWithNumber.description,
				workOrderUserStatusWithNumber.status, workOrderUserStatusWithNumber.recordStatus,
				workOrderUserStatusWithNumber.createdDate, workOrderUserStatusWithNumber.createdBy,
				workOrderUserStatusWithNumber.lastModifiedDate, workOrderUserStatusWithNumber.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderUserStatusWithNumber.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderUserStatusWithNumber.code)
				.map(DESCRIPTION, workOrderUserStatusWithNumber.description)
				.map(STATUS, workOrderUserStatusWithNumber.status)
				.map(RECORD_STATUS, workOrderUserStatusWithNumber.recordStatus)
				.map(CREATED_DATE, workOrderUserStatusWithNumber.createdDate)
				.map(CREATED_BY, workOrderUserStatusWithNumber.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderUserStatusWithNumber.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderUserStatusWithNumber.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderUserStatusWithNumber);
	}
}
