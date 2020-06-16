package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.InstockType;
import com.ocmms.cmms.model.mm.master.QInstockType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = InstockTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class InstockTypeRepositoryImpl extends QueryDslRepositorySupportExt<InstockType>
		implements InstockTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	InstockTypeRepositoryImpl() {
		super(InstockType.class);
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
	public Page<InstockType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QInstockType instockType = QInstockType.instockType;
		JPQLQuery<InstockType> query = from(instockType);
		Path<?>[] paths = new Path<?>[] { instockType.description, instockType.type, instockType.recordStatus,
				instockType.createdDate, instockType.createdBy, instockType.lastModifiedDate,
				instockType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, instockType.description)
				.map(TYPE, instockType.type).map(RECORD_STATUS, instockType.recordStatus)
				.map(CREATED_DATE, instockType.createdDate).map(CREATED_BY, instockType.createdBy)
				.map(LAST_MODIFIED_DATE, instockType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<InstockType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QInstockType instockType = QInstockType.instockType;
		JPQLQuery<InstockType> query = from(instockType);
		Path<?>[] paths = new Path<?>[] { instockType.description, instockType.type, instockType.recordStatus,
				instockType.createdDate, instockType.createdBy, instockType.lastModifiedDate,
				instockType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(instockType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, instockType.description)
				.map(TYPE, instockType.type).map(RECORD_STATUS, instockType.recordStatus)
				.map(CREATED_DATE, instockType.createdDate).map(CREATED_BY, instockType.createdBy)
				.map(LAST_MODIFIED_DATE, instockType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockType);
	}
}
