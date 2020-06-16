package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.assistance.QWorkLog;
import com.ocmms.cmms.model.assistance.WorkLogType;
import com.ocmms.cmms.model.hrm.Employee;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkLogRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkLogRepositoryImpl extends QueryDslRepositorySupportExt<WorkLog> implements WorkLogRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkLogRepositoryImpl() {
		super(WorkLog.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_LOG_TYPE = "workLogType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOG_DATE = "logDate";

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
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOGGER = "logger";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSIGN = "assign";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REMARK = "remark";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkLog> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkLog workLog = QWorkLog.workLog;
		JPQLQuery<WorkLog> query = from(workLog);
		Path<?>[] paths = new Path<?>[] { workLog.description, workLog.logDate, workLog.workLogType, workLog.assign,
				workLog.remark, workLog.logger, workLog.recordStatus, workLog.createdDate, workLog.createdBy,
				workLog.lastModifiedDate, workLog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, workLog.description)
				.map(LOG_DATE, workLog.logDate).map(WORK_LOG_TYPE, workLog.workLogType).map(ASSIGN, workLog.assign)
				.map(REMARK, workLog.remark).map(LOGGER, workLog.logger).map(RECORD_STATUS, workLog.recordStatus)
				.map(CREATED_DATE, workLog.createdDate).map(CREATED_BY, workLog.createdBy)
				.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate).map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workLog);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkLog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkLog workLog = QWorkLog.workLog;
		JPQLQuery<WorkLog> query = from(workLog);
		Path<?>[] paths = new Path<?>[] { workLog.description, workLog.logDate, workLog.workLogType, workLog.assign,
				workLog.remark, workLog.logger, workLog.recordStatus, workLog.createdDate, workLog.createdBy,
				workLog.lastModifiedDate, workLog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workLog.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, workLog.description)
				.map(LOG_DATE, workLog.logDate).map(WORK_LOG_TYPE, workLog.workLogType).map(ASSIGN, workLog.assign)
				.map(REMARK, workLog.remark).map(LOGGER, workLog.logger).map(RECORD_STATUS, workLog.recordStatus)
				.map(CREATED_DATE, workLog.createdDate).map(CREATED_BY, workLog.createdBy)
				.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate).map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workLog);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param logger
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkLog> findByLogger(Employee logger, GlobalSearch globalSearch, Pageable pageable) {
		QWorkLog workLog = QWorkLog.workLog;
		JPQLQuery<WorkLog> query = from(workLog);
		Assert.notNull(logger, "logger is required");
		query.where(workLog.logger.eq(logger));
		Path<?>[] paths = new Path<?>[] { workLog.description, workLog.logDate, workLog.workLogType, workLog.assign,
				workLog.remark, workLog.logger, workLog.recordStatus, workLog.createdDate, workLog.createdBy,
				workLog.lastModifiedDate, workLog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, workLog.description)
				.map(LOG_DATE, workLog.logDate).map(WORK_LOG_TYPE, workLog.workLogType).map(ASSIGN, workLog.assign)
				.map(REMARK, workLog.remark).map(LOGGER, workLog.logger).map(RECORD_STATUS, workLog.recordStatus)
				.map(CREATED_DATE, workLog.createdDate).map(CREATED_BY, workLog.createdBy)
				.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate).map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workLog);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLogType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkLog> findByWorkLogType(WorkLogType workLogType, GlobalSearch globalSearch, Pageable pageable) {
		QWorkLog workLog = QWorkLog.workLog;
		JPQLQuery<WorkLog> query = from(workLog);
		Assert.notNull(workLogType, "workLogType is required");
		query.where(workLog.workLogType.eq(workLogType));
		Path<?>[] paths = new Path<?>[] { workLog.description, workLog.logDate, workLog.workLogType, workLog.assign,
				workLog.remark, workLog.logger, workLog.recordStatus, workLog.createdDate, workLog.createdBy,
				workLog.lastModifiedDate, workLog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, workLog.description)
				.map(LOG_DATE, workLog.logDate).map(WORK_LOG_TYPE, workLog.workLogType).map(ASSIGN, workLog.assign)
				.map(REMARK, workLog.remark).map(LOGGER, workLog.logger).map(RECORD_STATUS, workLog.recordStatus)
				.map(CREATED_DATE, workLog.createdDate).map(CREATED_BY, workLog.createdBy)
				.map(LAST_MODIFIED_DATE, workLog.lastModifiedDate).map(LAST_MODIFIED_BY, workLog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workLog);
	}
}
