package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.BarcodeDefinition;
import com.ocmms.cmms.model.system.QBarcodeDefinition;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = BarcodeDefinitionRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class BarcodeDefinitionRepositoryImpl extends QueryDslRepositorySupportExt<BarcodeDefinition>
		implements BarcodeDefinitionRepositoryCustom {

	/**
	 * Default constructor
	 */
	BarcodeDefinitionRepositoryImpl() {
		super(BarcodeDefinition.class);
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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLASS_NAME = "className";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BarcodeDefinition> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QBarcodeDefinition barcodeDefinition = QBarcodeDefinition.barcodeDefinition;
		JPQLQuery<BarcodeDefinition> query = from(barcodeDefinition);
		Path<?>[] paths = new Path<?>[] { barcodeDefinition.code, barcodeDefinition.className,
				barcodeDefinition.description, barcodeDefinition.recordStatus, barcodeDefinition.createdDate,
				barcodeDefinition.createdBy, barcodeDefinition.lastModifiedDate, barcodeDefinition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, barcodeDefinition.code)
				.map(CLASS_NAME, barcodeDefinition.className).map(DESCRIPTION, barcodeDefinition.description)
				.map(RECORD_STATUS, barcodeDefinition.recordStatus).map(CREATED_DATE, barcodeDefinition.createdDate)
				.map(CREATED_BY, barcodeDefinition.createdBy)
				.map(LAST_MODIFIED_DATE, barcodeDefinition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, barcodeDefinition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, barcodeDefinition);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BarcodeDefinition> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QBarcodeDefinition barcodeDefinition = QBarcodeDefinition.barcodeDefinition;
		JPQLQuery<BarcodeDefinition> query = from(barcodeDefinition);
		Path<?>[] paths = new Path<?>[] { barcodeDefinition.code, barcodeDefinition.className,
				barcodeDefinition.description, barcodeDefinition.recordStatus, barcodeDefinition.createdDate,
				barcodeDefinition.createdBy, barcodeDefinition.lastModifiedDate, barcodeDefinition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(barcodeDefinition.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, barcodeDefinition.code)
				.map(CLASS_NAME, barcodeDefinition.className).map(DESCRIPTION, barcodeDefinition.description)
				.map(RECORD_STATUS, barcodeDefinition.recordStatus).map(CREATED_DATE, barcodeDefinition.createdDate)
				.map(CREATED_BY, barcodeDefinition.createdBy)
				.map(LAST_MODIFIED_DATE, barcodeDefinition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, barcodeDefinition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, barcodeDefinition);
	}
}
