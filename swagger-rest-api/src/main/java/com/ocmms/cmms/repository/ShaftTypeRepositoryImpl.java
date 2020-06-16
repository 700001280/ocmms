package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ShaftType;
import com.ocmms.cmms.model.pp.configuration.QShaftType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ShaftTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ShaftTypeRepositoryImpl extends QueryDslRepositorySupportExt<ShaftType>
		implements ShaftTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	ShaftTypeRepositoryImpl() {
		super(ShaftType.class);
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
	public Page<ShaftType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QShaftType shaftType = QShaftType.shaftType;
		JPQLQuery<ShaftType> query = from(shaftType);
		Path<?>[] paths = new Path<?>[] { shaftType.code, shaftType.description, shaftType.recordStatus,
				shaftType.createdDate, shaftType.createdBy, shaftType.lastModifiedDate, shaftType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, shaftType.code)
				.map(DESCRIPTION, shaftType.description).map(RECORD_STATUS, shaftType.recordStatus)
				.map(CREATED_DATE, shaftType.createdDate).map(CREATED_BY, shaftType.createdBy)
				.map(LAST_MODIFIED_DATE, shaftType.lastModifiedDate).map(LAST_MODIFIED_BY, shaftType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, shaftType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ShaftType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QShaftType shaftType = QShaftType.shaftType;
		JPQLQuery<ShaftType> query = from(shaftType);
		Path<?>[] paths = new Path<?>[] { shaftType.code, shaftType.description, shaftType.recordStatus,
				shaftType.createdDate, shaftType.createdBy, shaftType.lastModifiedDate, shaftType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(shaftType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, shaftType.code)
				.map(DESCRIPTION, shaftType.description).map(RECORD_STATUS, shaftType.recordStatus)
				.map(CREATED_DATE, shaftType.createdDate).map(CREATED_BY, shaftType.createdBy)
				.map(LAST_MODIFIED_DATE, shaftType.lastModifiedDate).map(LAST_MODIFIED_BY, shaftType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, shaftType);
	}
}
