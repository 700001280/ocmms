package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.pm.technicalobject.QEquipmentStatusChangeRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = EquipmentStatusChangeRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentStatusChangeRecordRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentStatusChangeRecord>
		implements EquipmentStatusChangeRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentStatusChangeRecordRepositoryImpl() {
		super(EquipmentStatusChangeRecord.class);
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
	public static final String EQUIPMENT_STATUS = "equipmentStatus";

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
	public Page<EquipmentStatusChangeRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentStatusChangeRecord equipmentStatusChangeRecord = QEquipmentStatusChangeRecord.equipmentStatusChangeRecord;
		JPQLQuery<EquipmentStatusChangeRecord> query = from(equipmentStatusChangeRecord);
		Path<?>[] paths = new Path<?>[] { equipmentStatusChangeRecord.changeDate,
				equipmentStatusChangeRecord.description, equipmentStatusChangeRecord.equipmentStatus,
				equipmentStatusChangeRecord.equipment, equipmentStatusChangeRecord.recordStatus,
				equipmentStatusChangeRecord.createdDate, equipmentStatusChangeRecord.createdBy,
				equipmentStatusChangeRecord.lastModifiedDate, equipmentStatusChangeRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CHANGE_DATE, equipmentStatusChangeRecord.changeDate)
				.map(DESCRIPTION, equipmentStatusChangeRecord.description)
				.map(EQUIPMENT_STATUS, equipmentStatusChangeRecord.equipmentStatus)
				.map(EQUIPMENT, equipmentStatusChangeRecord.equipment)
				.map(RECORD_STATUS, equipmentStatusChangeRecord.recordStatus)
				.map(CREATED_DATE, equipmentStatusChangeRecord.createdDate)
				.map(CREATED_BY, equipmentStatusChangeRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentStatusChangeRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentStatusChangeRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentStatusChangeRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentStatusChangeRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipmentStatusChangeRecord equipmentStatusChangeRecord = QEquipmentStatusChangeRecord.equipmentStatusChangeRecord;
		JPQLQuery<EquipmentStatusChangeRecord> query = from(equipmentStatusChangeRecord);
		Path<?>[] paths = new Path<?>[] { equipmentStatusChangeRecord.changeDate,
				equipmentStatusChangeRecord.description, equipmentStatusChangeRecord.equipmentStatus,
				equipmentStatusChangeRecord.equipment, equipmentStatusChangeRecord.recordStatus,
				equipmentStatusChangeRecord.createdDate, equipmentStatusChangeRecord.createdBy,
				equipmentStatusChangeRecord.lastModifiedDate, equipmentStatusChangeRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipmentStatusChangeRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CHANGE_DATE, equipmentStatusChangeRecord.changeDate)
				.map(DESCRIPTION, equipmentStatusChangeRecord.description)
				.map(EQUIPMENT_STATUS, equipmentStatusChangeRecord.equipmentStatus)
				.map(EQUIPMENT, equipmentStatusChangeRecord.equipment)
				.map(RECORD_STATUS, equipmentStatusChangeRecord.recordStatus)
				.map(CREATED_DATE, equipmentStatusChangeRecord.createdDate)
				.map(CREATED_BY, equipmentStatusChangeRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentStatusChangeRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentStatusChangeRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentStatusChangeRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentStatusChangeRecord> findByEquipment(Equipment equipment, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipmentStatusChangeRecord equipmentStatusChangeRecord = QEquipmentStatusChangeRecord.equipmentStatusChangeRecord;
		JPQLQuery<EquipmentStatusChangeRecord> query = from(equipmentStatusChangeRecord);
		Assert.notNull(equipment, "equipment is required");
		query.where(equipmentStatusChangeRecord.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { equipmentStatusChangeRecord.changeDate,
				equipmentStatusChangeRecord.description, equipmentStatusChangeRecord.equipmentStatus,
				equipmentStatusChangeRecord.equipment, equipmentStatusChangeRecord.recordStatus,
				equipmentStatusChangeRecord.createdDate, equipmentStatusChangeRecord.createdBy,
				equipmentStatusChangeRecord.lastModifiedDate, equipmentStatusChangeRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CHANGE_DATE, equipmentStatusChangeRecord.changeDate)
				.map(DESCRIPTION, equipmentStatusChangeRecord.description)
				.map(EQUIPMENT_STATUS, equipmentStatusChangeRecord.equipmentStatus)
				.map(EQUIPMENT, equipmentStatusChangeRecord.equipment)
				.map(RECORD_STATUS, equipmentStatusChangeRecord.recordStatus)
				.map(CREATED_DATE, equipmentStatusChangeRecord.createdDate)
				.map(CREATED_BY, equipmentStatusChangeRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentStatusChangeRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentStatusChangeRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentStatusChangeRecord);
	}
}
