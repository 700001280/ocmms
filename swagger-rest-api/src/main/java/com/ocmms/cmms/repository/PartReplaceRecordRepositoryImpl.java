package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import com.ocmms.cmms.model.pm.routine.QPartReplaceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartReplaceRecordRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PartReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PartReplaceRecord>
		implements PartReplaceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PartReplaceRecordRepositoryImpl() {
		super(PartReplaceRecord.class);
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
	public static final String SERIAL_NUMBER = "serialNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

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
	public Page<PartReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPartReplaceRecord partReplaceRecord = QPartReplaceRecord.partReplaceRecord;
		JPQLQuery<PartReplaceRecord> query = from(partReplaceRecord);
		Path<?>[] paths = new Path<?>[] { partReplaceRecord.materialCatalog, partReplaceRecord.serialNumber,
				partReplaceRecord.equipment, partReplaceRecord.description, partReplaceRecord.onlineDate,
				partReplaceRecord.onlinePlan, partReplaceRecord.onlineMaintainer, partReplaceRecord.offlineDate,
				partReplaceRecord.offlinePlan, partReplaceRecord.offlineMaintainer, partReplaceRecord.memo,
				partReplaceRecord.recordStatus, partReplaceRecord.createdDate, partReplaceRecord.createdBy,
				partReplaceRecord.lastModifiedDate, partReplaceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, partReplaceRecord.materialCatalog)
				.map(SERIAL_NUMBER, partReplaceRecord.serialNumber).map(EQUIPMENT, partReplaceRecord.equipment)
				.map(DESCRIPTION, partReplaceRecord.description).map(ONLINE_DATE, partReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, partReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, partReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, partReplaceRecord.offlineDate).map(OFFLINE_PLAN, partReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, partReplaceRecord.offlineMaintainer).map(MEMO, partReplaceRecord.memo)
				.map(RECORD_STATUS, partReplaceRecord.recordStatus).map(CREATED_DATE, partReplaceRecord.createdDate)
				.map(CREATED_BY, partReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, partReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partReplaceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partReplaceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PartReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPartReplaceRecord partReplaceRecord = QPartReplaceRecord.partReplaceRecord;
		JPQLQuery<PartReplaceRecord> query = from(partReplaceRecord);
		Path<?>[] paths = new Path<?>[] { partReplaceRecord.materialCatalog, partReplaceRecord.serialNumber,
				partReplaceRecord.equipment, partReplaceRecord.description, partReplaceRecord.onlineDate,
				partReplaceRecord.onlinePlan, partReplaceRecord.onlineMaintainer, partReplaceRecord.offlineDate,
				partReplaceRecord.offlinePlan, partReplaceRecord.offlineMaintainer, partReplaceRecord.memo,
				partReplaceRecord.recordStatus, partReplaceRecord.createdDate, partReplaceRecord.createdBy,
				partReplaceRecord.lastModifiedDate, partReplaceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(partReplaceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, partReplaceRecord.materialCatalog)
				.map(SERIAL_NUMBER, partReplaceRecord.serialNumber).map(EQUIPMENT, partReplaceRecord.equipment)
				.map(DESCRIPTION, partReplaceRecord.description).map(ONLINE_DATE, partReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, partReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, partReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, partReplaceRecord.offlineDate).map(OFFLINE_PLAN, partReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, partReplaceRecord.offlineMaintainer).map(MEMO, partReplaceRecord.memo)
				.map(RECORD_STATUS, partReplaceRecord.recordStatus).map(CREATED_DATE, partReplaceRecord.createdDate)
				.map(CREATED_BY, partReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, partReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partReplaceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partReplaceRecord);
	}
}
