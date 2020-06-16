package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoDeviceType;
import com.ocmms.cmms.model.loto.QLotoDeviceType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoDeviceTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class LotoDeviceTypeRepositoryImpl extends QueryDslRepositorySupportExt<LotoDeviceType>
		implements LotoDeviceTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	LotoDeviceTypeRepositoryImpl() {
		super(LotoDeviceType.class);
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
	public Page<LotoDeviceType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QLotoDeviceType lotoDeviceType = QLotoDeviceType.lotoDeviceType;
		JPQLQuery<LotoDeviceType> query = from(lotoDeviceType);
		Path<?>[] paths = new Path<?>[] { lotoDeviceType.code, lotoDeviceType.description, lotoDeviceType.recordStatus,
				lotoDeviceType.createdDate, lotoDeviceType.createdBy, lotoDeviceType.lastModifiedDate,
				lotoDeviceType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, lotoDeviceType.code)
				.map(DESCRIPTION, lotoDeviceType.description).map(RECORD_STATUS, lotoDeviceType.recordStatus)
				.map(CREATED_DATE, lotoDeviceType.createdDate).map(CREATED_BY, lotoDeviceType.createdBy)
				.map(LAST_MODIFIED_DATE, lotoDeviceType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoDeviceType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoDeviceType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoDeviceType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QLotoDeviceType lotoDeviceType = QLotoDeviceType.lotoDeviceType;
		JPQLQuery<LotoDeviceType> query = from(lotoDeviceType);
		Path<?>[] paths = new Path<?>[] { lotoDeviceType.code, lotoDeviceType.description, lotoDeviceType.recordStatus,
				lotoDeviceType.createdDate, lotoDeviceType.createdBy, lotoDeviceType.lastModifiedDate,
				lotoDeviceType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(lotoDeviceType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, lotoDeviceType.code)
				.map(DESCRIPTION, lotoDeviceType.description).map(RECORD_STATUS, lotoDeviceType.recordStatus)
				.map(CREATED_DATE, lotoDeviceType.createdDate).map(CREATED_BY, lotoDeviceType.createdBy)
				.map(LAST_MODIFIED_DATE, lotoDeviceType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoDeviceType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoDeviceType);
	}
}
