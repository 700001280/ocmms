package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ProductType;
import com.ocmms.cmms.model.pp.configuration.QProductType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProductTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ProductTypeRepositoryImpl extends QueryDslRepositorySupportExt<ProductType>
		implements ProductTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProductTypeRepositoryImpl() {
		super(ProductType.class);
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
	public Page<ProductType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProductType productType = QProductType.productType;
		JPQLQuery<ProductType> query = from(productType);
		Path<?>[] paths = new Path<?>[] { productType.code, productType.description, productType.recordStatus,
				productType.createdDate, productType.createdBy, productType.lastModifiedDate,
				productType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, productType.code)
				.map(DESCRIPTION, productType.description).map(RECORD_STATUS, productType.recordStatus)
				.map(CREATED_DATE, productType.createdDate).map(CREATED_BY, productType.createdBy)
				.map(LAST_MODIFIED_DATE, productType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, productType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, productType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProductType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QProductType productType = QProductType.productType;
		JPQLQuery<ProductType> query = from(productType);
		Path<?>[] paths = new Path<?>[] { productType.code, productType.description, productType.recordStatus,
				productType.createdDate, productType.createdBy, productType.lastModifiedDate,
				productType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(productType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, productType.code)
				.map(DESCRIPTION, productType.description).map(RECORD_STATUS, productType.recordStatus)
				.map(CREATED_DATE, productType.createdDate).map(CREATED_BY, productType.createdBy)
				.map(LAST_MODIFIED_DATE, productType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, productType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, productType);
	}
}
