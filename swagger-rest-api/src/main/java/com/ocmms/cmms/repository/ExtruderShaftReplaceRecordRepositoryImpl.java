package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;
import com.ocmms.cmms.model.pm.routine.QExtruderShaftReplaceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ExtruderShaftReplaceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class ExtruderShaftReplaceRecordRepositoryImpl extends QueryDslRepositorySupportExt<ExtruderShaftReplaceRecord>
		implements ExtruderShaftReplaceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	ExtruderShaftReplaceRecordRepositoryImpl() {
		super(ExtruderShaftReplaceRecord.class);
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
	public static final String SHAFT_TYPE = "shaftType";

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
	public Page<ExtruderShaftReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QExtruderShaftReplaceRecord extruderShaftReplaceRecord = QExtruderShaftReplaceRecord.extruderShaftReplaceRecord;
		JPQLQuery<ExtruderShaftReplaceRecord> query = from(extruderShaftReplaceRecord);
		Path<?>[] paths = new Path<?>[] { extruderShaftReplaceRecord.technicalObject,
				extruderShaftReplaceRecord.equipment, extruderShaftReplaceRecord.description,
				extruderShaftReplaceRecord.onlineDate, extruderShaftReplaceRecord.onlinePlan,
				extruderShaftReplaceRecord.onlineMaintainer, extruderShaftReplaceRecord.offlineDate,
				extruderShaftReplaceRecord.offlinePlan, extruderShaftReplaceRecord.offlineMaintainer,
				extruderShaftReplaceRecord.memo, extruderShaftReplaceRecord.recordStatus,
				extruderShaftReplaceRecord.createdDate, extruderShaftReplaceRecord.createdBy,
				extruderShaftReplaceRecord.lastModifiedDate, extruderShaftReplaceRecord.lastModifiedBy,
				extruderShaftReplaceRecord.shaftType };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(TECHNICAL_OBJECT, extruderShaftReplaceRecord.technicalObject)
				.map(EQUIPMENT, extruderShaftReplaceRecord.equipment)
				.map(DESCRIPTION, extruderShaftReplaceRecord.description)
				.map(ONLINE_DATE, extruderShaftReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, extruderShaftReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, extruderShaftReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, extruderShaftReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, extruderShaftReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, extruderShaftReplaceRecord.offlineMaintainer)
				.map(MEMO, extruderShaftReplaceRecord.memo).map(RECORD_STATUS, extruderShaftReplaceRecord.recordStatus)
				.map(CREATED_DATE, extruderShaftReplaceRecord.createdDate)
				.map(CREATED_BY, extruderShaftReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, extruderShaftReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, extruderShaftReplaceRecord.lastModifiedBy)
				.map(SHAFT_TYPE, extruderShaftReplaceRecord.shaftType);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, extruderShaftReplaceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ExtruderShaftReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QExtruderShaftReplaceRecord extruderShaftReplaceRecord = QExtruderShaftReplaceRecord.extruderShaftReplaceRecord;
		JPQLQuery<ExtruderShaftReplaceRecord> query = from(extruderShaftReplaceRecord);
		Path<?>[] paths = new Path<?>[] { extruderShaftReplaceRecord.technicalObject,
				extruderShaftReplaceRecord.equipment, extruderShaftReplaceRecord.description,
				extruderShaftReplaceRecord.onlineDate, extruderShaftReplaceRecord.onlinePlan,
				extruderShaftReplaceRecord.onlineMaintainer, extruderShaftReplaceRecord.offlineDate,
				extruderShaftReplaceRecord.offlinePlan, extruderShaftReplaceRecord.offlineMaintainer,
				extruderShaftReplaceRecord.memo, extruderShaftReplaceRecord.recordStatus,
				extruderShaftReplaceRecord.createdDate, extruderShaftReplaceRecord.createdBy,
				extruderShaftReplaceRecord.lastModifiedDate, extruderShaftReplaceRecord.lastModifiedBy,
				extruderShaftReplaceRecord.shaftType };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(extruderShaftReplaceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(TECHNICAL_OBJECT, extruderShaftReplaceRecord.technicalObject)
				.map(EQUIPMENT, extruderShaftReplaceRecord.equipment)
				.map(DESCRIPTION, extruderShaftReplaceRecord.description)
				.map(ONLINE_DATE, extruderShaftReplaceRecord.onlineDate)
				.map(ONLINE_PLAN, extruderShaftReplaceRecord.onlinePlan)
				.map(ONLINE_MAINTAINER, extruderShaftReplaceRecord.onlineMaintainer)
				.map(OFFLINE_DATE, extruderShaftReplaceRecord.offlineDate)
				.map(OFFLINE_PLAN, extruderShaftReplaceRecord.offlinePlan)
				.map(OFFLINE_MAINTAINER, extruderShaftReplaceRecord.offlineMaintainer)
				.map(MEMO, extruderShaftReplaceRecord.memo).map(RECORD_STATUS, extruderShaftReplaceRecord.recordStatus)
				.map(CREATED_DATE, extruderShaftReplaceRecord.createdDate)
				.map(CREATED_BY, extruderShaftReplaceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, extruderShaftReplaceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, extruderShaftReplaceRecord.lastModifiedBy)
				.map(SHAFT_TYPE, extruderShaftReplaceRecord.shaftType);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, extruderShaftReplaceRecord);
	}
}
