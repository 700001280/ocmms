package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;
import com.ocmms.cmms.model.pm.routine.QEquipmentScrappingRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentScrappingRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentScrappingRecordRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentScrappingRecord>
		implements EquipmentScrappingRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentScrappingRecordRepositoryImpl() {
		super(EquipmentScrappingRecord.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOCATION = "location";

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
	public static final String STORAGE_LOCATION = "storageLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SCRAPPING_DATE = "scrappingDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORKER = "worker";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentScrappingRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentScrappingRecord equipmentScrappingRecord = QEquipmentScrappingRecord.equipmentScrappingRecord;
		JPQLQuery<EquipmentScrappingRecord> query = from(equipmentScrappingRecord);
		Path<?>[] paths = new Path<?>[] { equipmentScrappingRecord.scrappingDate, equipmentScrappingRecord.description,
				equipmentScrappingRecord.worker, equipmentScrappingRecord.equipment,
				equipmentScrappingRecord.storageLocation, equipmentScrappingRecord.location,
				equipmentScrappingRecord.recordStatus, equipmentScrappingRecord.createdDate,
				equipmentScrappingRecord.createdBy, equipmentScrappingRecord.lastModifiedDate,
				equipmentScrappingRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SCRAPPING_DATE, equipmentScrappingRecord.scrappingDate)
				.map(DESCRIPTION, equipmentScrappingRecord.description).map(WORKER, equipmentScrappingRecord.worker)
				.map(EQUIPMENT, equipmentScrappingRecord.equipment)
				.map(STORAGE_LOCATION, equipmentScrappingRecord.storageLocation)
				.map(LOCATION, equipmentScrappingRecord.location)
				.map(RECORD_STATUS, equipmentScrappingRecord.recordStatus)
				.map(CREATED_DATE, equipmentScrappingRecord.createdDate)
				.map(CREATED_BY, equipmentScrappingRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentScrappingRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentScrappingRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentScrappingRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentScrappingRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentScrappingRecord equipmentScrappingRecord = QEquipmentScrappingRecord.equipmentScrappingRecord;
		JPQLQuery<EquipmentScrappingRecord> query = from(equipmentScrappingRecord);
		Path<?>[] paths = new Path<?>[] { equipmentScrappingRecord.scrappingDate, equipmentScrappingRecord.description,
				equipmentScrappingRecord.worker, equipmentScrappingRecord.equipment,
				equipmentScrappingRecord.storageLocation, equipmentScrappingRecord.location,
				equipmentScrappingRecord.recordStatus, equipmentScrappingRecord.createdDate,
				equipmentScrappingRecord.createdBy, equipmentScrappingRecord.lastModifiedDate,
				equipmentScrappingRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipmentScrappingRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(SCRAPPING_DATE, equipmentScrappingRecord.scrappingDate)
				.map(DESCRIPTION, equipmentScrappingRecord.description).map(WORKER, equipmentScrappingRecord.worker)
				.map(EQUIPMENT, equipmentScrappingRecord.equipment)
				.map(STORAGE_LOCATION, equipmentScrappingRecord.storageLocation)
				.map(LOCATION, equipmentScrappingRecord.location)
				.map(RECORD_STATUS, equipmentScrappingRecord.recordStatus)
				.map(CREATED_DATE, equipmentScrappingRecord.createdDate)
				.map(CREATED_BY, equipmentScrappingRecord.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentScrappingRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentScrappingRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentScrappingRecord);
	}
}
