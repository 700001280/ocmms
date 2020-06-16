package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;
import com.ocmms.cmms.model.mm.storage.QRepairMaterialInstockDetail;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = RepairMaterialInstockDetailRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class RepairMaterialInstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<RepairMaterialInstockDetail>
		implements RepairMaterialInstockDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	RepairMaterialInstockDetailRepositoryImpl() {
		super(RepairMaterialInstockDetail.class);
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
	public static final String PART_MAINTENANCE_RECORD = "partMaintenanceRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLOSED = "closed";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String QUANTITY = "quantity";

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
	public static final String MOVEMENT_TYPE = "movementType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SERIAL_NUMBER = "serialNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String GOOD_RECEIVE_NO = "goodReceiveNo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EXPIRATION_DATE = "expirationDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECEIVE_DATE = "receiveDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String STORAGE_LOCATION = "storageLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String KEEPER = "keeper";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String STORAGE_TYPE = "storageType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECEIVER = "receiver";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<RepairMaterialInstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QRepairMaterialInstockDetail repairMaterialInstockDetail = QRepairMaterialInstockDetail.repairMaterialInstockDetail;
		JPQLQuery<RepairMaterialInstockDetail> query = from(repairMaterialInstockDetail);
		Path<?>[] paths = new Path<?>[] { repairMaterialInstockDetail.materialCatalog,
				repairMaterialInstockDetail.storageLocation, repairMaterialInstockDetail.quantity,
				repairMaterialInstockDetail.storageType, repairMaterialInstockDetail.movementType,
				repairMaterialInstockDetail.goodReceiveNo, repairMaterialInstockDetail.receiveDate,
				repairMaterialInstockDetail.expirationDate, repairMaterialInstockDetail.serialNumber,
				repairMaterialInstockDetail.receiver, repairMaterialInstockDetail.keeper,
				repairMaterialInstockDetail.memo, repairMaterialInstockDetail.closed,
				repairMaterialInstockDetail.recordStatus, repairMaterialInstockDetail.createdDate,
				repairMaterialInstockDetail.createdBy, repairMaterialInstockDetail.lastModifiedDate,
				repairMaterialInstockDetail.lastModifiedBy, repairMaterialInstockDetail.partMaintenanceRecord };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, repairMaterialInstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, repairMaterialInstockDetail.storageLocation)
				.map(QUANTITY, repairMaterialInstockDetail.quantity)
				.map(STORAGE_TYPE, repairMaterialInstockDetail.storageType)
				.map(MOVEMENT_TYPE, repairMaterialInstockDetail.movementType)
				.map(GOOD_RECEIVE_NO, repairMaterialInstockDetail.goodReceiveNo)
				.map(RECEIVE_DATE, repairMaterialInstockDetail.receiveDate)
				.map(EXPIRATION_DATE, repairMaterialInstockDetail.expirationDate)
				.map(SERIAL_NUMBER, repairMaterialInstockDetail.serialNumber)
				.map(RECEIVER, repairMaterialInstockDetail.receiver).map(KEEPER, repairMaterialInstockDetail.keeper)
				.map(MEMO, repairMaterialInstockDetail.memo).map(CLOSED, repairMaterialInstockDetail.closed)
				.map(RECORD_STATUS, repairMaterialInstockDetail.recordStatus)
				.map(CREATED_DATE, repairMaterialInstockDetail.createdDate)
				.map(CREATED_BY, repairMaterialInstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, repairMaterialInstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, repairMaterialInstockDetail.lastModifiedBy)
				.map(PART_MAINTENANCE_RECORD, repairMaterialInstockDetail.partMaintenanceRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, repairMaterialInstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<RepairMaterialInstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QRepairMaterialInstockDetail repairMaterialInstockDetail = QRepairMaterialInstockDetail.repairMaterialInstockDetail;
		JPQLQuery<RepairMaterialInstockDetail> query = from(repairMaterialInstockDetail);
		Path<?>[] paths = new Path<?>[] { repairMaterialInstockDetail.materialCatalog,
				repairMaterialInstockDetail.storageLocation, repairMaterialInstockDetail.quantity,
				repairMaterialInstockDetail.storageType, repairMaterialInstockDetail.movementType,
				repairMaterialInstockDetail.goodReceiveNo, repairMaterialInstockDetail.receiveDate,
				repairMaterialInstockDetail.expirationDate, repairMaterialInstockDetail.serialNumber,
				repairMaterialInstockDetail.receiver, repairMaterialInstockDetail.keeper,
				repairMaterialInstockDetail.memo, repairMaterialInstockDetail.closed,
				repairMaterialInstockDetail.recordStatus, repairMaterialInstockDetail.createdDate,
				repairMaterialInstockDetail.createdBy, repairMaterialInstockDetail.lastModifiedDate,
				repairMaterialInstockDetail.lastModifiedBy, repairMaterialInstockDetail.partMaintenanceRecord };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(repairMaterialInstockDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, repairMaterialInstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, repairMaterialInstockDetail.storageLocation)
				.map(QUANTITY, repairMaterialInstockDetail.quantity)
				.map(STORAGE_TYPE, repairMaterialInstockDetail.storageType)
				.map(MOVEMENT_TYPE, repairMaterialInstockDetail.movementType)
				.map(GOOD_RECEIVE_NO, repairMaterialInstockDetail.goodReceiveNo)
				.map(RECEIVE_DATE, repairMaterialInstockDetail.receiveDate)
				.map(EXPIRATION_DATE, repairMaterialInstockDetail.expirationDate)
				.map(SERIAL_NUMBER, repairMaterialInstockDetail.serialNumber)
				.map(RECEIVER, repairMaterialInstockDetail.receiver).map(KEEPER, repairMaterialInstockDetail.keeper)
				.map(MEMO, repairMaterialInstockDetail.memo).map(CLOSED, repairMaterialInstockDetail.closed)
				.map(RECORD_STATUS, repairMaterialInstockDetail.recordStatus)
				.map(CREATED_DATE, repairMaterialInstockDetail.createdDate)
				.map(CREATED_BY, repairMaterialInstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, repairMaterialInstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, repairMaterialInstockDetail.lastModifiedBy)
				.map(PART_MAINTENANCE_RECORD, repairMaterialInstockDetail.partMaintenanceRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, repairMaterialInstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<RepairMaterialInstockDetail> findByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QRepairMaterialInstockDetail repairMaterialInstockDetail = QRepairMaterialInstockDetail.repairMaterialInstockDetail;
		JPQLQuery<RepairMaterialInstockDetail> query = from(repairMaterialInstockDetail);
		Assert.notNull(partMaintenanceRecord, "partMaintenanceRecord is required");
		query.where(repairMaterialInstockDetail.partMaintenanceRecord.eq(partMaintenanceRecord));
		Path<?>[] paths = new Path<?>[] { repairMaterialInstockDetail.materialCatalog,
				repairMaterialInstockDetail.storageLocation, repairMaterialInstockDetail.quantity,
				repairMaterialInstockDetail.storageType, repairMaterialInstockDetail.movementType,
				repairMaterialInstockDetail.goodReceiveNo, repairMaterialInstockDetail.receiveDate,
				repairMaterialInstockDetail.expirationDate, repairMaterialInstockDetail.serialNumber,
				repairMaterialInstockDetail.receiver, repairMaterialInstockDetail.keeper,
				repairMaterialInstockDetail.memo, repairMaterialInstockDetail.closed,
				repairMaterialInstockDetail.recordStatus, repairMaterialInstockDetail.createdDate,
				repairMaterialInstockDetail.createdBy, repairMaterialInstockDetail.lastModifiedDate,
				repairMaterialInstockDetail.lastModifiedBy, repairMaterialInstockDetail.partMaintenanceRecord };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, repairMaterialInstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, repairMaterialInstockDetail.storageLocation)
				.map(QUANTITY, repairMaterialInstockDetail.quantity)
				.map(STORAGE_TYPE, repairMaterialInstockDetail.storageType)
				.map(MOVEMENT_TYPE, repairMaterialInstockDetail.movementType)
				.map(GOOD_RECEIVE_NO, repairMaterialInstockDetail.goodReceiveNo)
				.map(RECEIVE_DATE, repairMaterialInstockDetail.receiveDate)
				.map(EXPIRATION_DATE, repairMaterialInstockDetail.expirationDate)
				.map(SERIAL_NUMBER, repairMaterialInstockDetail.serialNumber)
				.map(RECEIVER, repairMaterialInstockDetail.receiver).map(KEEPER, repairMaterialInstockDetail.keeper)
				.map(MEMO, repairMaterialInstockDetail.memo).map(CLOSED, repairMaterialInstockDetail.closed)
				.map(RECORD_STATUS, repairMaterialInstockDetail.recordStatus)
				.map(CREATED_DATE, repairMaterialInstockDetail.createdDate)
				.map(CREATED_BY, repairMaterialInstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, repairMaterialInstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, repairMaterialInstockDetail.lastModifiedBy)
				.map(PART_MAINTENANCE_RECORD, repairMaterialInstockDetail.partMaintenanceRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, repairMaterialInstockDetail);
	}
}
