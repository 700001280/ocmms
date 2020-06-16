package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoDetailType;
import com.ocmms.cmms.model.loto.QLotoDetailType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoDetailTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class LotoDetailTypeRepositoryImpl extends QueryDslRepositorySupportExt<LotoDetailType>
		implements LotoDetailTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	LotoDetailTypeRepositoryImpl() {
		super(LotoDetailType.class);
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
	public Page<LotoDetailType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QLotoDetailType lotoDetailType = QLotoDetailType.lotoDetailType;
		JPQLQuery<LotoDetailType> query = from(lotoDetailType);
		Path<?>[] paths = new Path<?>[] { lotoDetailType.code, lotoDetailType.description, lotoDetailType.recordStatus,
				lotoDetailType.createdDate, lotoDetailType.createdBy, lotoDetailType.lastModifiedDate,
				lotoDetailType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, lotoDetailType.code)
				.map(DESCRIPTION, lotoDetailType.description).map(RECORD_STATUS, lotoDetailType.recordStatus)
				.map(CREATED_DATE, lotoDetailType.createdDate).map(CREATED_BY, lotoDetailType.createdBy)
				.map(LAST_MODIFIED_DATE, lotoDetailType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoDetailType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoDetailType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoDetailType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QLotoDetailType lotoDetailType = QLotoDetailType.lotoDetailType;
		JPQLQuery<LotoDetailType> query = from(lotoDetailType);
		Path<?>[] paths = new Path<?>[] { lotoDetailType.code, lotoDetailType.description, lotoDetailType.recordStatus,
				lotoDetailType.createdDate, lotoDetailType.createdBy, lotoDetailType.lastModifiedDate,
				lotoDetailType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(lotoDetailType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, lotoDetailType.code)
				.map(DESCRIPTION, lotoDetailType.description).map(RECORD_STATUS, lotoDetailType.recordStatus)
				.map(CREATED_DATE, lotoDetailType.createdDate).map(CREATED_BY, lotoDetailType.createdBy)
				.map(LAST_MODIFIED_DATE, lotoDetailType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoDetailType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoDetailType);
	}
}
