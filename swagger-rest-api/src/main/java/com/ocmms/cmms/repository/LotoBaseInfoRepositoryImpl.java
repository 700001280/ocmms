package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoBaseInfo;
import com.ocmms.cmms.model.loto.QLotoBaseInfo;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoBaseInfoRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class LotoBaseInfoRepositoryImpl extends QueryDslRepositorySupportExt<LotoBaseInfo>
		implements LotoBaseInfoRepositoryCustom {

	/**
	 * Default constructor
	 */
	LotoBaseInfoRepositoryImpl() {
		super(LotoBaseInfo.class);
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
	public static final String LOTO_EXECUTION = "lotoExecution";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SAFETY_REMINDER = "safetyReminder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RESTORATION_ENERGY_SOURCE = "restorationEnergySource";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_COUNT_REMINDER = "lotoCountReminder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOGO_URL = "logoUrl";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

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
	public static final String TITLE = "title";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SHUTDOWN = "shutdown";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PREPARATION = "preparation";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoBaseInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QLotoBaseInfo lotoBaseInfo = QLotoBaseInfo.lotoBaseInfo;
		JPQLQuery<LotoBaseInfo> query = from(lotoBaseInfo);
		Path<?>[] paths = new Path<?>[] { lotoBaseInfo.logoUrl, lotoBaseInfo.organization, lotoBaseInfo.title,
				lotoBaseInfo.preparation, lotoBaseInfo.shutdown, lotoBaseInfo.safetyReminder,
				lotoBaseInfo.restorationEnergySource, lotoBaseInfo.lotoCountReminder, lotoBaseInfo.lotoExecution,
				lotoBaseInfo.recordStatus, lotoBaseInfo.createdDate, lotoBaseInfo.createdBy,
				lotoBaseInfo.lastModifiedDate, lotoBaseInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOGO_URL, lotoBaseInfo.logoUrl)
				.map(ORGANIZATION, lotoBaseInfo.organization).map(TITLE, lotoBaseInfo.title)
				.map(PREPARATION, lotoBaseInfo.preparation).map(SHUTDOWN, lotoBaseInfo.shutdown)
				.map(SAFETY_REMINDER, lotoBaseInfo.safetyReminder)
				.map(RESTORATION_ENERGY_SOURCE, lotoBaseInfo.restorationEnergySource)
				.map(LOTO_COUNT_REMINDER, lotoBaseInfo.lotoCountReminder)
				.map(LOTO_EXECUTION, lotoBaseInfo.lotoExecution).map(RECORD_STATUS, lotoBaseInfo.recordStatus)
				.map(CREATED_DATE, lotoBaseInfo.createdDate).map(CREATED_BY, lotoBaseInfo.createdBy)
				.map(LAST_MODIFIED_DATE, lotoBaseInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoBaseInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoBaseInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoBaseInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QLotoBaseInfo lotoBaseInfo = QLotoBaseInfo.lotoBaseInfo;
		JPQLQuery<LotoBaseInfo> query = from(lotoBaseInfo);
		Path<?>[] paths = new Path<?>[] { lotoBaseInfo.logoUrl, lotoBaseInfo.organization, lotoBaseInfo.title,
				lotoBaseInfo.preparation, lotoBaseInfo.shutdown, lotoBaseInfo.safetyReminder,
				lotoBaseInfo.restorationEnergySource, lotoBaseInfo.lotoCountReminder, lotoBaseInfo.lotoExecution,
				lotoBaseInfo.recordStatus, lotoBaseInfo.createdDate, lotoBaseInfo.createdBy,
				lotoBaseInfo.lastModifiedDate, lotoBaseInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(lotoBaseInfo.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(LOGO_URL, lotoBaseInfo.logoUrl)
				.map(ORGANIZATION, lotoBaseInfo.organization).map(TITLE, lotoBaseInfo.title)
				.map(PREPARATION, lotoBaseInfo.preparation).map(SHUTDOWN, lotoBaseInfo.shutdown)
				.map(SAFETY_REMINDER, lotoBaseInfo.safetyReminder)
				.map(RESTORATION_ENERGY_SOURCE, lotoBaseInfo.restorationEnergySource)
				.map(LOTO_COUNT_REMINDER, lotoBaseInfo.lotoCountReminder)
				.map(LOTO_EXECUTION, lotoBaseInfo.lotoExecution).map(RECORD_STATUS, lotoBaseInfo.recordStatus)
				.map(CREATED_DATE, lotoBaseInfo.createdDate).map(CREATED_BY, lotoBaseInfo.createdBy)
				.map(LAST_MODIFIED_DATE, lotoBaseInfo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoBaseInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoBaseInfo);
	}
}
