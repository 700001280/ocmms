package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;
import com.ocmms.cmms.model.pm.measuringpoint.QMeasuringType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MeasuringTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MeasuringTypeRepositoryImpl extends QueryDslRepositorySupportExt<MeasuringType>
		implements MeasuringTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	MeasuringTypeRepositoryImpl() {
		super(MeasuringType.class);
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
	public Page<MeasuringType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMeasuringType measuringType = QMeasuringType.measuringType;
		JPQLQuery<MeasuringType> query = from(measuringType);
		Path<?>[] paths = new Path<?>[] { measuringType.code, measuringType.description, measuringType.recordStatus,
				measuringType.createdDate, measuringType.createdBy, measuringType.lastModifiedDate,
				measuringType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, measuringType.code)
				.map(DESCRIPTION, measuringType.description).map(RECORD_STATUS, measuringType.recordStatus)
				.map(CREATED_DATE, measuringType.createdDate).map(CREATED_BY, measuringType.createdBy)
				.map(LAST_MODIFIED_DATE, measuringType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, measuringType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, measuringType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MeasuringType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMeasuringType measuringType = QMeasuringType.measuringType;
		JPQLQuery<MeasuringType> query = from(measuringType);
		Path<?>[] paths = new Path<?>[] { measuringType.code, measuringType.description, measuringType.recordStatus,
				measuringType.createdDate, measuringType.createdBy, measuringType.lastModifiedDate,
				measuringType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(measuringType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, measuringType.code)
				.map(DESCRIPTION, measuringType.description).map(RECORD_STATUS, measuringType.recordStatus)
				.map(CREATED_DATE, measuringType.createdDate).map(CREATED_BY, measuringType.createdBy)
				.map(LAST_MODIFIED_DATE, measuringType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, measuringType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, measuringType);
	}
}
