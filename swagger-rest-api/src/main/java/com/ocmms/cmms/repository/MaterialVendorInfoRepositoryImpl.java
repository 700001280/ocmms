package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialVendorInfo;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.master.QMaterialVendorInfo;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MaterialVendorInfoRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialVendorInfoRepositoryImpl extends QueryDslRepositorySupportExt<MaterialVendorInfo>
		implements MaterialVendorInfoRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialVendorInfoRepositoryImpl() {
		super(MaterialVendorInfo.class);
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
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String VENDOR_INFO_TYPE = "vendorInfoType";

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
	public Page<MaterialVendorInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialVendorInfo materialVendorInfo = QMaterialVendorInfo.materialVendorInfo;
		JPQLQuery<MaterialVendorInfo> query = from(materialVendorInfo);
		Path<?>[] paths = new Path<?>[] { materialVendorInfo.description, materialVendorInfo.code,
				materialVendorInfo.materialCatalog, materialVendorInfo.vendorInfoType, materialVendorInfo.recordStatus,
				materialVendorInfo.createdDate, materialVendorInfo.createdBy, materialVendorInfo.lastModifiedDate,
				materialVendorInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, materialVendorInfo.description)
				.map(CODE, materialVendorInfo.code).map(MATERIAL_CATALOG, materialVendorInfo.materialCatalog)
				.map(VENDOR_INFO_TYPE, materialVendorInfo.vendorInfoType)
				.map(RECORD_STATUS, materialVendorInfo.recordStatus).map(CREATED_DATE, materialVendorInfo.createdDate)
				.map(CREATED_BY, materialVendorInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialVendorInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialVendorInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialVendorInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialVendorInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialVendorInfo materialVendorInfo = QMaterialVendorInfo.materialVendorInfo;
		JPQLQuery<MaterialVendorInfo> query = from(materialVendorInfo);
		Path<?>[] paths = new Path<?>[] { materialVendorInfo.description, materialVendorInfo.code,
				materialVendorInfo.materialCatalog, materialVendorInfo.vendorInfoType, materialVendorInfo.recordStatus,
				materialVendorInfo.createdDate, materialVendorInfo.createdBy, materialVendorInfo.lastModifiedDate,
				materialVendorInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialVendorInfo.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, materialVendorInfo.description)
				.map(CODE, materialVendorInfo.code).map(MATERIAL_CATALOG, materialVendorInfo.materialCatalog)
				.map(VENDOR_INFO_TYPE, materialVendorInfo.vendorInfoType)
				.map(RECORD_STATUS, materialVendorInfo.recordStatus).map(CREATED_DATE, materialVendorInfo.createdDate)
				.map(CREATED_BY, materialVendorInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialVendorInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialVendorInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialVendorInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialVendorInfo> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable) {
		QMaterialVendorInfo materialVendorInfo = QMaterialVendorInfo.materialVendorInfo;
		JPQLQuery<MaterialVendorInfo> query = from(materialVendorInfo);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(materialVendorInfo.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { materialVendorInfo.description, materialVendorInfo.code,
				materialVendorInfo.materialCatalog, materialVendorInfo.vendorInfoType, materialVendorInfo.recordStatus,
				materialVendorInfo.createdDate, materialVendorInfo.createdBy, materialVendorInfo.lastModifiedDate,
				materialVendorInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, materialVendorInfo.description)
				.map(CODE, materialVendorInfo.code).map(MATERIAL_CATALOG, materialVendorInfo.materialCatalog)
				.map(VENDOR_INFO_TYPE, materialVendorInfo.vendorInfoType)
				.map(RECORD_STATUS, materialVendorInfo.recordStatus).map(CREATED_DATE, materialVendorInfo.createdDate)
				.map(CREATED_BY, materialVendorInfo.createdBy)
				.map(LAST_MODIFIED_DATE, materialVendorInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialVendorInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialVendorInfo);
	}
}
