package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;
import com.ocmms.cmms.model.pm.routine.QPelletizerReplaceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerReplaceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PelletizerReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PelletizerReplaceRecord>
		implements PelletizerReplaceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PelletizerReplaceRecordRepositoryImpl() {
		super(PelletizerReplaceRecord.class);
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
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

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
	public Page<PelletizerReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPelletizerReplaceRecord pelletizerReplaceRecord = QPelletizerReplaceRecord.pelletizerReplaceRecord;
		JPQLQuery<PelletizerReplaceRecord> query = from(pelletizerReplaceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerReplaceRecord.technicalObject, pelletizerReplaceRecord.equipment,
				pelletizerReplaceRecord.description, pelletizerReplaceRecord.onlineDate,
				pelletizerReplaceRecord.onlinePlan, pelletizerReplaceRecord.onlineMaintainer,
				pelletizerReplaceRecord.offlineDate, pelletizerReplaceRecord.offlinePlan,
				pelletizerReplaceRecord.offlineMaintainer, pelletizerReplaceRecord.memo,
				pelletizerReplaceRecord.recordStatus, pelletizerReplaceRecord.createdDate,
				pelletizerReplaceRecord.createdBy, pelletizerReplaceRecord.lastModifiedDate,
				pelletizerReplaceRecord.lastModifiedBy, pelletizerReplaceRecord.onlineRunTime,
				pelletizerReplaceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TECHNICAL_OBJECT, pelletizerReplaceRecord.technicalObject)
				.map(EQUIPMENT, pelletizerReplaceRecord.equipment).map(DESCRIPTION, pelletizerReplaceRecord.description)
				.map(ONLINE_DATE, pelletizerReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, pelletizerReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, pelletizerReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, pelletizerReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, pelletizerReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, pelletizerReplaceRecord.offlineMaintainer)
				.map(MEMO, pelletizerReplaceRecord.memo).map(RECORD_STATUS, pelletizerReplaceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerReplaceRecord.createdDate)
				.map(CREATED_BY, pelletizerReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerReplaceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerReplaceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerReplaceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerReplaceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PelletizerReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPelletizerReplaceRecord pelletizerReplaceRecord = QPelletizerReplaceRecord.pelletizerReplaceRecord;
		JPQLQuery<PelletizerReplaceRecord> query = from(pelletizerReplaceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerReplaceRecord.technicalObject, pelletizerReplaceRecord.equipment,
				pelletizerReplaceRecord.description, pelletizerReplaceRecord.onlineDate,
				pelletizerReplaceRecord.onlinePlan, pelletizerReplaceRecord.onlineMaintainer,
				pelletizerReplaceRecord.offlineDate, pelletizerReplaceRecord.offlinePlan,
				pelletizerReplaceRecord.offlineMaintainer, pelletizerReplaceRecord.memo,
				pelletizerReplaceRecord.recordStatus, pelletizerReplaceRecord.createdDate,
				pelletizerReplaceRecord.createdBy, pelletizerReplaceRecord.lastModifiedDate,
				pelletizerReplaceRecord.lastModifiedBy, pelletizerReplaceRecord.onlineRunTime,
				pelletizerReplaceRecord.offlineRunTime };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pelletizerReplaceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TECHNICAL_OBJECT, pelletizerReplaceRecord.technicalObject)
				.map(EQUIPMENT, pelletizerReplaceRecord.equipment).map(DESCRIPTION, pelletizerReplaceRecord.description)
				.map(ONLINE_DATE, pelletizerReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, pelletizerReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, pelletizerReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, pelletizerReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, pelletizerReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, pelletizerReplaceRecord.offlineMaintainer)
				.map(MEMO, pelletizerReplaceRecord.memo).map(RECORD_STATUS, pelletizerReplaceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerReplaceRecord.createdDate)
				.map(CREATED_BY, pelletizerReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerReplaceRecord.lastModifiedBy)
				.map(ONLINE_RUN_TIME, pelletizerReplaceRecord.onlineRunTime)
				.map(OFFLINE_RUN_TIME, pelletizerReplaceRecord.offlineRunTime);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerReplaceRecord);
	}
}
