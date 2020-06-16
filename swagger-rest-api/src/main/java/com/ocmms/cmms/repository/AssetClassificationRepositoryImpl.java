package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.asset.QAssetClassification;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AssetClassificationRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class AssetClassificationRepositoryImpl extends QueryDslRepositorySupportExt<AssetClassification>
		implements AssetClassificationRepositoryCustom {

	/**
	 * Default constructor
	 */
	AssetClassificationRepositoryImpl() {
		super(AssetClassification.class);
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
	public Page<AssetClassification> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAssetClassification assetClassification = QAssetClassification.assetClassification;
		JPQLQuery<AssetClassification> query = from(assetClassification);
		Path<?>[] paths = new Path<?>[] { assetClassification.code, assetClassification.description,
				assetClassification.recordStatus, assetClassification.createdDate, assetClassification.createdBy,
				assetClassification.lastModifiedDate, assetClassification.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, assetClassification.code)
				.map(DESCRIPTION, assetClassification.description).map(RECORD_STATUS, assetClassification.recordStatus)
				.map(CREATED_DATE, assetClassification.createdDate).map(CREATED_BY, assetClassification.createdBy)
				.map(LAST_MODIFIED_DATE, assetClassification.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetClassification.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetClassification);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetClassification> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QAssetClassification assetClassification = QAssetClassification.assetClassification;
		JPQLQuery<AssetClassification> query = from(assetClassification);
		Path<?>[] paths = new Path<?>[] { assetClassification.code, assetClassification.description,
				assetClassification.recordStatus, assetClassification.createdDate, assetClassification.createdBy,
				assetClassification.lastModifiedDate, assetClassification.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(assetClassification.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, assetClassification.code)
				.map(DESCRIPTION, assetClassification.description).map(RECORD_STATUS, assetClassification.recordStatus)
				.map(CREATED_DATE, assetClassification.createdDate).map(CREATED_BY, assetClassification.createdBy)
				.map(LAST_MODIFIED_DATE, assetClassification.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetClassification.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetClassification);
	}
}
