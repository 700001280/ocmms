package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderTypeRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderType>
		implements WorkOrderTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderTypeRepositoryImpl() {
		super(WorkOrderType.class);
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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TYPE = "type";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderType workOrderType = QWorkOrderType.workOrderType;
		JPQLQuery<WorkOrderType> query = from(workOrderType);
		Path<?>[] paths = new Path<?>[] { workOrderType.type, workOrderType.description, workOrderType.recordStatus,
				workOrderType.createdDate, workOrderType.createdBy, workOrderType.lastModifiedDate,
				workOrderType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, workOrderType.type)
				.map(DESCRIPTION, workOrderType.description).map(RECORD_STATUS, workOrderType.recordStatus)
				.map(CREATED_DATE, workOrderType.createdDate).map(CREATED_BY, workOrderType.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderType workOrderType = QWorkOrderType.workOrderType;
		JPQLQuery<WorkOrderType> query = from(workOrderType);
		Path<?>[] paths = new Path<?>[] { workOrderType.type, workOrderType.description, workOrderType.recordStatus,
				workOrderType.createdDate, workOrderType.createdBy, workOrderType.lastModifiedDate,
				workOrderType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, workOrderType.type)
				.map(DESCRIPTION, workOrderType.description).map(RECORD_STATUS, workOrderType.recordStatus)
				.map(CREATED_DATE, workOrderType.createdDate).map(CREATED_BY, workOrderType.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderType);
	}
}
