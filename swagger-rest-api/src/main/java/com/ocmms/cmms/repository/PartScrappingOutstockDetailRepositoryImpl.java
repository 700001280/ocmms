package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import com.ocmms.cmms.model.mm.storage.QPartScrappingOutstockDetail;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = PartScrappingOutstockDetailRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PartScrappingOutstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<PartScrappingOutstockDetail>
		implements PartScrappingOutstockDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	PartScrappingOutstockDetailRepositoryImpl() {
		super(PartScrappingOutstockDetail.class);
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
	public static final String PART_SCRAPPING_RECORD = "partScrappingRecord";

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
	public Page<PartScrappingOutstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPartScrappingOutstockDetail partScrappingOutstockDetail = QPartScrappingOutstockDetail.partScrappingOutstockDetail;
		JPQLQuery<PartScrappingOutstockDetail> query = from(partScrappingOutstockDetail);
		Path<?>[] paths = new Path<?>[] { partScrappingOutstockDetail.organization,
				partScrappingOutstockDetail.materialCatalog, partScrappingOutstockDetail.storageLocation,
				partScrappingOutstockDetail.storageType, partScrappingOutstockDetail.serialNumber,
				partScrappingOutstockDetail.outstockQuantity, partScrappingOutstockDetail.issueDate,
				partScrappingOutstockDetail.receiver, partScrappingOutstockDetail.keeper,
				partScrappingOutstockDetail.memo, partScrappingOutstockDetail.movementType,
				partScrappingOutstockDetail.recordStatus, partScrappingOutstockDetail.createdDate,
				partScrappingOutstockDetail.createdBy, partScrappingOutstockDetail.lastModifiedDate,
				partScrappingOutstockDetail.lastModifiedBy, partScrappingOutstockDetail.partScrappingRecord };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, partScrappingOutstockDetail.organization)
				.map(MATERIAL_CATALOG, partScrappingOutstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, partScrappingOutstockDetail.storageLocation)
				.map(STORAGE_TYPE, partScrappingOutstockDetail.storageType)
				.map(SERIAL_NUMBER, partScrappingOutstockDetail.serialNumber)
				.map(OUTSTOCK_QUANTITY, partScrappingOutstockDetail.outstockQuantity)
				.map(ISSUE_DATE, partScrappingOutstockDetail.issueDate)
				.map(RECEIVER, partScrappingOutstockDetail.receiver).map(KEEPER, partScrappingOutstockDetail.keeper)
				.map(MEMO, partScrappingOutstockDetail.memo)
				.map(MOVEMENT_TYPE, partScrappingOutstockDetail.movementType)
				.map(RECORD_STATUS, partScrappingOutstockDetail.recordStatus)
				.map(CREATED_DATE, partScrappingOutstockDetail.createdDate)
				.map(CREATED_BY, partScrappingOutstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, partScrappingOutstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partScrappingOutstockDetail.lastModifiedBy)
				.map(PART_SCRAPPING_RECORD, partScrappingOutstockDetail.partScrappingRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partScrappingOutstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PartScrappingOutstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPartScrappingOutstockDetail partScrappingOutstockDetail = QPartScrappingOutstockDetail.partScrappingOutstockDetail;
		JPQLQuery<PartScrappingOutstockDetail> query = from(partScrappingOutstockDetail);
		Path<?>[] paths = new Path<?>[] { partScrappingOutstockDetail.organization,
				partScrappingOutstockDetail.materialCatalog, partScrappingOutstockDetail.storageLocation,
				partScrappingOutstockDetail.storageType, partScrappingOutstockDetail.serialNumber,
				partScrappingOutstockDetail.outstockQuantity, partScrappingOutstockDetail.issueDate,
				partScrappingOutstockDetail.receiver, partScrappingOutstockDetail.keeper,
				partScrappingOutstockDetail.memo, partScrappingOutstockDetail.movementType,
				partScrappingOutstockDetail.recordStatus, partScrappingOutstockDetail.createdDate,
				partScrappingOutstockDetail.createdBy, partScrappingOutstockDetail.lastModifiedDate,
				partScrappingOutstockDetail.lastModifiedBy, partScrappingOutstockDetail.partScrappingRecord };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(partScrappingOutstockDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, partScrappingOutstockDetail.organization)
				.map(MATERIAL_CATALOG, partScrappingOutstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, partScrappingOutstockDetail.storageLocation)
				.map(STORAGE_TYPE, partScrappingOutstockDetail.storageType)
				.map(SERIAL_NUMBER, partScrappingOutstockDetail.serialNumber)
				.map(OUTSTOCK_QUANTITY, partScrappingOutstockDetail.outstockQuantity)
				.map(ISSUE_DATE, partScrappingOutstockDetail.issueDate)
				.map(RECEIVER, partScrappingOutstockDetail.receiver).map(KEEPER, partScrappingOutstockDetail.keeper)
				.map(MEMO, partScrappingOutstockDetail.memo)
				.map(MOVEMENT_TYPE, partScrappingOutstockDetail.movementType)
				.map(RECORD_STATUS, partScrappingOutstockDetail.recordStatus)
				.map(CREATED_DATE, partScrappingOutstockDetail.createdDate)
				.map(CREATED_BY, partScrappingOutstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, partScrappingOutstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partScrappingOutstockDetail.lastModifiedBy)
				.map(PART_SCRAPPING_RECORD, partScrappingOutstockDetail.partScrappingRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partScrappingOutstockDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partScrappingRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PartScrappingOutstockDetail> findByPartScrappingRecord(PartScrappingRecord partScrappingRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QPartScrappingOutstockDetail partScrappingOutstockDetail = QPartScrappingOutstockDetail.partScrappingOutstockDetail;
		JPQLQuery<PartScrappingOutstockDetail> query = from(partScrappingOutstockDetail);
		Assert.notNull(partScrappingRecord, "partScrappingRecord is required");
		query.where(partScrappingOutstockDetail.partScrappingRecord.eq(partScrappingRecord));
		Path<?>[] paths = new Path<?>[] { partScrappingOutstockDetail.organization,
				partScrappingOutstockDetail.materialCatalog, partScrappingOutstockDetail.storageLocation,
				partScrappingOutstockDetail.storageType, partScrappingOutstockDetail.serialNumber,
				partScrappingOutstockDetail.outstockQuantity, partScrappingOutstockDetail.issueDate,
				partScrappingOutstockDetail.receiver, partScrappingOutstockDetail.keeper,
				partScrappingOutstockDetail.memo, partScrappingOutstockDetail.movementType,
				partScrappingOutstockDetail.recordStatus, partScrappingOutstockDetail.createdDate,
				partScrappingOutstockDetail.createdBy, partScrappingOutstockDetail.lastModifiedDate,
				partScrappingOutstockDetail.lastModifiedBy, partScrappingOutstockDetail.partScrappingRecord };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, partScrappingOutstockDetail.organization)
				.map(MATERIAL_CATALOG, partScrappingOutstockDetail.materialCatalog)
				.map(STORAGE_LOCATION, partScrappingOutstockDetail.storageLocation)
				.map(STORAGE_TYPE, partScrappingOutstockDetail.storageType)
				.map(SERIAL_NUMBER, partScrappingOutstockDetail.serialNumber)
				.map(OUTSTOCK_QUANTITY, partScrappingOutstockDetail.outstockQuantity)
				.map(ISSUE_DATE, partScrappingOutstockDetail.issueDate)
				.map(RECEIVER, partScrappingOutstockDetail.receiver).map(KEEPER, partScrappingOutstockDetail.keeper)
				.map(MEMO, partScrappingOutstockDetail.memo)
				.map(MOVEMENT_TYPE, partScrappingOutstockDetail.movementType)
				.map(RECORD_STATUS, partScrappingOutstockDetail.recordStatus)
				.map(CREATED_DATE, partScrappingOutstockDetail.createdDate)
				.map(CREATED_BY, partScrappingOutstockDetail.createdBy)
				.map(LAST_MODIFIED_DATE, partScrappingOutstockDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partScrappingOutstockDetail.lastModifiedBy)
				.map(PART_SCRAPPING_RECORD, partScrappingOutstockDetail.partScrappingRecord);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partScrappingOutstockDetail);
	}
}
