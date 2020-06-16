package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.IsolationMethod;
import com.ocmms.cmms.model.loto.QIsolationMethod;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = IsolationMethodRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class IsolationMethodRepositoryImpl extends QueryDslRepositorySupportExt<IsolationMethod>
		implements IsolationMethodRepositoryCustom {

	/**
	 * Default constructor
	 */
	IsolationMethodRepositoryImpl() {
		super(IsolationMethod.class);
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
	public Page<IsolationMethod> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QIsolationMethod isolationMethod = QIsolationMethod.isolationMethod;
		JPQLQuery<IsolationMethod> query = from(isolationMethod);
		Path<?>[] paths = new Path<?>[] { isolationMethod.code, isolationMethod.description,
				isolationMethod.recordStatus, isolationMethod.createdDate, isolationMethod.createdBy,
				isolationMethod.lastModifiedDate, isolationMethod.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, isolationMethod.code)
				.map(DESCRIPTION, isolationMethod.description).map(RECORD_STATUS, isolationMethod.recordStatus)
				.map(CREATED_DATE, isolationMethod.createdDate).map(CREATED_BY, isolationMethod.createdBy)
				.map(LAST_MODIFIED_DATE, isolationMethod.lastModifiedDate)
				.map(LAST_MODIFIED_BY, isolationMethod.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, isolationMethod);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<IsolationMethod> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QIsolationMethod isolationMethod = QIsolationMethod.isolationMethod;
		JPQLQuery<IsolationMethod> query = from(isolationMethod);
		Path<?>[] paths = new Path<?>[] { isolationMethod.code, isolationMethod.description,
				isolationMethod.recordStatus, isolationMethod.createdDate, isolationMethod.createdBy,
				isolationMethod.lastModifiedDate, isolationMethod.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(isolationMethod.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, isolationMethod.code)
				.map(DESCRIPTION, isolationMethod.description).map(RECORD_STATUS, isolationMethod.recordStatus)
				.map(CREATED_DATE, isolationMethod.createdDate).map(CREATED_BY, isolationMethod.createdBy)
				.map(LAST_MODIFIED_DATE, isolationMethod.lastModifiedDate)
				.map(LAST_MODIFIED_BY, isolationMethod.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, isolationMethod);
	}
}
