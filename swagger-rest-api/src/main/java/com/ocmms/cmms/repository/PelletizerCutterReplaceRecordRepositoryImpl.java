package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;
import com.ocmms.cmms.model.pm.routine.QPelletizerCutterReplaceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerCutterReplaceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PelletizerCutterReplaceRecordRepositoryImpl
		extends QueryDslRepositorySupportExt<PelletizerCutterReplaceRecord>
		implements PelletizerCutterReplaceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PelletizerCutterReplaceRecordRepositoryImpl() {
		super(PelletizerCutterReplaceRecord.class);
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
	public static final String ONLINE_RUN_TIME = "onlineRunTime";

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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OFFLINE_RUN_TIME = "offlineRunTime";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PelletizerCutterReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPelletizerCutterReplaceRecord pelletizerCutterReplaceRecord = QPelletizerCutterReplaceRecord.pelletizerCutterReplaceRecord;
		JPQLQuery<PelletizerCutterReplaceRecord> query = from(pelletizerCutterReplaceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerCutterReplaceRecord.materialCatalog,
				pelletizerCutterReplaceRecord.serialNumber, pelletizerCutterReplaceRecord.equipment,
				pelletizerCutterReplaceRecord.description, pelletizerCutterReplaceRecord.onlineDate,
				pelletizerCutterReplaceRecord.onlinePlan, pelletizerCutterReplaceRecord.onlineMaintainer,
				pelletizerCutterReplaceRecord.offlineDate, pelletizerCutterReplaceRecord.offlinePlan,
				pelletizerCutterReplaceRecord.offlineMaintainer, pelletizerCutterReplaceRecord.memo,
				pelletizerCutterReplaceRecord.recordStatus, pelletizerCutterReplaceRecord.createdDate,
				pelletizerCutterReplaceRecord.createdBy, pelletizerCutterReplaceRecord.lastModifiedDate,
				pelletizerCutterReplaceRecord.lastModifiedBy, pelletizerCutterReplaceRecord.onlineRunTime,
				pelletizerCutterReplaceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerCutterReplaceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerCutterReplaceRecord.serialNumber)
				.map(EQUIPMENT, pelletizerCutterReplaceRecord.equipment)
				.map(DESCRIPTION, pelletizerCutterReplaceRecord.description)
				.map(ONLINE_DATE, pelletizerCutterReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, pelletizerCutterReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, pelletizerCutterReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, pelletizerCutterReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, pelletizerCutterReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, pelletizerCutterReplaceRecord.offlineMaintainer)
				.map(MEMO, pelletizerCutterReplaceRecord.memo)
				.map(RECORD_STATUS, pelletizerCutterReplaceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerCutterReplaceRecord.createdDate)
				.map(CREATED_BY, pelletizerCutterReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerCutterReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerCutterReplaceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerCutterReplaceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerCutterReplaceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerCutterReplaceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PelletizerCutterReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPelletizerCutterReplaceRecord pelletizerCutterReplaceRecord = QPelletizerCutterReplaceRecord.pelletizerCutterReplaceRecord;
		JPQLQuery<PelletizerCutterReplaceRecord> query = from(pelletizerCutterReplaceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerCutterReplaceRecord.materialCatalog,
				pelletizerCutterReplaceRecord.serialNumber, pelletizerCutterReplaceRecord.equipment,
				pelletizerCutterReplaceRecord.description, pelletizerCutterReplaceRecord.onlineDate,
				pelletizerCutterReplaceRecord.onlinePlan, pelletizerCutterReplaceRecord.onlineMaintainer,
				pelletizerCutterReplaceRecord.offlineDate, pelletizerCutterReplaceRecord.offlinePlan,
				pelletizerCutterReplaceRecord.offlineMaintainer, pelletizerCutterReplaceRecord.memo,
				pelletizerCutterReplaceRecord.recordStatus, pelletizerCutterReplaceRecord.createdDate,
				pelletizerCutterReplaceRecord.createdBy, pelletizerCutterReplaceRecord.lastModifiedDate,
				pelletizerCutterReplaceRecord.lastModifiedBy, pelletizerCutterReplaceRecord.onlineRunTime,
				pelletizerCutterReplaceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pelletizerCutterReplaceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerCutterReplaceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerCutterReplaceRecord.serialNumber)
				.map(EQUIPMENT, pelletizerCutterReplaceRecord.equipment)
				.map(DESCRIPTION, pelletizerCutterReplaceRecord.description)
				.map(ONLINE_DATE, pelletizerCutterReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, pelletizerCutterReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, pelletizerCutterReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, pelletizerCutterReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, pelletizerCutterReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, pelletizerCutterReplaceRecord.offlineMaintainer)
				.map(MEMO, pelletizerCutterReplaceRecord.memo)
				.map(RECORD_STATUS, pelletizerCutterReplaceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerCutterReplaceRecord.createdDate)
				.map(CREATED_BY, pelletizerCutterReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerCutterReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerCutterReplaceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerCutterReplaceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerCutterReplaceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerCutterReplaceRecord);
	}
}
