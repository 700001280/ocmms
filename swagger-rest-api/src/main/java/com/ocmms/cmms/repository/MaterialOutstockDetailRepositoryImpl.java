package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.mm.storage.QMaterialOutstockDetail;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MaterialOutstockDetailRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialOutstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<MaterialOutstockDetail>
		implements MaterialOutstockDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialOutstockDetailRepositoryImpl() {
		super(MaterialOutstockDetail.class);
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
	public static final String EQUIPMENT_MAINTENANCE_RECORD = "equipmentMaintenanceRecord";

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
	public static final String OUTSTOCK_QUANTITY = "outstockQuantity";

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
	public static final String ORDER_NO = "orderNo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SERIAL_NUMBER = "serialNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String STORAGE_LOCATION = "storageLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ISSUE_DATE = "issueDate";

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
	public Page<MaterialOutstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialOutstockDetail materialOutstockDetail = QMaterialOutstockDetail.materialOutstockDetail;
		JPQLQuery<MaterialOutstockDetail> query = from(materialOutstockDetail);
		Path<?>[] paths = new Path<?>[] { materialOutstockDetail.organization, materialOutstockDetail.materialCatalog,
				materialOutstockDetail.storageLocation, materialOutstockDetail.storageType,
				materialOutstockDetail.serialNumber, materialOutstockDetail.outstockQuantity,
				materialOutstockDetail.issueDate, materialOutstockDetail.receiver, materialOutstockDetail.keeper,
				materialOutstockDetail.memo, materialOutstockDetail.movementType, materialOutstockDetail.recordStatus,
				materialOutstockDetail.createdDate, materialOutstockDetail.createdBy,
				materialOutstockDetail.lastModifiedDate, materialOutstockDetail.lastModifiedBy,
				materialOutstockDetail.orderNo, materialOutstockDetail.equipmentMaintenanceRecord,
				materialOutstockDetail.partMaintenanceRecord };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, materialOutstockDetail.organization)
				.map(MATERIAL_CATALOG, materialOutstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, materialOutstockDetail.storageLocation)
				.map(STORAGE_TYPE, materialOutstockDetail.storageType)
				.map(SERIAL_NUMBER, materialOutstockDetail.serialNumber)
				.map(OUTSTOCK_QUANTITY, materialOutstockDetail.outstockQuantity)
				.map(ISSUE_DATE, materialOutstockDetail.issueDate).map(RECEIVER, materialOutstockDetail.receiver)
				.map(KEEPER, materialOutstockDetail.keeper).map(MEMO, materialOutstockDetail.memo)
				.map(MOVEMENT_TYPE, materialOutstockDetail.movementType)
				.map(RECORD_STATUS, materialOutstockDetail.recordStatus)
				.map(CREATED_DATE, materialOutstockDetail.createdDate).map(CREATED_BY, materialOutstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialOutstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialOutstockDetail.lastModifiedBy)
				.map(ORDER_NO, materialOutstockDetail.orderNo).map(ISSUE_DATE, materialOutstockDetail.issueDate)
				.map(EQUIPMENT_MAINTENANCE_RECORD, materialOutstockDetail.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, materialOutstockDetail.partMaintenanceRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialOutstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialOutstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialOutstockDetail materialOutstockDetail = QMaterialOutstockDetail.materialOutstockDetail;
		JPQLQuery<MaterialOutstockDetail> query = from(materialOutstockDetail);
		Path<?>[] paths = new Path<?>[] { materialOutstockDetail.organization, materialOutstockDetail.materialCatalog,
				materialOutstockDetail.storageLocation, materialOutstockDetail.storageType,
				materialOutstockDetail.serialNumber, materialOutstockDetail.outstockQuantity,
				materialOutstockDetail.issueDate, materialOutstockDetail.receiver, materialOutstockDetail.keeper,
				materialOutstockDetail.memo, materialOutstockDetail.movementType, materialOutstockDetail.recordStatus,
				materialOutstockDetail.createdDate, materialOutstockDetail.createdBy,
				materialOutstockDetail.lastModifiedDate, materialOutstockDetail.lastModifiedBy,
				materialOutstockDetail.orderNo, materialOutstockDetail.equipmentMaintenanceRecord,
				materialOutstockDetail.partMaintenanceRecord };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialOutstockDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, materialOutstockDetail.organization)
				.map(MATERIAL_CATALOG, materialOutstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, materialOutstockDetail.storageLocation)
				.map(STORAGE_TYPE, materialOutstockDetail.storageType)
				.map(SERIAL_NUMBER, materialOutstockDetail.serialNumber)
				.map(OUTSTOCK_QUANTITY, materialOutstockDetail.outstockQuantity)
				.map(ISSUE_DATE, materialOutstockDetail.issueDate).map(RECEIVER, materialOutstockDetail.receiver)
				.map(KEEPER, materialOutstockDetail.keeper).map(MEMO, materialOutstockDetail.memo)
				.map(MOVEMENT_TYPE, materialOutstockDetail.movementType)
				.map(RECORD_STATUS, materialOutstockDetail.recordStatus)
				.map(CREATED_DATE, materialOutstockDetail.createdDate).map(CREATED_BY, materialOutstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialOutstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialOutstockDetail.lastModifiedBy)
				.map(ORDER_NO, materialOutstockDetail.orderNo).map(ISSUE_DATE, materialOutstockDetail.issueDate)
				.map(EQUIPMENT_MAINTENANCE_RECORD, materialOutstockDetail.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, materialOutstockDetail.partMaintenanceRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialOutstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialOutstockDetail> findByEquipmentMaintenanceRecord(
			EquipmentMaintenanceRecord equipmentMaintenanceRecord, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialOutstockDetail materialOutstockDetail = QMaterialOutstockDetail.materialOutstockDetail;
		JPQLQuery<MaterialOutstockDetail> query = from(materialOutstockDetail);
		Assert.notNull(equipmentMaintenanceRecord, "equipmentMaintenanceRecord is required");
		query.where(materialOutstockDetail.equipmentMaintenanceRecord.eq(equipmentMaintenanceRecord));
		Path<?>[] paths = new Path<?>[] { materialOutstockDetail.organization, materialOutstockDetail.materialCatalog,
				materialOutstockDetail.storageLocation, materialOutstockDetail.storageType,
				materialOutstockDetail.serialNumber, materialOutstockDetail.outstockQuantity,
				materialOutstockDetail.issueDate, materialOutstockDetail.receiver, materialOutstockDetail.keeper,
				materialOutstockDetail.memo, materialOutstockDetail.movementType, materialOutstockDetail.recordStatus,
				materialOutstockDetail.createdDate, materialOutstockDetail.createdBy,
				materialOutstockDetail.lastModifiedDate, materialOutstockDetail.lastModifiedBy,
				materialOutstockDetail.orderNo, materialOutstockDetail.equipmentMaintenanceRecord,
				materialOutstockDetail.partMaintenanceRecord };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, materialOutstockDetail.organization)
				.map(MATERIAL_CATALOG, materialOutstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, materialOutstockDetail.storageLocation)
				.map(STORAGE_TYPE, materialOutstockDetail.storageType)
				.map(SERIAL_NUMBER, materialOutstockDetail.serialNumber)
				.map(OUTSTOCK_QUANTITY, materialOutstockDetail.outstockQuantity)
				.map(ISSUE_DATE, materialOutstockDetail.issueDate).map(RECEIVER, materialOutstockDetail.receiver)
				.map(KEEPER, materialOutstockDetail.keeper).map(MEMO, materialOutstockDetail.memo)
				.map(MOVEMENT_TYPE, materialOutstockDetail.movementType)
				.map(RECORD_STATUS, materialOutstockDetail.recordStatus)
				.map(CREATED_DATE, materialOutstockDetail.createdDate).map(CREATED_BY, materialOutstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialOutstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialOutstockDetail.lastModifiedBy)
				.map(ORDER_NO, materialOutstockDetail.orderNo).map(ISSUE_DATE, materialOutstockDetail.issueDate)
				.map(EQUIPMENT_MAINTENANCE_RECORD, materialOutstockDetail.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, materialOutstockDetail.partMaintenanceRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialOutstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialOutstockDetail> findByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QMaterialOutstockDetail materialOutstockDetail = QMaterialOutstockDetail.materialOutstockDetail;
		JPQLQuery<MaterialOutstockDetail> query = from(materialOutstockDetail);
		Assert.notNull(partMaintenanceRecord, "partMaintenanceRecord is required");
		query.where(materialOutstockDetail.partMaintenanceRecord.eq(partMaintenanceRecord));
		Path<?>[] paths = new Path<?>[] { materialOutstockDetail.organization, materialOutstockDetail.materialCatalog,
				materialOutstockDetail.storageLocation, materialOutstockDetail.storageType,
				materialOutstockDetail.serialNumber, materialOutstockDetail.outstockQuantity,
				materialOutstockDetail.issueDate, materialOutstockDetail.receiver, materialOutstockDetail.keeper,
				materialOutstockDetail.memo, materialOutstockDetail.movementType, materialOutstockDetail.recordStatus,
				materialOutstockDetail.createdDate, materialOutstockDetail.createdBy,
				materialOutstockDetail.lastModifiedDate, materialOutstockDetail.lastModifiedBy,
				materialOutstockDetail.orderNo, materialOutstockDetail.equipmentMaintenanceRecord,
				materialOutstockDetail.partMaintenanceRecord };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, materialOutstockDetail.organization)
				.map(MATERIAL_CATALOG, materialOutstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, materialOutstockDetail.storageLocation)
				.map(STORAGE_TYPE, materialOutstockDetail.storageType)
				.map(SERIAL_NUMBER, materialOutstockDetail.serialNumber)
				.map(OUTSTOCK_QUANTITY, materialOutstockDetail.outstockQuantity)
				.map(ISSUE_DATE, materialOutstockDetail.issueDate).map(RECEIVER, materialOutstockDetail.receiver)
				.map(KEEPER, materialOutstockDetail.keeper).map(MEMO, materialOutstockDetail.memo)
				.map(MOVEMENT_TYPE, materialOutstockDetail.movementType)
				.map(RECORD_STATUS, materialOutstockDetail.recordStatus)
				.map(CREATED_DATE, materialOutstockDetail.createdDate).map(CREATED_BY, materialOutstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialOutstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialOutstockDetail.lastModifiedBy)
				.map(ORDER_NO, materialOutstockDetail.orderNo).map(ISSUE_DATE, materialOutstockDetail.issueDate)
				.map(EQUIPMENT_MAINTENANCE_RECORD, materialOutstockDetail.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, materialOutstockDetail.partMaintenanceRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialOutstockDetail);
	}
}
