package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.measuringpoint.Medium;
import com.ocmms.cmms.model.pm.measuringpoint.QMedium;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MediumRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MediumRepositoryImpl extends QueryDslRepositorySupportExt<Medium> implements MediumRepositoryCustom {

	/**
	 * Default constructor
	 */
	MediumRepositoryImpl() {
		super(Medium.class);
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
	public Page<Medium> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMedium medium = QMedium.medium;
		JPQLQuery<Medium> query = from(medium);
		Path<?>[] paths = new Path<?>[] { medium.code, medium.description, medium.recordStatus, medium.createdDate,
				medium.createdBy, medium.lastModifiedDate, medium.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, medium.code).map(DESCRIPTION, medium.description)
				.map(RECORD_STATUS, medium.recordStatus).map(CREATED_DATE, medium.createdDate)
				.map(CREATED_BY, medium.createdBy).map(LAST_MODIFIED_DATE, medium.lastModifiedDate)
				.map(LAST_MODIFIED_BY, medium.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, medium);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Medium> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMedium medium = QMedium.medium;
		JPQLQuery<Medium> query = from(medium);
		Path<?>[] paths = new Path<?>[] { medium.code, medium.description, medium.recordStatus, medium.createdDate,
				medium.createdBy, medium.lastModifiedDate, medium.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(medium.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, medium.code).map(DESCRIPTION, medium.description)
				.map(RECORD_STATUS, medium.recordStatus).map(CREATED_DATE, medium.createdDate)
				.map(CREATED_BY, medium.createdBy).map(LAST_MODIFIED_DATE, medium.lastModifiedDate)
				.map(LAST_MODIFIED_BY, medium.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, medium);
	}
}
