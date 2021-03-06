package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerReplaceRecord;
import com.ocmms.cmms.model.pm.routine.QPelletizerUpRollerReplaceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerUpRollerReplaceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PelletizerUpRollerReplaceRecordRepositoryImpl
		extends QueryDslRepositorySupportExt<PelletizerUpRollerReplaceRecord>
		implements PelletizerUpRollerReplaceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PelletizerUpRollerReplaceRecordRepositoryImpl() {
		super(PelletizerUpRollerReplaceRecord.class);
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
	public Page<PelletizerUpRollerReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPelletizerUpRollerReplaceRecord pelletizerUpRollerReplaceRecord = QPelletizerUpRollerReplaceRecord.pelletizerUpRollerReplaceRecord;
		JPQLQuery<PelletizerUpRollerReplaceRecord> query = from(pelletizerUpRollerReplaceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerUpRollerReplaceRecord.materialCatalog,
				pelletizerUpRollerReplaceRecord.serialNumber, pelletizerUpRollerReplaceRecord.equipment,
				pelletizerUpRollerReplaceRecord.description, pelletizerUpRollerReplaceRecord.onlineDate,
				pelletizerUpRollerReplaceRecord.onlinePlan, pelletizerUpRollerReplaceRecord.onlineMaintainer,
				pelletizerUpRollerReplaceRecord.offlineDate, pelletizerUpRollerReplaceRecord.offlinePlan,
				pelletizerUpRollerReplaceRecord.offlineMaintainer, pelletizerUpRollerReplaceRecord.memo,
				pelletizerUpRollerReplaceRecord.recordStatus, pelletizerUpRollerReplaceRecord.createdDate,
				pelletizerUpRollerReplaceRecord.createdBy, pelletizerUpRollerReplaceRecord.lastModifiedDate,
				pelletizerUpRollerReplaceRecord.lastModifiedBy, pelletizerUpRollerReplaceRecord.onlineRunTime,
				pelletizerUpRollerReplaceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerUpRollerReplaceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerUpRollerReplaceRecord.serialNumber)
				.map(EQUIPMENT, pelletizerUpRollerReplaceRecord.equipment)
				.map(DESCRIPTION, pelletizerUpRollerReplaceRecord.description)
				.map(ONLINE_DATE, pelletizerUpRollerReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, pelletizerUpRollerReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, pelletizerUpRollerReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, pelletizerUpRollerReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, pelletizerUpRollerReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, pelletizerUpRollerReplaceRecord.offlineMaintainer)
				.map(MEMO, pelletizerUpRollerReplaceRecord.memo)
				.map(RECORD_STATUS, pelletizerUpRollerReplaceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerUpRollerReplaceRecord.createdDate)
				.map(CREATED_BY, pelletizerUpRollerReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerUpRollerReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerUpRollerReplaceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerUpRollerReplaceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerUpRollerReplaceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerUpRollerReplaceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PelletizerUpRollerReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPelletizerUpRollerReplaceRecord pelletizerUpRollerReplaceRecord = QPelletizerUpRollerReplaceRecord.pelletizerUpRollerReplaceRecord;
		JPQLQuery<PelletizerUpRollerReplaceRecord> query = from(pelletizerUpRollerReplaceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerUpRollerReplaceRecord.materialCatalog,
				pelletizerUpRollerReplaceRecord.serialNumber, pelletizerUpRollerReplaceRecord.equipment,
				pelletizerUpRollerReplaceRecord.description, pelletizerUpRollerReplaceRecord.onlineDate,
				pelletizerUpRollerReplaceRecord.onlinePlan, pelletizerUpRollerReplaceRecord.onlineMaintainer,
				pelletizerUpRollerReplaceRecord.offlineDate, pelletizerUpRollerReplaceRecord.offlinePlan,
				pelletizerUpRollerReplaceRecord.offlineMaintainer, pelletizerUpRollerReplaceRecord.memo,
				pelletizerUpRollerReplaceRecord.recordStatus, pelletizerUpRollerReplaceRecord.createdDate,
				pelletizerUpRollerReplaceRecord.createdBy, pelletizerUpRollerReplaceRecord.lastModifiedDate,
				pelletizerUpRollerReplaceRecord.lastModifiedBy, pelletizerUpRollerReplaceRecord.onlineRunTime,
				pelletizerUpRollerReplaceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pelletizerUpRollerReplaceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerUpRollerReplaceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerUpRollerReplaceRecord.serialNumber)
				.map(EQUIPMENT, pelletizerUpRollerReplaceRecord.equipment)
				.map(DESCRIPTION, pelletizerUpRollerReplaceRecord.description)
				.map(ONLINE_DATE, pelletizerUpRollerReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, pelletizerUpRollerReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, pelletizerUpRollerReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, pelletizerUpRollerReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, pelletizerUpRollerReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, pelletizerUpRollerReplaceRecord.offlineMaintainer)
				.map(MEMO, pelletizerUpRollerReplaceRecord.memo)
				.map(RECORD_STATUS, pelletizerUpRollerReplaceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerUpRollerReplaceRecord.createdDate)
				.map(CREATED_BY, pelletizerUpRollerReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerUpRollerReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerUpRollerReplaceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerUpRollerReplaceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerUpRollerReplaceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerUpRollerReplaceRecord);
	}
}
