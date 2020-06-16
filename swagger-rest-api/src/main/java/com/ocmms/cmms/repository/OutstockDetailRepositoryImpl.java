package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.model.mm.storage.QOutstockDetail;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.mm.storage.StorageType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = OutstockDetailRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class OutstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<OutstockDetail>
		implements OutstockDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	OutstockDetailRepositoryImpl() {
		super(OutstockDetail.class);
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
	public Page<OutstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QOutstockDetail outstockDetail = QOutstockDetail.outstockDetail;
		JPQLQuery<OutstockDetail> query = from(outstockDetail);
		Path<?>[] paths = new Path<?>[] { outstockDetail.organization, outstockDetail.materialCatalog,
				outstockDetail.storageLocation, outstockDetail.storageType, outstockDetail.serialNumber,
				outstockDetail.outstockQuantity, outstockDetail.issueDate, outstockDetail.receiver,
				outstockDetail.keeper, outstockDetail.memo, outstockDetail.movementType, outstockDetail.recordStatus,
				outstockDetail.createdDate, outstockDetail.createdBy, outstockDetail.lastModifiedDate,
				outstockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, outstockDetail.organization)
				.map(MATERIAL_CATALOG, outstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, outstockDetail.storageLocation).map(STORAGE_TYPE, outstockDetail.storageType)
				.map(SERIAL_NUMBER, outstockDetail.serialNumber).map(OUTSTOCK_QUANTITY, outstockDetail.outstockQuantity)
				.map(ISSUE_DATE, outstockDetail.issueDate).map(RECEIVER, outstockDetail.receiver)
				.map(KEEPER, outstockDetail.keeper).map(MEMO, outstockDetail.memo)
				.map(MOVEMENT_TYPE, outstockDetail.movementType).map(RECORD_STATUS, outstockDetail.recordStatus)
				.map(CREATED_DATE, outstockDetail.createdDate).map(CREATED_BY, outstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, outstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, outstockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, outstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OutstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QOutstockDetail outstockDetail = QOutstockDetail.outstockDetail;
		JPQLQuery<OutstockDetail> query = from(outstockDetail);
		Path<?>[] paths = new Path<?>[] { outstockDetail.organization, outstockDetail.materialCatalog,
				outstockDetail.storageLocation, outstockDetail.storageType, outstockDetail.serialNumber,
				outstockDetail.outstockQuantity, outstockDetail.issueDate, outstockDetail.receiver,
				outstockDetail.keeper, outstockDetail.memo, outstockDetail.movementType, outstockDetail.recordStatus,
				outstockDetail.createdDate, outstockDetail.createdBy, outstockDetail.lastModifiedDate,
				outstockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(outstockDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, outstockDetail.organization)
				.map(MATERIAL_CATALOG, outstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, outstockDetail.storageLocation).map(STORAGE_TYPE, outstockDetail.storageType)
				.map(SERIAL_NUMBER, outstockDetail.serialNumber).map(OUTSTOCK_QUANTITY, outstockDetail.outstockQuantity)
				.map(ISSUE_DATE, outstockDetail.issueDate).map(RECEIVER, outstockDetail.receiver)
				.map(KEEPER, outstockDetail.keeper).map(MEMO, outstockDetail.memo)
				.map(MOVEMENT_TYPE, outstockDetail.movementType).map(RECORD_STATUS, outstockDetail.recordStatus)
				.map(CREATED_DATE, outstockDetail.createdDate).map(CREATED_BY, outstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, outstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, outstockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, outstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OutstockDetail> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable) {
		QOutstockDetail outstockDetail = QOutstockDetail.outstockDetail;
		JPQLQuery<OutstockDetail> query = from(outstockDetail);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(outstockDetail.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { outstockDetail.organization, outstockDetail.materialCatalog,
				outstockDetail.storageLocation, outstockDetail.storageType, outstockDetail.serialNumber,
				outstockDetail.outstockQuantity, outstockDetail.issueDate, outstockDetail.receiver,
				outstockDetail.keeper, outstockDetail.memo, outstockDetail.movementType, outstockDetail.recordStatus,
				outstockDetail.createdDate, outstockDetail.createdBy, outstockDetail.lastModifiedDate,
				outstockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, outstockDetail.organization)
				.map(MATERIAL_CATALOG, outstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, outstockDetail.storageLocation).map(STORAGE_TYPE, outstockDetail.storageType)
				.map(SERIAL_NUMBER, outstockDetail.serialNumber).map(OUTSTOCK_QUANTITY, outstockDetail.outstockQuantity)
				.map(ISSUE_DATE, outstockDetail.issueDate).map(RECEIVER, outstockDetail.receiver)
				.map(KEEPER, outstockDetail.keeper).map(MEMO, outstockDetail.memo)
				.map(MOVEMENT_TYPE, outstockDetail.movementType).map(RECORD_STATUS, outstockDetail.recordStatus)
				.map(CREATED_DATE, outstockDetail.createdDate).map(CREATED_BY, outstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, outstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, outstockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, outstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param movementType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OutstockDetail> findByMovementType(MovementType movementType, GlobalSearch globalSearch,
			Pageable pageable) {
		QOutstockDetail outstockDetail = QOutstockDetail.outstockDetail;
		JPQLQuery<OutstockDetail> query = from(outstockDetail);
		Assert.notNull(movementType, "movementType is required");
		query.where(outstockDetail.movementType.eq(movementType));
		Path<?>[] paths = new Path<?>[] { outstockDetail.organization, outstockDetail.materialCatalog,
				outstockDetail.storageLocation, outstockDetail.storageType, outstockDetail.serialNumber,
				outstockDetail.outstockQuantity, outstockDetail.issueDate, outstockDetail.receiver,
				outstockDetail.keeper, outstockDetail.memo, outstockDetail.movementType, outstockDetail.recordStatus,
				outstockDetail.createdDate, outstockDetail.createdBy, outstockDetail.lastModifiedDate,
				outstockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, outstockDetail.organization)
				.map(MATERIAL_CATALOG, outstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, outstockDetail.storageLocation).map(STORAGE_TYPE, outstockDetail.storageType)
				.map(SERIAL_NUMBER, outstockDetail.serialNumber).map(OUTSTOCK_QUANTITY, outstockDetail.outstockQuantity)
				.map(ISSUE_DATE, outstockDetail.issueDate).map(RECEIVER, outstockDetail.receiver)
				.map(KEEPER, outstockDetail.keeper).map(MEMO, outstockDetail.memo)
				.map(MOVEMENT_TYPE, outstockDetail.movementType).map(RECORD_STATUS, outstockDetail.recordStatus)
				.map(CREATED_DATE, outstockDetail.createdDate).map(CREATED_BY, outstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, outstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, outstockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, outstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OutstockDetail> findByStorageLocation(StorageLocation storageLocation, GlobalSearch globalSearch,
			Pageable pageable) {
		QOutstockDetail outstockDetail = QOutstockDetail.outstockDetail;
		JPQLQuery<OutstockDetail> query = from(outstockDetail);
		Assert.notNull(storageLocation, "storageLocation is required");
		query.where(outstockDetail.storageLocation.eq(storageLocation));
		Path<?>[] paths = new Path<?>[] { outstockDetail.organization, outstockDetail.materialCatalog,
				outstockDetail.storageLocation, outstockDetail.storageType, outstockDetail.serialNumber,
				outstockDetail.outstockQuantity, outstockDetail.issueDate, outstockDetail.receiver,
				outstockDetail.keeper, outstockDetail.memo, outstockDetail.movementType, outstockDetail.recordStatus,
				outstockDetail.createdDate, outstockDetail.createdBy, outstockDetail.lastModifiedDate,
				outstockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, outstockDetail.organization)
				.map(MATERIAL_CATALOG, outstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, outstockDetail.storageLocation).map(STORAGE_TYPE, outstockDetail.storageType)
				.map(SERIAL_NUMBER, outstockDetail.serialNumber).map(OUTSTOCK_QUANTITY, outstockDetail.outstockQuantity)
				.map(ISSUE_DATE, outstockDetail.issueDate).map(RECEIVER, outstockDetail.receiver)
				.map(KEEPER, outstockDetail.keeper).map(MEMO, outstockDetail.memo)
				.map(MOVEMENT_TYPE, outstockDetail.movementType).map(RECORD_STATUS, outstockDetail.recordStatus)
				.map(CREATED_DATE, outstockDetail.createdDate).map(CREATED_BY, outstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, outstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, outstockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, outstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OutstockDetail> findByStorageType(StorageType storageType, GlobalSearch globalSearch,
			Pageable pageable) {
		QOutstockDetail outstockDetail = QOutstockDetail.outstockDetail;
		JPQLQuery<OutstockDetail> query = from(outstockDetail);
		Assert.notNull(storageType, "storageType is required");
		query.where(outstockDetail.storageType.eq(storageType));
		Path<?>[] paths = new Path<?>[] { outstockDetail.organization, outstockDetail.materialCatalog,
				outstockDetail.storageLocation, outstockDetail.storageType, outstockDetail.serialNumber,
				outstockDetail.outstockQuantity, outstockDetail.issueDate, outstockDetail.receiver,
				outstockDetail.keeper, outstockDetail.memo, outstockDetail.movementType, outstockDetail.recordStatus,
				outstockDetail.createdDate, outstockDetail.createdBy, outstockDetail.lastModifiedDate,
				outstockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, outstockDetail.organization)
				.map(MATERIAL_CATALOG, outstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, outstockDetail.storageLocation).map(STORAGE_TYPE, outstockDetail.storageType)
				.map(SERIAL_NUMBER, outstockDetail.serialNumber).map(OUTSTOCK_QUANTITY, outstockDetail.outstockQuantity)
				.map(ISSUE_DATE, outstockDetail.issueDate).map(RECEIVER, outstockDetail.receiver)
				.map(KEEPER, outstockDetail.keeper).map(MEMO, outstockDetail.memo)
				.map(MOVEMENT_TYPE, outstockDetail.movementType).map(RECORD_STATUS, outstockDetail.recordStatus)
				.map(CREATED_DATE, outstockDetail.createdDate).map(CREATED_BY, outstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, outstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, outstockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, outstockDetail);
	}
}
