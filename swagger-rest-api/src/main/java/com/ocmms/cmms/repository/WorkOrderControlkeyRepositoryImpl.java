package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderControlkey;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderControlkeyRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderControlkeyRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderControlkey>
		implements WorkOrderControlkeyRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderControlkeyRepositoryImpl() {
		super(WorkOrderControlkey.class);
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
	public Page<WorkOrderControlkey> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderControlkey workOrderControlkey = QWorkOrderControlkey.workOrderControlkey;
		JPQLQuery<WorkOrderControlkey> query = from(workOrderControlkey);
		Path<?>[] paths = new Path<?>[] { workOrderControlkey.code, workOrderControlkey.description,
				workOrderControlkey.recordStatus, workOrderControlkey.createdDate, workOrderControlkey.createdBy,
				workOrderControlkey.lastModifiedDate, workOrderControlkey.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderControlkey.code)
				.map(DESCRIPTION, workOrderControlkey.description).map(RECORD_STATUS, workOrderControlkey.recordStatus)
				.map(CREATED_DATE, workOrderControlkey.createdDate).map(CREATED_BY, workOrderControlkey.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderControlkey.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderControlkey.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderControlkey);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderControlkey> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderControlkey workOrderControlkey = QWorkOrderControlkey.workOrderControlkey;
		JPQLQuery<WorkOrderControlkey> query = from(workOrderControlkey);
		Path<?>[] paths = new Path<?>[] { workOrderControlkey.code, workOrderControlkey.description,
				workOrderControlkey.recordStatus, workOrderControlkey.createdDate, workOrderControlkey.createdBy,
				workOrderControlkey.lastModifiedDate, workOrderControlkey.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderControlkey.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workOrderControlkey.code)
				.map(DESCRIPTION, workOrderControlkey.description).map(RECORD_STATUS, workOrderControlkey.recordStatus)
				.map(CREATED_DATE, workOrderControlkey.createdDate).map(CREATED_BY, workOrderControlkey.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderControlkey.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderControlkey.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderControlkey);
	}
}
