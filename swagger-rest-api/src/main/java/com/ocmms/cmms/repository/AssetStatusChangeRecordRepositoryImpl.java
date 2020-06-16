package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.model.asset.QAssetStatusChangeRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = AssetStatusChangeRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class AssetStatusChangeRecordRepositoryImpl extends QueryDslRepositorySupportExt<AssetStatusChangeRecord>
		implements AssetStatusChangeRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	AssetStatusChangeRecordRepositoryImpl() {
		super(AssetStatusChangeRecord.class);
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
	public static final String EQUIPMENT = "equipment";

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
	public static final String ASSET_STATUS = "assetStatus";

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
	public static final String CHANGE_DATE = "changeDate";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetStatusChangeRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAssetStatusChangeRecord assetStatusChangeRecord = QAssetStatusChangeRecord.assetStatusChangeRecord;
		JPQLQuery<AssetStatusChangeRecord> query = from(assetStatusChangeRecord);
		Path<?>[] paths = new Path<?>[] { assetStatusChangeRecord.changeDate, assetStatusChangeRecord.description,
				assetStatusChangeRecord.assetStatus, assetStatusChangeRecord.equipment,
				assetStatusChangeRecord.recordStatus, assetStatusChangeRecord.createdDate,
				assetStatusChangeRecord.createdBy, assetStatusChangeRecord.lastModifiedDate,
				assetStatusChangeRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CHANGE_DATE, assetStatusChangeRecord.changeDate)
				.map(DESCRIPTION, assetStatusChangeRecord.description)
				.map(ASSET_STATUS, assetStatusChangeRecord.assetStatus)
				.map(EQUIPMENT, assetStatusChangeRecord.equipment)
				.map(RECORD_STATUS, assetStatusChangeRecord.recordStatus)
				.map(CREATED_DATE, assetStatusChangeRecord.createdDate)
				.map(CREATED_BY, assetStatusChangeRecord.createdBy)
				.map(LAST_MODIFIED_DATE, assetStatusChangeRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetStatusChangeRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetStatusChangeRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetStatusChangeRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QAssetStatusChangeRecord assetStatusChangeRecord = QAssetStatusChangeRecord.assetStatusChangeRecord;
		JPQLQuery<AssetStatusChangeRecord> query = from(assetStatusChangeRecord);
		Path<?>[] paths = new Path<?>[] { assetStatusChangeRecord.changeDate, assetStatusChangeRecord.description,
				assetStatusChangeRecord.assetStatus, assetStatusChangeRecord.equipment,
				assetStatusChangeRecord.recordStatus, assetStatusChangeRecord.createdDate,
				assetStatusChangeRecord.createdBy, assetStatusChangeRecord.lastModifiedDate,
				assetStatusChangeRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(assetStatusChangeRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CHANGE_DATE, assetStatusChangeRecord.changeDate)
				.map(DESCRIPTION, assetStatusChangeRecord.description)
				.map(ASSET_STATUS, assetStatusChangeRecord.assetStatus)
				.map(EQUIPMENT, assetStatusChangeRecord.equipment)
				.map(RECORD_STATUS, assetStatusChangeRecord.recordStatus)
				.map(CREATED_DATE, assetStatusChangeRecord.createdDate)
				.map(CREATED_BY, assetStatusChangeRecord.createdBy)
				.map(LAST_MODIFIED_DATE, assetStatusChangeRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetStatusChangeRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetStatusChangeRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetStatusChangeRecord> findByEquipment(Equipment equipment, GlobalSearch globalSearch,
			Pageable pageable) {
		QAssetStatusChangeRecord assetStatusChangeRecord = QAssetStatusChangeRecord.assetStatusChangeRecord;
		JPQLQuery<AssetStatusChangeRecord> query = from(assetStatusChangeRecord);
		Assert.notNull(equipment, "equipment is required");
		query.where(assetStatusChangeRecord.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { assetStatusChangeRecord.changeDate, assetStatusChangeRecord.description,
				assetStatusChangeRecord.assetStatus, assetStatusChangeRecord.equipment,
				assetStatusChangeRecord.recordStatus, assetStatusChangeRecord.createdDate,
				assetStatusChangeRecord.createdBy, assetStatusChangeRecord.lastModifiedDate,
				assetStatusChangeRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CHANGE_DATE, assetStatusChangeRecord.changeDate)
				.map(DESCRIPTION, assetStatusChangeRecord.description)
				.map(ASSET_STATUS, assetStatusChangeRecord.assetStatus)
				.map(EQUIPMENT, assetStatusChangeRecord.equipment)
				.map(RECORD_STATUS, assetStatusChangeRecord.recordStatus)
				.map(CREATED_DATE, assetStatusChangeRecord.createdDate)
				.map(CREATED_BY, assetStatusChangeRecord.createdBy)
				.map(LAST_MODIFIED_DATE, assetStatusChangeRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetStatusChangeRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetStatusChangeRecord);
	}
}
