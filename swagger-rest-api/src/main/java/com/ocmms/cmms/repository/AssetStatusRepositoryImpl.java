package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.model.asset.QAssetStatus;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AssetStatusRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class AssetStatusRepositoryImpl extends QueryDslRepositorySupportExt<AssetStatus>
		implements AssetStatusRepositoryCustom {

	/**
	 * Default constructor
	 */
	AssetStatusRepositoryImpl() {
		super(AssetStatus.class);
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
	public static final String STATUS = "status";

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
	public Page<AssetStatus> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAssetStatus assetStatus = QAssetStatus.assetStatus;
		JPQLQuery<AssetStatus> query = from(assetStatus);
		Path<?>[] paths = new Path<?>[] { assetStatus.code, assetStatus.description, assetStatus.status,
				assetStatus.recordStatus, assetStatus.createdDate, assetStatus.createdBy, assetStatus.lastModifiedDate,
				assetStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, assetStatus.code)
				.map(DESCRIPTION, assetStatus.description).map(STATUS, assetStatus.status)
				.map(RECORD_STATUS, assetStatus.recordStatus).map(CREATED_DATE, assetStatus.createdDate)
				.map(CREATED_BY, assetStatus.createdBy).map(LAST_MODIFIED_DATE, assetStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetStatus);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QAssetStatus assetStatus = QAssetStatus.assetStatus;
		JPQLQuery<AssetStatus> query = from(assetStatus);
		Path<?>[] paths = new Path<?>[] { assetStatus.code, assetStatus.description, assetStatus.status,
				assetStatus.recordStatus, assetStatus.createdDate, assetStatus.createdBy, assetStatus.lastModifiedDate,
				assetStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(assetStatus.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, assetStatus.code)
				.map(DESCRIPTION, assetStatus.description).map(STATUS, assetStatus.status)
				.map(RECORD_STATUS, assetStatus.recordStatus).map(CREATED_DATE, assetStatus.createdDate)
				.map(CREATED_BY, assetStatus.createdBy).map(LAST_MODIFIED_DATE, assetStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetStatus);
	}
}
