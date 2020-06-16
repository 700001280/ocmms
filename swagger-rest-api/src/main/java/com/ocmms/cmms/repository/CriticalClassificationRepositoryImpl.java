package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.model.eshem.QCriticalClassification;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CriticalClassificationRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class CriticalClassificationRepositoryImpl extends QueryDslRepositorySupportExt<CriticalClassification>
		implements CriticalClassificationRepositoryCustom {

	/**
	 * Default constructor
	 */
	CriticalClassificationRepositoryImpl() {
		super(CriticalClassification.class);
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
	public static final String CATEGORY = "category";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUB_CATEGORY = "subCategory";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUB_DESCRIPTION = "subDescription";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RISK_MATRIX = "riskMatrix";

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
	public Page<CriticalClassification> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QCriticalClassification criticalClassification = QCriticalClassification.criticalClassification;
		JPQLQuery<CriticalClassification> query = from(criticalClassification);
		Path<?>[] paths = new Path<?>[] { criticalClassification.category, criticalClassification.description,
				criticalClassification.subCategory, criticalClassification.subDescription,
				criticalClassification.riskMatrix, criticalClassification.recordStatus,
				criticalClassification.createdDate, criticalClassification.createdBy,
				criticalClassification.lastModifiedDate, criticalClassification.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CATEGORY, criticalClassification.category)
				.map(DESCRIPTION, criticalClassification.description)
				.map(SUB_CATEGORY, criticalClassification.subCategory)
				.map(SUB_DESCRIPTION, criticalClassification.subDescription)
				.map(RISK_MATRIX, criticalClassification.riskMatrix)
				.map(RECORD_STATUS, criticalClassification.recordStatus)
				.map(CREATED_DATE, criticalClassification.createdDate).map(CREATED_BY, criticalClassification.createdBy)
				.map(LAST_MODIFIED_DATE, criticalClassification.lastModifiedDate)
				.map(LAST_MODIFIED_BY, criticalClassification.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, criticalClassification);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<CriticalClassification> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QCriticalClassification criticalClassification = QCriticalClassification.criticalClassification;
		JPQLQuery<CriticalClassification> query = from(criticalClassification);
		Path<?>[] paths = new Path<?>[] { criticalClassification.category, criticalClassification.description,
				criticalClassification.subCategory, criticalClassification.subDescription,
				criticalClassification.riskMatrix, criticalClassification.recordStatus,
				criticalClassification.createdDate, criticalClassification.createdBy,
				criticalClassification.lastModifiedDate, criticalClassification.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(criticalClassification.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CATEGORY, criticalClassification.category)
				.map(DESCRIPTION, criticalClassification.description)
				.map(SUB_CATEGORY, criticalClassification.subCategory)
				.map(SUB_DESCRIPTION, criticalClassification.subDescription)
				.map(RISK_MATRIX, criticalClassification.riskMatrix)
				.map(RECORD_STATUS, criticalClassification.recordStatus)
				.map(CREATED_DATE, criticalClassification.createdDate).map(CREATED_BY, criticalClassification.createdBy)
				.map(LAST_MODIFIED_DATE, criticalClassification.lastModifiedDate)
				.map(LAST_MODIFIED_BY, criticalClassification.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, criticalClassification);
	}
}
