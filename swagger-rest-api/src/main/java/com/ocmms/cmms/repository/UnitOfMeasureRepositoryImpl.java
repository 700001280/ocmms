package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.common.QUnitOfMeasure;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = UnitOfMeasureRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class UnitOfMeasureRepositoryImpl extends QueryDslRepositorySupportExt<UnitOfMeasure>
		implements UnitOfMeasureRepositoryCustom {

	/**
	 * Default constructor
	 */
	UnitOfMeasureRepositoryImpl() {
		super(UnitOfMeasure.class);
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
	public Page<UnitOfMeasure> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QUnitOfMeasure unitOfMeasure = QUnitOfMeasure.unitOfMeasure;
		JPQLQuery<UnitOfMeasure> query = from(unitOfMeasure);
		Path<?>[] paths = new Path<?>[] { unitOfMeasure.code, unitOfMeasure.description, unitOfMeasure.recordStatus,
				unitOfMeasure.createdDate, unitOfMeasure.createdBy, unitOfMeasure.lastModifiedDate,
				unitOfMeasure.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, unitOfMeasure.code)
				.map(DESCRIPTION, unitOfMeasure.description).map(RECORD_STATUS, unitOfMeasure.recordStatus)
				.map(CREATED_DATE, unitOfMeasure.createdDate).map(CREATED_BY, unitOfMeasure.createdBy)
				.map(LAST_MODIFIED_DATE, unitOfMeasure.lastModifiedDate)
				.map(LAST_MODIFIED_BY, unitOfMeasure.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, unitOfMeasure);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<UnitOfMeasure> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QUnitOfMeasure unitOfMeasure = QUnitOfMeasure.unitOfMeasure;
		JPQLQuery<UnitOfMeasure> query = from(unitOfMeasure);
		Path<?>[] paths = new Path<?>[] { unitOfMeasure.code, unitOfMeasure.description, unitOfMeasure.recordStatus,
				unitOfMeasure.createdDate, unitOfMeasure.createdBy, unitOfMeasure.lastModifiedDate,
				unitOfMeasure.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(unitOfMeasure.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, unitOfMeasure.code)
				.map(DESCRIPTION, unitOfMeasure.description).map(RECORD_STATUS, unitOfMeasure.recordStatus)
				.map(CREATED_DATE, unitOfMeasure.createdDate).map(CREATED_BY, unitOfMeasure.createdBy)
				.map(LAST_MODIFIED_DATE, unitOfMeasure.lastModifiedDate)
				.map(LAST_MODIFIED_BY, unitOfMeasure.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, unitOfMeasure);
	}
}
