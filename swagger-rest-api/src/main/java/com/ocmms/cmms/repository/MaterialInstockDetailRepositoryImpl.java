package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.QMaterialInstockDetail;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MaterialInstockDetailRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialInstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<MaterialInstockDetail>
		implements MaterialInstockDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialInstockDetailRepositoryImpl() {
		super(MaterialInstockDetail.class);
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
	public static final String MATERIAL_PROCUREMENT_ITEM_DETAIL = "materialProcurementItemDetail";

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
	public Page<MaterialInstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialInstockDetail materialInstockDetail = QMaterialInstockDetail.materialInstockDetail;
		JPQLQuery<MaterialInstockDetail> query = from(materialInstockDetail);
		Path<?>[] paths = new Path<?>[] { materialInstockDetail.materialCatalog, materialInstockDetail.storageLocation,
				materialInstockDetail.quantity, materialInstockDetail.storageType, materialInstockDetail.movementType,
				materialInstockDetail.goodReceiveNo, materialInstockDetail.receiveDate,
				materialInstockDetail.expirationDate, materialInstockDetail.serialNumber,
				materialInstockDetail.receiver, materialInstockDetail.keeper, materialInstockDetail.memo,
				materialInstockDetail.closed, materialInstockDetail.recordStatus, materialInstockDetail.createdDate,
				materialInstockDetail.createdBy, materialInstockDetail.lastModifiedDate,
				materialInstockDetail.lastModifiedBy, materialInstockDetail.materialProcurementItemDetail };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, materialInstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, materialInstockDetail.storageLocation)
				.map(QUANTITY, materialInstockDetail.quantity).map(STORAGE_TYPE, materialInstockDetail.storageType)
				.map(MOVEMENT_TYPE, materialInstockDetail.movementType)
				.map(GOOD_RECEIVE_NO, materialInstockDetail.goodReceiveNo)
				.map(RECEIVE_DATE, materialInstockDetail.receiveDate)
				.map(EXPIRATION_DATE, materialInstockDetail.expirationDate)
				.map(SERIAL_NUMBER, materialInstockDetail.serialNumber).map(RECEIVER, materialInstockDetail.receiver)
				.map(KEEPER, materialInstockDetail.keeper).map(MEMO, materialInstockDetail.memo)
				.map(CLOSED, materialInstockDetail.closed).map(RECORD_STATUS, materialInstockDetail.recordStatus)
				.map(CREATED_DATE, materialInstockDetail.createdDate).map(CREATED_BY, materialInstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialInstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialInstockDetail.lastModifiedBy)
				.map(MATERIAL_PROCUREMENT_ITEM_DETAIL, materialInstockDetail.materialProcurementItemDetail);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialInstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialInstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialInstockDetail materialInstockDetail = QMaterialInstockDetail.materialInstockDetail;
		JPQLQuery<MaterialInstockDetail> query = from(materialInstockDetail);
		Path<?>[] paths = new Path<?>[] { materialInstockDetail.materialCatalog, materialInstockDetail.storageLocation,
				materialInstockDetail.quantity, materialInstockDetail.storageType, materialInstockDetail.movementType,
				materialInstockDetail.goodReceiveNo, materialInstockDetail.receiveDate,
				materialInstockDetail.expirationDate, materialInstockDetail.serialNumber,
				materialInstockDetail.receiver, materialInstockDetail.keeper, materialInstockDetail.memo,
				materialInstockDetail.closed, materialInstockDetail.recordStatus, materialInstockDetail.createdDate,
				materialInstockDetail.createdBy, materialInstockDetail.lastModifiedDate,
				materialInstockDetail.lastModifiedBy, materialInstockDetail.materialProcurementItemDetail };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialInstockDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, materialInstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, materialInstockDetail.storageLocation)
				.map(QUANTITY, materialInstockDetail.quantity).map(STORAGE_TYPE, materialInstockDetail.storageType)
				.map(MOVEMENT_TYPE, materialInstockDetail.movementType)
				.map(GOOD_RECEIVE_NO, materialInstockDetail.goodReceiveNo)
				.map(RECEIVE_DATE, materialInstockDetail.receiveDate)
				.map(EXPIRATION_DATE, materialInstockDetail.expirationDate)
				.map(SERIAL_NUMBER, materialInstockDetail.serialNumber).map(RECEIVER, materialInstockDetail.receiver)
				.map(KEEPER, materialInstockDetail.keeper).map(MEMO, materialInstockDetail.memo)
				.map(CLOSED, materialInstockDetail.closed).map(RECORD_STATUS, materialInstockDetail.recordStatus)
				.map(CREATED_DATE, materialInstockDetail.createdDate).map(CREATED_BY, materialInstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialInstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialInstockDetail.lastModifiedBy)
				.map(MATERIAL_PROCUREMENT_ITEM_DETAIL, materialInstockDetail.materialProcurementItemDetail);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialInstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialProcurementItemDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialInstockDetail> findByMaterialProcurementItemDetail(
			MaterialProcurementItemDetail materialProcurementItemDetail, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialInstockDetail materialInstockDetail = QMaterialInstockDetail.materialInstockDetail;
		JPQLQuery<MaterialInstockDetail> query = from(materialInstockDetail);
		Assert.notNull(materialProcurementItemDetail, "materialProcurementItemDetail is required");
		query.where(materialInstockDetail.materialProcurementItemDetail.eq(materialProcurementItemDetail));
		Path<?>[] paths = new Path<?>[] { materialInstockDetail.materialCatalog, materialInstockDetail.storageLocation,
				materialInstockDetail.quantity, materialInstockDetail.storageType, materialInstockDetail.movementType,
				materialInstockDetail.goodReceiveNo, materialInstockDetail.receiveDate,
				materialInstockDetail.expirationDate, materialInstockDetail.serialNumber,
				materialInstockDetail.receiver, materialInstockDetail.keeper, materialInstockDetail.memo,
				materialInstockDetail.closed, materialInstockDetail.recordStatus, materialInstockDetail.createdDate,
				materialInstockDetail.createdBy, materialInstockDetail.lastModifiedDate,
				materialInstockDetail.lastModifiedBy, materialInstockDetail.materialProcurementItemDetail };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, materialInstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, materialInstockDetail.storageLocation)
				.map(QUANTITY, materialInstockDetail.quantity).map(STORAGE_TYPE, materialInstockDetail.storageType)
				.map(MOVEMENT_TYPE, materialInstockDetail.movementType)
				.map(GOOD_RECEIVE_NO, materialInstockDetail.goodReceiveNo)
				.map(RECEIVE_DATE, materialInstockDetail.receiveDate)
				.map(EXPIRATION_DATE, materialInstockDetail.expirationDate)
				.map(SERIAL_NUMBER, materialInstockDetail.serialNumber).map(RECEIVER, materialInstockDetail.receiver)
				.map(KEEPER, materialInstockDetail.keeper).map(MEMO, materialInstockDetail.memo)
				.map(CLOSED, materialInstockDetail.closed).map(RECORD_STATUS, materialInstockDetail.recordStatus)
				.map(CREATED_DATE, materialInstockDetail.createdDate).map(CREATED_BY, materialInstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, materialInstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialInstockDetail.lastModifiedBy)
				.map(MATERIAL_PROCUREMENT_ITEM_DETAIL, materialInstockDetail.materialProcurementItemDetail);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialInstockDetail);
	}
}
