package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.BugReport;
import com.ocmms.cmms.model.system.QBugReport;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = BugReportRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class BugReportRepositoryImpl extends QueryDslRepositorySupportExt<BugReport>
		implements BugReportRepositoryCustom {

	/**
	 * Default constructor
	 */
	BugReportRepositoryImpl() {
		super(BugReport.class);
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
	public static final String SUBMITTER = "submitter";

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
	public static final String PICS = "pics";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SOLVED_DATE = "solvedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLOSE_DESCRIPTION = "closeDescription";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUBMIT_DATE = "submitDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TITLE = "title";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SOLVED = "solved";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String HANDLER = "handler";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BugReport> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QBugReport bugReport = QBugReport.bugReport;
		JPQLQuery<BugReport> query = from(bugReport);
		Path<?>[] paths = new Path<?>[] { bugReport.description, bugReport.title, bugReport.submitter,
				bugReport.submitDate, bugReport.solved, bugReport.closeDescription, bugReport.handler,
				bugReport.solvedDate, bugReport.pics, bugReport.recordStatus, bugReport.createdDate,
				bugReport.createdBy, bugReport.lastModifiedDate, bugReport.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, bugReport.description)
				.map(TITLE, bugReport.title).map(SUBMITTER, bugReport.submitter).map(SUBMIT_DATE, bugReport.submitDate)
				.map(SOLVED, bugReport.solved).map(CLOSE_DESCRIPTION, bugReport.closeDescription)
				.map(HANDLER, bugReport.handler).map(SOLVED_DATE, bugReport.solvedDate).map(PICS, bugReport.pics)
				.map(RECORD_STATUS, bugReport.recordStatus).map(CREATED_DATE, bugReport.createdDate)
				.map(CREATED_BY, bugReport.createdBy).map(LAST_MODIFIED_DATE, bugReport.lastModifiedDate)
				.map(LAST_MODIFIED_BY, bugReport.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, bugReport);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BugReport> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QBugReport bugReport = QBugReport.bugReport;
		JPQLQuery<BugReport> query = from(bugReport);
		Path<?>[] paths = new Path<?>[] { bugReport.description, bugReport.title, bugReport.submitter,
				bugReport.submitDate, bugReport.solved, bugReport.closeDescription, bugReport.handler,
				bugReport.solvedDate, bugReport.pics, bugReport.recordStatus, bugReport.createdDate,
				bugReport.createdBy, bugReport.lastModifiedDate, bugReport.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(bugReport.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, bugReport.description)
				.map(TITLE, bugReport.title).map(SUBMITTER, bugReport.submitter).map(SUBMIT_DATE, bugReport.submitDate)
				.map(SOLVED, bugReport.solved).map(CLOSE_DESCRIPTION, bugReport.closeDescription)
				.map(HANDLER, bugReport.handler).map(SOLVED_DATE, bugReport.solvedDate).map(PICS, bugReport.pics)
				.map(RECORD_STATUS, bugReport.recordStatus).map(CREATED_DATE, bugReport.createdDate)
				.map(CREATED_BY, bugReport.createdBy).map(LAST_MODIFIED_DATE, bugReport.lastModifiedDate)
				.map(LAST_MODIFIED_BY, bugReport.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, bugReport);
	}
}
