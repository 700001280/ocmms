package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.QPelletizerMaintenanceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerMaintenanceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PelletizerMaintenanceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerMaintenanceRecord>
		implements PelletizerMaintenanceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PelletizerMaintenanceRecordRepositoryImpl() {
		super(PelletizerMaintenanceRecord.class);
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
	public static final String INTERIM = "interim";

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
	public static final String MAINT_START_DATE = "maintStartDate";

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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DOWNTIME = "downtime";

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
	public static final String MAINTAINER = "maintainer";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SHUTDOWN = "shutdown";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAINT_END_DATE = "maintEndDate";

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
	public Page<PelletizerMaintenanceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPelletizerMaintenanceRecord pelletizerMaintenanceRecord = QPelletizerMaintenanceRecord.pelletizerMaintenanceRecord;
		JPQLQuery<PelletizerMaintenanceRecord> query = from(pelletizerMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerMaintenanceRecord.maintStartDate,
				pelletizerMaintenanceRecord.maintEndDate, pelletizerMaintenanceRecord.description,
				pelletizerMaintenanceRecord.downtime, pelletizerMaintenanceRecord.shutdown,
				pelletizerMaintenanceRecord.interim, pelletizerMaintenanceRecord.maintainer,
				pelletizerMaintenanceRecord.equipment, pelletizerMaintenanceRecord.recordStatus,
				pelletizerMaintenanceRecord.createdDate, pelletizerMaintenanceRecord.createdBy,
				pelletizerMaintenanceRecord.lastModifiedDate, pelletizerMaintenanceRecord.lastModifiedBy,
				pelletizerMaintenanceRecord.onlineRunTime, pelletizerMaintenanceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MAINT_START_DATE, pelletizerMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, pelletizerMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, pelletizerMaintenanceRecord.description)
				.map(DOWNTIME, pelletizerMaintenanceRecord.downtime).map(SHUTDOWN, pelletizerMaintenanceRecord.shutdown)
				.map(INTERIM, pelletizerMaintenanceRecord.interim)
				.map(MAINTAINER, pelletizerMaintenanceRecord.maintainer)
				.map(EQUIPMENT, pelletizerMaintenanceRecord.equipment)
				.map(RECORD_STATUS, pelletizerMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerMaintenanceRecord.createdDate)
				.map(CREATED_BY, pelletizerMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerMaintenanceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerMaintenanceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerMaintenanceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerMaintenanceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PelletizerMaintenanceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPelletizerMaintenanceRecord pelletizerMaintenanceRecord = QPelletizerMaintenanceRecord.pelletizerMaintenanceRecord;
		JPQLQuery<PelletizerMaintenanceRecord> query = from(pelletizerMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerMaintenanceRecord.maintStartDate,
				pelletizerMaintenanceRecord.maintEndDate, pelletizerMaintenanceRecord.description,
				pelletizerMaintenanceRecord.downtime, pelletizerMaintenanceRecord.shutdown,
				pelletizerMaintenanceRecord.interim, pelletizerMaintenanceRecord.maintainer,
				pelletizerMaintenanceRecord.equipment, pelletizerMaintenanceRecord.recordStatus,
				pelletizerMaintenanceRecord.createdDate, pelletizerMaintenanceRecord.createdBy,
				pelletizerMaintenanceRecord.lastModifiedDate, pelletizerMaintenanceRecord.lastModifiedBy,
				pelletizerMaintenanceRecord.onlineRunTime, pelletizerMaintenanceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pelletizerMaintenanceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(MAINT_START_DATE, pelletizerMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, pelletizerMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, pelletizerMaintenanceRecord.description)
				.map(DOWNTIME, pelletizerMaintenanceRecord.downtime).map(SHUTDOWN, pelletizerMaintenanceRecord.shutdown)
				.map(INTERIM, pelletizerMaintenanceRecord.interim)
				.map(MAINTAINER, pelletizerMaintenanceRecord.maintainer)
				.map(EQUIPMENT, pelletizerMaintenanceRecord.equipment)
				.map(RECORD_STATUS, pelletizerMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerMaintenanceRecord.createdDate)
				.map(CREATED_BY, pelletizerMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerMaintenanceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerMaintenanceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerMaintenanceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerMaintenanceRecord);
	}
}
