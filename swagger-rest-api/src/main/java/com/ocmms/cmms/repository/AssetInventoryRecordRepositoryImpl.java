package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.asset.QAssetInventoryRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = AssetInventoryRecordRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class AssetInventoryRecordRepositoryImpl extends QueryDslRepositorySupportExt<AssetInventoryRecord>
		implements AssetInventoryRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	AssetInventoryRecordRepositoryImpl() {
		super(AssetInventoryRecord.class);
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
	public static final String CHECK_DATE = "checkDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SPAREPART = "sparepart";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACTION_PLAN = "actionPlan";

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
	public static final String IDLE_BEGINNING_DATE = "idleBeginningDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ROOT_CAUSE_REASON = "rootCauseReason";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATEGORY = "category";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_STATUS = "assetStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUB_CATEGORY = "subCategory";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CHECK_RESULT = "checkResult";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORDER = "recorder";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetInventoryRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAssetInventoryRecord assetInventoryRecord = QAssetInventoryRecord.assetInventoryRecord;
		JPQLQuery<AssetInventoryRecord> query = from(assetInventoryRecord);
		Path<?>[] paths = new Path<?>[] { assetInventoryRecord.checkDate, assetInventoryRecord.description,
				assetInventoryRecord.assetStatus, assetInventoryRecord.category, assetInventoryRecord.subCategory,
				assetInventoryRecord.sparepart, assetInventoryRecord.idleBeginningDate,
				assetInventoryRecord.rootCauseReason, assetInventoryRecord.actionPlan, assetInventoryRecord.checkResult,
				assetInventoryRecord.equipment, assetInventoryRecord.recorder, assetInventoryRecord.recordStatus,
				assetInventoryRecord.createdDate, assetInventoryRecord.createdBy, assetInventoryRecord.lastModifiedDate,
				assetInventoryRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CHECK_DATE, assetInventoryRecord.checkDate)
				.map(DESCRIPTION, assetInventoryRecord.description).map(ASSET_STATUS, assetInventoryRecord.assetStatus)
				.map(CATEGORY, assetInventoryRecord.category).map(SUB_CATEGORY, assetInventoryRecord.subCategory)
				.map(SPAREPART, assetInventoryRecord.sparepart)
				.map(IDLE_BEGINNING_DATE, assetInventoryRecord.idleBeginningDate)
				.map(ROOT_CAUSE_REASON, assetInventoryRecord.rootCauseReason)
				.map(ACTION_PLAN, assetInventoryRecord.actionPlan).map(CHECK_RESULT, assetInventoryRecord.checkResult)
				.map(EQUIPMENT, assetInventoryRecord.equipment).map(RECORDER, assetInventoryRecord.recorder)
				.map(RECORD_STATUS, assetInventoryRecord.recordStatus)
				.map(CREATED_DATE, assetInventoryRecord.createdDate).map(CREATED_BY, assetInventoryRecord.createdBy)
				.map(LAST_MODIFIED_DATE, assetInventoryRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetInventoryRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetInventoryRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetInventoryRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QAssetInventoryRecord assetInventoryRecord = QAssetInventoryRecord.assetInventoryRecord;
		JPQLQuery<AssetInventoryRecord> query = from(assetInventoryRecord);
		Path<?>[] paths = new Path<?>[] { assetInventoryRecord.checkDate, assetInventoryRecord.description,
				assetInventoryRecord.assetStatus, assetInventoryRecord.category, assetInventoryRecord.subCategory,
				assetInventoryRecord.sparepart, assetInventoryRecord.idleBeginningDate,
				assetInventoryRecord.rootCauseReason, assetInventoryRecord.actionPlan, assetInventoryRecord.checkResult,
				assetInventoryRecord.equipment, assetInventoryRecord.recorder, assetInventoryRecord.recordStatus,
				assetInventoryRecord.createdDate, assetInventoryRecord.createdBy, assetInventoryRecord.lastModifiedDate,
				assetInventoryRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(assetInventoryRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CHECK_DATE, assetInventoryRecord.checkDate)
				.map(DESCRIPTION, assetInventoryRecord.description).map(ASSET_STATUS, assetInventoryRecord.assetStatus)
				.map(CATEGORY, assetInventoryRecord.category).map(SUB_CATEGORY, assetInventoryRecord.subCategory)
				.map(SPAREPART, assetInventoryRecord.sparepart)
				.map(IDLE_BEGINNING_DATE, assetInventoryRecord.idleBeginningDate)
				.map(ROOT_CAUSE_REASON, assetInventoryRecord.rootCauseReason)
				.map(ACTION_PLAN, assetInventoryRecord.actionPlan).map(CHECK_RESULT, assetInventoryRecord.checkResult)
				.map(EQUIPMENT, assetInventoryRecord.equipment).map(RECORDER, assetInventoryRecord.recorder)
				.map(RECORD_STATUS, assetInventoryRecord.recordStatus)
				.map(CREATED_DATE, assetInventoryRecord.createdDate).map(CREATED_BY, assetInventoryRecord.createdBy)
				.map(LAST_MODIFIED_DATE, assetInventoryRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetInventoryRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetInventoryRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<AssetInventoryRecord> findByEquipment(Equipment equipment, GlobalSearch globalSearch,
			Pageable pageable) {
		QAssetInventoryRecord assetInventoryRecord = QAssetInventoryRecord.assetInventoryRecord;
		JPQLQuery<AssetInventoryRecord> query = from(assetInventoryRecord);
		Assert.notNull(equipment, "equipment is required");
		query.where(assetInventoryRecord.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { assetInventoryRecord.checkDate, assetInventoryRecord.description,
				assetInventoryRecord.assetStatus, assetInventoryRecord.category, assetInventoryRecord.subCategory,
				assetInventoryRecord.sparepart, assetInventoryRecord.idleBeginningDate,
				assetInventoryRecord.rootCauseReason, assetInventoryRecord.actionPlan, assetInventoryRecord.checkResult,
				assetInventoryRecord.equipment, assetInventoryRecord.recorder, assetInventoryRecord.recordStatus,
				assetInventoryRecord.createdDate, assetInventoryRecord.createdBy, assetInventoryRecord.lastModifiedDate,
				assetInventoryRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CHECK_DATE, assetInventoryRecord.checkDate)
				.map(DESCRIPTION, assetInventoryRecord.description).map(ASSET_STATUS, assetInventoryRecord.assetStatus)
				.map(CATEGORY, assetInventoryRecord.category).map(SUB_CATEGORY, assetInventoryRecord.subCategory)
				.map(SPAREPART, assetInventoryRecord.sparepart)
				.map(IDLE_BEGINNING_DATE, assetInventoryRecord.idleBeginningDate)
				.map(ROOT_CAUSE_REASON, assetInventoryRecord.rootCauseReason)
				.map(ACTION_PLAN, assetInventoryRecord.actionPlan).map(CHECK_RESULT, assetInventoryRecord.checkResult)
				.map(EQUIPMENT, assetInventoryRecord.equipment).map(RECORDER, assetInventoryRecord.recorder)
				.map(RECORD_STATUS, assetInventoryRecord.recordStatus)
				.map(CREATED_DATE, assetInventoryRecord.createdDate).map(CREATED_BY, assetInventoryRecord.createdBy)
				.map(LAST_MODIFIED_DATE, assetInventoryRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, assetInventoryRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, assetInventoryRecord);
	}
}
