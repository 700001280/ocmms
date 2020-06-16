package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.PriorityType;
import com.ocmms.cmms.model.mm.procurement.QPriorityType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PriorityTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PriorityTypeRepositoryImpl extends QueryDslRepositorySupportExt<PriorityType>
		implements PriorityTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	PriorityTypeRepositoryImpl() {
		super(PriorityType.class);
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
	public Page<PriorityType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPriorityType priorityType = QPriorityType.priorityType;
		JPQLQuery<PriorityType> query = from(priorityType);
		Path<?>[] paths = new Path<?>[] { priorityType.description, priorityType.code, priorityType.recordStatus,
				priorityType.createdDate, priorityType.createdBy, priorityType.lastModifiedDate,
				priorityType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, priorityType.description)
				.map(CODE, priorityType.code).map(RECORD_STATUS, priorityType.recordStatus)
				.map(CREATED_DATE, priorityType.createdDate).map(CREATED_BY, priorityType.createdBy)
				.map(LAST_MODIFIED_DATE, priorityType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, priorityType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, priorityType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PriorityType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPriorityType priorityType = QPriorityType.priorityType;
		JPQLQuery<PriorityType> query = from(priorityType);
		Path<?>[] paths = new Path<?>[] { priorityType.description, priorityType.code, priorityType.recordStatus,
				priorityType.createdDate, priorityType.createdBy, priorityType.lastModifiedDate,
				priorityType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(priorityType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, priorityType.description)
				.map(CODE, priorityType.code).map(RECORD_STATUS, priorityType.recordStatus)
				.map(CREATED_DATE, priorityType.createdDate).map(CREATED_BY, priorityType.createdBy)
				.map(LAST_MODIFIED_DATE, priorityType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, priorityType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, priorityType);
	}
}
