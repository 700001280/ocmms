package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.WorkLogType;
import com.ocmms.cmms.model.assistance.QWorkLogType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkLogTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkLogTypeRepositoryImpl extends QueryDslRepositorySupportExt<WorkLogType>
		implements WorkLogTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkLogTypeRepositoryImpl() {
		super(WorkLogType.class);
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
	public Page<WorkLogType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkLogType workLogType = QWorkLogType.workLogType;
		JPQLQuery<WorkLogType> query = from(workLogType);
		Path<?>[] paths = new Path<?>[] { workLogType.code, workLogType.description, workLogType.recordStatus,
				workLogType.createdDate, workLogType.createdBy, workLogType.lastModifiedDate,
				workLogType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workLogType.code)
				.map(DESCRIPTION, workLogType.description).map(RECORD_STATUS, workLogType.recordStatus)
				.map(CREATED_DATE, workLogType.createdDate).map(CREATED_BY, workLogType.createdBy)
				.map(LAST_MODIFIED_DATE, workLogType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workLogType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workLogType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkLogType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkLogType workLogType = QWorkLogType.workLogType;
		JPQLQuery<WorkLogType> query = from(workLogType);
		Path<?>[] paths = new Path<?>[] { workLogType.code, workLogType.description, workLogType.recordStatus,
				workLogType.createdDate, workLogType.createdBy, workLogType.lastModifiedDate,
				workLogType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workLogType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, workLogType.code)
				.map(DESCRIPTION, workLogType.description).map(RECORD_STATUS, workLogType.recordStatus)
				.map(CREATED_DATE, workLogType.createdDate).map(CREATED_BY, workLogType.createdBy)
				.map(LAST_MODIFIED_DATE, workLogType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workLogType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workLogType);
	}
}
