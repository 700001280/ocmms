package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ProductMasterData;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import com.ocmms.cmms.model.pp.configuration.QProductMasterData;
import com.ocmms.cmms.model.pp.configuration.ShaftType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ProductMasterDataRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ProductMasterDataRepositoryImpl extends QueryDslRepositorySupportExt<ProductMasterData>
		implements ProductMasterDataRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProductMasterDataRepositoryImpl() {
		super(ProductMasterData.class);
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
	public static final String PRODUCT_TYPE = "productType";

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
	public static final String COLOR = "color";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SHAFT_TYPE = "shaftType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String GRADE = "grade";

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
	public static final String MATERIAL_CODE = "materialCode";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProductMasterData> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProductMasterData productMasterData = QProductMasterData.productMasterData;
		JPQLQuery<ProductMasterData> query = from(productMasterData);
		Path<?>[] paths = new Path<?>[] { productMasterData.materialCode, productMasterData.grade,
				productMasterData.color, productMasterData.description, productMasterData.productType,
				productMasterData.shaftType, productMasterData.recordStatus, productMasterData.createdDate,
				productMasterData.createdBy, productMasterData.lastModifiedDate, productMasterData.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CODE, productMasterData.materialCode)
				.map(GRADE, productMasterData.grade).map(COLOR, productMasterData.color)
				.map(DESCRIPTION, productMasterData.description).map(PRODUCT_TYPE, productMasterData.productType)
				.map(SHAFT_TYPE, productMasterData.shaftType).map(RECORD_STATUS, productMasterData.recordStatus)
				.map(CREATED_DATE, productMasterData.createdDate).map(CREATED_BY, productMasterData.createdBy)
				.map(LAST_MODIFIED_DATE, productMasterData.lastModifiedDate)
				.map(LAST_MODIFIED_BY, productMasterData.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, productMasterData);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProductMasterData> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QProductMasterData productMasterData = QProductMasterData.productMasterData;
		JPQLQuery<ProductMasterData> query = from(productMasterData);
		Path<?>[] paths = new Path<?>[] { productMasterData.materialCode, productMasterData.grade,
				productMasterData.color, productMasterData.description, productMasterData.productType,
				productMasterData.shaftType, productMasterData.recordStatus, productMasterData.createdDate,
				productMasterData.createdBy, productMasterData.lastModifiedDate, productMasterData.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(productMasterData.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CODE, productMasterData.materialCode)
				.map(GRADE, productMasterData.grade).map(COLOR, productMasterData.color)
				.map(DESCRIPTION, productMasterData.description).map(PRODUCT_TYPE, productMasterData.productType)
				.map(SHAFT_TYPE, productMasterData.shaftType).map(RECORD_STATUS, productMasterData.recordStatus)
				.map(CREATED_DATE, productMasterData.createdDate).map(CREATED_BY, productMasterData.createdBy)
				.map(LAST_MODIFIED_DATE, productMasterData.lastModifiedDate)
				.map(LAST_MODIFIED_BY, productMasterData.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, productMasterData);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param productType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProductMasterData> findByProductType(ProductType productType, GlobalSearch globalSearch,
			Pageable pageable) {
		QProductMasterData productMasterData = QProductMasterData.productMasterData;
		JPQLQuery<ProductMasterData> query = from(productMasterData);
		Assert.notNull(productType, "productType is required");
		query.where(productMasterData.productType.eq(productType));
		Path<?>[] paths = new Path<?>[] { productMasterData.materialCode, productMasterData.grade,
				productMasterData.color, productMasterData.description, productMasterData.productType,
				productMasterData.shaftType, productMasterData.recordStatus, productMasterData.createdDate,
				productMasterData.createdBy, productMasterData.lastModifiedDate, productMasterData.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CODE, productMasterData.materialCode)
				.map(GRADE, productMasterData.grade).map(COLOR, productMasterData.color)
				.map(DESCRIPTION, productMasterData.description).map(PRODUCT_TYPE, productMasterData.productType)
				.map(SHAFT_TYPE, productMasterData.shaftType).map(RECORD_STATUS, productMasterData.recordStatus)
				.map(CREATED_DATE, productMasterData.createdDate).map(CREATED_BY, productMasterData.createdBy)
				.map(LAST_MODIFIED_DATE, productMasterData.lastModifiedDate)
				.map(LAST_MODIFIED_BY, productMasterData.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, productMasterData);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param shaftType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProductMasterData> findByShaftType(ShaftType shaftType, GlobalSearch globalSearch, Pageable pageable) {
		QProductMasterData productMasterData = QProductMasterData.productMasterData;
		JPQLQuery<ProductMasterData> query = from(productMasterData);
		Assert.notNull(shaftType, "shaftType is required");
		query.where(productMasterData.shaftType.eq(shaftType));
		Path<?>[] paths = new Path<?>[] { productMasterData.materialCode, productMasterData.grade,
				productMasterData.color, productMasterData.description, productMasterData.productType,
				productMasterData.shaftType, productMasterData.recordStatus, productMasterData.createdDate,
				productMasterData.createdBy, productMasterData.lastModifiedDate, productMasterData.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CODE, productMasterData.materialCode)
				.map(GRADE, productMasterData.grade).map(COLOR, productMasterData.color)
				.map(DESCRIPTION, productMasterData.description).map(PRODUCT_TYPE, productMasterData.productType)
				.map(SHAFT_TYPE, productMasterData.shaftType).map(RECORD_STATUS, productMasterData.recordStatus)
				.map(CREATED_DATE, productMasterData.createdDate).map(CREATED_BY, productMasterData.createdBy)
				.map(LAST_MODIFIED_DATE, productMasterData.lastModifiedDate)
				.map(LAST_MODIFIED_BY, productMasterData.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, productMasterData);
	}
}
