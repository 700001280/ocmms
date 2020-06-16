package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.model.mm.storage.QInstockDetail;
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
 * = InstockDetailRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class InstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<InstockDetail>
		implements InstockDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	InstockDetailRepositoryImpl() {
		super(InstockDetail.class);
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
	public Page<InstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QInstockDetail instockDetail = QInstockDetail.instockDetail;
		JPQLQuery<InstockDetail> query = from(instockDetail);
		Path<?>[] paths = new Path<?>[] { instockDetail.materialCatalog, instockDetail.storageLocation,
				instockDetail.quantity, instockDetail.storageType, instockDetail.movementType,
				instockDetail.goodReceiveNo, instockDetail.receiveDate, instockDetail.expirationDate,
				instockDetail.serialNumber, instockDetail.receiver, instockDetail.keeper, instockDetail.memo,
				instockDetail.closed, instockDetail.recordStatus, instockDetail.createdDate, instockDetail.createdBy,
				instockDetail.lastModifiedDate, instockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, instockDetail.materialCatalog)
				.map(STORAGE_LOCATION, instockDetail.storageLocation).map(QUANTITY, instockDetail.quantity)
				.map(STORAGE_TYPE, instockDetail.storageType).map(MOVEMENT_TYPE, instockDetail.movementType)
				.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo).map(RECEIVE_DATE, instockDetail.receiveDate)
				.map(EXPIRATION_DATE, instockDetail.expirationDate).map(SERIAL_NUMBER, instockDetail.serialNumber)
				.map(RECEIVER, instockDetail.receiver).map(KEEPER, instockDetail.keeper).map(MEMO, instockDetail.memo)
				.map(CLOSED, instockDetail.closed).map(RECORD_STATUS, instockDetail.recordStatus)
				.map(CREATED_DATE, instockDetail.createdDate).map(CREATED_BY, instockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<InstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QInstockDetail instockDetail = QInstockDetail.instockDetail;
		JPQLQuery<InstockDetail> query = from(instockDetail);
		Path<?>[] paths = new Path<?>[] { instockDetail.materialCatalog, instockDetail.storageLocation,
				instockDetail.quantity, instockDetail.storageType, instockDetail.movementType,
				instockDetail.goodReceiveNo, instockDetail.receiveDate, instockDetail.expirationDate,
				instockDetail.serialNumber, instockDetail.receiver, instockDetail.keeper, instockDetail.memo,
				instockDetail.closed, instockDetail.recordStatus, instockDetail.createdDate, instockDetail.createdBy,
				instockDetail.lastModifiedDate, instockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(instockDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, instockDetail.materialCatalog)
				.map(STORAGE_LOCATION, instockDetail.storageLocation).map(QUANTITY, instockDetail.quantity)
				.map(STORAGE_TYPE, instockDetail.storageType).map(MOVEMENT_TYPE, instockDetail.movementType)
				.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo).map(RECEIVE_DATE, instockDetail.receiveDate)
				.map(EXPIRATION_DATE, instockDetail.expirationDate).map(SERIAL_NUMBER, instockDetail.serialNumber)
				.map(RECEIVER, instockDetail.receiver).map(KEEPER, instockDetail.keeper).map(MEMO, instockDetail.memo)
				.map(CLOSED, instockDetail.closed).map(RECORD_STATUS, instockDetail.recordStatus)
				.map(CREATED_DATE, instockDetail.createdDate).map(CREATED_BY, instockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<InstockDetail> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable) {
		QInstockDetail instockDetail = QInstockDetail.instockDetail;
		JPQLQuery<InstockDetail> query = from(instockDetail);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(instockDetail.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { instockDetail.materialCatalog, instockDetail.storageLocation,
				instockDetail.quantity, instockDetail.storageType, instockDetail.movementType,
				instockDetail.goodReceiveNo, instockDetail.receiveDate, instockDetail.expirationDate,
				instockDetail.serialNumber, instockDetail.receiver, instockDetail.keeper, instockDetail.memo,
				instockDetail.closed, instockDetail.recordStatus, instockDetail.createdDate, instockDetail.createdBy,
				instockDetail.lastModifiedDate, instockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, instockDetail.materialCatalog)
				.map(STORAGE_LOCATION, instockDetail.storageLocation).map(QUANTITY, instockDetail.quantity)
				.map(STORAGE_TYPE, instockDetail.storageType).map(MOVEMENT_TYPE, instockDetail.movementType)
				.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo).map(RECEIVE_DATE, instockDetail.receiveDate)
				.map(EXPIRATION_DATE, instockDetail.expirationDate).map(SERIAL_NUMBER, instockDetail.serialNumber)
				.map(RECEIVER, instockDetail.receiver).map(KEEPER, instockDetail.keeper).map(MEMO, instockDetail.memo)
				.map(CLOSED, instockDetail.closed).map(RECORD_STATUS, instockDetail.recordStatus)
				.map(CREATED_DATE, instockDetail.createdDate).map(CREATED_BY, instockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param movementType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<InstockDetail> findByMovementType(MovementType movementType, GlobalSearch globalSearch,
			Pageable pageable) {
		QInstockDetail instockDetail = QInstockDetail.instockDetail;
		JPQLQuery<InstockDetail> query = from(instockDetail);
		Assert.notNull(movementType, "movementType is required");
		query.where(instockDetail.movementType.eq(movementType));
		Path<?>[] paths = new Path<?>[] { instockDetail.materialCatalog, instockDetail.storageLocation,
				instockDetail.quantity, instockDetail.storageType, instockDetail.movementType,
				instockDetail.goodReceiveNo, instockDetail.receiveDate, instockDetail.expirationDate,
				instockDetail.serialNumber, instockDetail.receiver, instockDetail.keeper, instockDetail.memo,
				instockDetail.closed, instockDetail.recordStatus, instockDetail.createdDate, instockDetail.createdBy,
				instockDetail.lastModifiedDate, instockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, instockDetail.materialCatalog)
				.map(STORAGE_LOCATION, instockDetail.storageLocation).map(QUANTITY, instockDetail.quantity)
				.map(STORAGE_TYPE, instockDetail.storageType).map(MOVEMENT_TYPE, instockDetail.movementType)
				.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo).map(RECEIVE_DATE, instockDetail.receiveDate)
				.map(EXPIRATION_DATE, instockDetail.expirationDate).map(SERIAL_NUMBER, instockDetail.serialNumber)
				.map(RECEIVER, instockDetail.receiver).map(KEEPER, instockDetail.keeper).map(MEMO, instockDetail.memo)
				.map(CLOSED, instockDetail.closed).map(RECORD_STATUS, instockDetail.recordStatus)
				.map(CREATED_DATE, instockDetail.createdDate).map(CREATED_BY, instockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<InstockDetail> findByStorageLocation(StorageLocation storageLocation, GlobalSearch globalSearch,
			Pageable pageable) {
		QInstockDetail instockDetail = QInstockDetail.instockDetail;
		JPQLQuery<InstockDetail> query = from(instockDetail);
		Assert.notNull(storageLocation, "storageLocation is required");
		query.where(instockDetail.storageLocation.eq(storageLocation));
		Path<?>[] paths = new Path<?>[] { instockDetail.materialCatalog, instockDetail.storageLocation,
				instockDetail.quantity, instockDetail.storageType, instockDetail.movementType,
				instockDetail.goodReceiveNo, instockDetail.receiveDate, instockDetail.expirationDate,
				instockDetail.serialNumber, instockDetail.receiver, instockDetail.keeper, instockDetail.memo,
				instockDetail.closed, instockDetail.recordStatus, instockDetail.createdDate, instockDetail.createdBy,
				instockDetail.lastModifiedDate, instockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, instockDetail.materialCatalog)
				.map(STORAGE_LOCATION, instockDetail.storageLocation).map(QUANTITY, instockDetail.quantity)
				.map(STORAGE_TYPE, instockDetail.storageType).map(MOVEMENT_TYPE, instockDetail.movementType)
				.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo).map(RECEIVE_DATE, instockDetail.receiveDate)
				.map(EXPIRATION_DATE, instockDetail.expirationDate).map(SERIAL_NUMBER, instockDetail.serialNumber)
				.map(RECEIVER, instockDetail.receiver).map(KEEPER, instockDetail.keeper).map(MEMO, instockDetail.memo)
				.map(CLOSED, instockDetail.closed).map(RECORD_STATUS, instockDetail.recordStatus)
				.map(CREATED_DATE, instockDetail.createdDate).map(CREATED_BY, instockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<InstockDetail> findByStorageType(StorageType storageType, GlobalSearch globalSearch,
			Pageable pageable) {
		QInstockDetail instockDetail = QInstockDetail.instockDetail;
		JPQLQuery<InstockDetail> query = from(instockDetail);
		Assert.notNull(storageType, "storageType is required");
		query.where(instockDetail.storageType.eq(storageType));
		Path<?>[] paths = new Path<?>[] { instockDetail.materialCatalog, instockDetail.storageLocation,
				instockDetail.quantity, instockDetail.storageType, instockDetail.movementType,
				instockDetail.goodReceiveNo, instockDetail.receiveDate, instockDetail.expirationDate,
				instockDetail.serialNumber, instockDetail.receiver, instockDetail.keeper, instockDetail.memo,
				instockDetail.closed, instockDetail.recordStatus, instockDetail.createdDate, instockDetail.createdBy,
				instockDetail.lastModifiedDate, instockDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, instockDetail.materialCatalog)
				.map(STORAGE_LOCATION, instockDetail.storageLocation).map(QUANTITY, instockDetail.quantity)
				.map(STORAGE_TYPE, instockDetail.storageType).map(MOVEMENT_TYPE, instockDetail.movementType)
				.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo).map(RECEIVE_DATE, instockDetail.receiveDate)
				.map(EXPIRATION_DATE, instockDetail.expirationDate).map(SERIAL_NUMBER, instockDetail.serialNumber)
				.map(RECEIVER, instockDetail.receiver).map(KEEPER, instockDetail.keeper).map(MEMO, instockDetail.memo)
				.map(CLOSED, instockDetail.closed).map(RECORD_STATUS, instockDetail.recordStatus)
				.map(CREATED_DATE, instockDetail.createdDate).map(CREATED_BY, instockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, instockDetail);
	}
}
