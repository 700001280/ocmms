package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import com.ocmms.cmms.model.pm.routine.QPartScrappingRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartScrappingRecordRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PartScrappingRecordRepositoryImpl extends QueryDslRepositorySupportExt<PartScrappingRecord>
		implements PartScrappingRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PartScrappingRecordRepositoryImpl() {
		super(PartScrappingRecord.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SERIAL_NUMBER = "serialNumber";

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
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SCRAPPING_DATE = "scrappingDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PART_KEEPER = "partKeeper";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PartScrappingRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPartScrappingRecord partScrappingRecord = QPartScrappingRecord.partScrappingRecord;
		JPQLQuery<PartScrappingRecord> query = from(partScrappingRecord);
		Path<?>[] paths = new Path<?>[] { partScrappingRecord.materialCatalog, partScrappingRecord.serialNumber,
				partScrappingRecord.scrappingDate, partScrappingRecord.description, partScrappingRecord.partKeeper,
				partScrappingRecord.storageLocation, partScrappingRecord.recordStatus, partScrappingRecord.createdDate,
				partScrappingRecord.createdBy, partScrappingRecord.lastModifiedDate,
				partScrappingRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, partScrappingRecord.materialCatalog)
				.map(SERIAL_NUMBER, partScrappingRecord.serialNumber)
				.map(SCRAPPING_DATE, partScrappingRecord.scrappingDate)
				.map(DESCRIPTION, partScrappingRecord.description).map(PART_KEEPER, partScrappingRecord.partKeeper)
				.map(STORAGE_LOCATION, partScrappingRecord.storageLocation)
				.map(RECORD_STATUS, partScrappingRecord.recordStatus).map(CREATED_DATE, partScrappingRecord.createdDate)
				.map(CREATED_BY, partScrappingRecord.createdBy)
				.map(LAST_MODIFIED_DATE, partScrappingRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partScrappingRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partScrappingRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PartScrappingRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPartScrappingRecord partScrappingRecord = QPartScrappingRecord.partScrappingRecord;
		JPQLQuery<PartScrappingRecord> query = from(partScrappingRecord);
		Path<?>[] paths = new Path<?>[] { partScrappingRecord.materialCatalog, partScrappingRecord.serialNumber,
				partScrappingRecord.scrappingDate, partScrappingRecord.description, partScrappingRecord.partKeeper,
				partScrappingRecord.storageLocation, partScrappingRecord.recordStatus, partScrappingRecord.createdDate,
				partScrappingRecord.createdBy, partScrappingRecord.lastModifiedDate,
				partScrappingRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(partScrappingRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, partScrappingRecord.materialCatalog)
				.map(SERIAL_NUMBER, partScrappingRecord.serialNumber)
				.map(SCRAPPING_DATE, partScrappingRecord.scrappingDate)
				.map(DESCRIPTION, partScrappingRecord.description).map(PART_KEEPER, partScrappingRecord.partKeeper)
				.map(STORAGE_LOCATION, partScrappingRecord.storageLocation)
				.map(RECORD_STATUS, partScrappingRecord.recordStatus).map(CREATED_DATE, partScrappingRecord.createdDate)
				.map(CREATED_BY, partScrappingRecord.createdBy)
				.map(LAST_MODIFIED_DATE, partScrappingRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partScrappingRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partScrappingRecord);
	}
}
