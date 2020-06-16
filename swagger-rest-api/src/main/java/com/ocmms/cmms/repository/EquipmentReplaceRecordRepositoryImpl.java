package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import com.ocmms.cmms.model.pm.routine.QEquipmentReplaceRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = EquipmentReplaceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentReplaceRecord>
		implements EquipmentReplaceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentReplaceRecordRepositoryImpl() {
		super(EquipmentReplaceRecord.class);
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
	public static final String ONLINE_DATE = "onlineDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

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
	public static final String ONLINE_PLAN = "onlinePlan";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ONLINE_MAINTAINER = "onlineMaintainer";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OFFLINE_MAINTAINER = "offlineMaintainer";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OFFLINE_PLAN = "offlinePlan";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OFFLINE_DATE = "offlineDate";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentReplaceRecord equipmentReplaceRecord = QEquipmentReplaceRecord.equipmentReplaceRecord;
		JPQLQuery<EquipmentReplaceRecord> query = from(equipmentReplaceRecord);
		Path<?>[] paths = new Path<?>[] { equipmentReplaceRecord.technicalObject, equipmentReplaceRecord.equipment,
				equipmentReplaceRecord.description, equipmentReplaceRecord.onlineDate,
				equipmentReplaceRecord.onlinePlan, equipmentReplaceRecord.onlineMaintainer,
				equipmentReplaceRecord.offlineDate, equipmentReplaceRecord.offlinePlan,
				equipmentReplaceRecord.offlineMaintainer, equipmentReplaceRecord.memo,
				equipmentReplaceRecord.recordStatus, equipmentReplaceRecord.createdDate,
				equipmentReplaceRecord.createdBy, equipmentReplaceRecord.lastModifiedDate,
				equipmentReplaceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TECHNICAL_OBJECT, equipmentReplaceRecord.technicalObject)
				.map(EQUIPMENT, equipmentReplaceRecord.equipment).map(DESCRIPTION, equipmentReplaceRecord.description)
				.map(ONLINE_DATE, equipmentReplaceRecord.onlineDate).map(ONLINE_PLAN, equipmentReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, equipmentReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, equipmentReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, equipmentReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, equipmentReplaceRecord.offlineMaintainer)
				.map(MEMO, equipmentReplaceRecord.memo).map(RECORD_STATUS, equipmentReplaceRecord.recordStatus)
				.map(CREATED_DATE, equipmentReplaceRecord.createdDate).map(CREATED_BY, equipmentReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentReplaceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentReplaceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentReplaceRecord equipmentReplaceRecord = QEquipmentReplaceRecord.equipmentReplaceRecord;
		JPQLQuery<EquipmentReplaceRecord> query = from(equipmentReplaceRecord);
		Path<?>[] paths = new Path<?>[] { equipmentReplaceRecord.technicalObject, equipmentReplaceRecord.equipment,
				equipmentReplaceRecord.description, equipmentReplaceRecord.onlineDate,
				equipmentReplaceRecord.onlinePlan, equipmentReplaceRecord.onlineMaintainer,
				equipmentReplaceRecord.offlineDate, equipmentReplaceRecord.offlinePlan,
				equipmentReplaceRecord.offlineMaintainer, equipmentReplaceRecord.memo,
				equipmentReplaceRecord.recordStatus, equipmentReplaceRecord.createdDate,
				equipmentReplaceRecord.createdBy, equipmentReplaceRecord.lastModifiedDate,
				equipmentReplaceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipmentReplaceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TECHNICAL_OBJECT, equipmentReplaceRecord.technicalObject)
				.map(EQUIPMENT, equipmentReplaceRecord.equipment).map(DESCRIPTION, equipmentReplaceRecord.description)
				.map(ONLINE_DATE, equipmentReplaceRecord.onlineDate).map(ONLINE_PLAN, equipmentReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, equipmentReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, equipmentReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, equipmentReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, equipmentReplaceRecord.offlineMaintainer)
				.map(MEMO, equipmentReplaceRecord.memo).map(RECORD_STATUS, equipmentReplaceRecord.recordStatus)
				.map(CREATED_DATE, equipmentReplaceRecord.createdDate).map(CREATED_BY, equipmentReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentReplaceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentReplaceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentReplaceRecord> findByEquipment(Equipment equipment, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipmentReplaceRecord equipmentReplaceRecord = QEquipmentReplaceRecord.equipmentReplaceRecord;
		JPQLQuery<EquipmentReplaceRecord> query = from(equipmentReplaceRecord);
		Assert.notNull(equipment, "equipment is required");
		query.where(equipmentReplaceRecord.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { equipmentReplaceRecord.technicalObject, equipmentReplaceRecord.equipment,
				equipmentReplaceRecord.description, equipmentReplaceRecord.onlineDate,
				equipmentReplaceRecord.onlinePlan, equipmentReplaceRecord.onlineMaintainer,
				equipmentReplaceRecord.offlineDate, equipmentReplaceRecord.offlinePlan,
				equipmentReplaceRecord.offlineMaintainer, equipmentReplaceRecord.memo,
				equipmentReplaceRecord.recordStatus, equipmentReplaceRecord.createdDate,
				equipmentReplaceRecord.createdBy, equipmentReplaceRecord.lastModifiedDate,
				equipmentReplaceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TECHNICAL_OBJECT, equipmentReplaceRecord.technicalObject)
				.map(EQUIPMENT, equipmentReplaceRecord.equipment).map(DESCRIPTION, equipmentReplaceRecord.description)
				.map(ONLINE_DATE, equipmentReplaceRecord.onlineDate).map(ONLINE_PLAN, equipmentReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, equipmentReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, equipmentReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, equipmentReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, equipmentReplaceRecord.offlineMaintainer)
				.map(MEMO, equipmentReplaceRecord.memo).map(RECORD_STATUS, equipmentReplaceRecord.recordStatus)
				.map(CREATED_DATE, equipmentReplaceRecord.createdDate).map(CREATED_BY, equipmentReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentReplaceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentReplaceRecord);
	}
}
