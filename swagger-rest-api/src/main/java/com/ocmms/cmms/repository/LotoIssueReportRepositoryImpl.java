package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoIssueReport;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.QLotoIssueReport;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = LotoIssueReportRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class LotoIssueReportRepositoryImpl extends QueryDslRepositorySupportExt<LotoIssueReport>
		implements LotoIssueReportRepositoryCustom {

	/**
	 * Default constructor
	 */
	LotoIssueReportRepositoryImpl() {
		super(LotoIssueReport.class);
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
	public static final String LOTO_INFO = "lotoInfo";

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
	public Page<LotoIssueReport> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QLotoIssueReport lotoIssueReport = QLotoIssueReport.lotoIssueReport;
		JPQLQuery<LotoIssueReport> query = from(lotoIssueReport);
		Path<?>[] paths = new Path<?>[] { lotoIssueReport.lotoInfo, lotoIssueReport.description,
				lotoIssueReport.recordStatus, lotoIssueReport.createdDate, lotoIssueReport.createdBy,
				lotoIssueReport.lastModifiedDate, lotoIssueReport.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOTO_INFO, lotoIssueReport.lotoInfo)
				.map(DESCRIPTION, lotoIssueReport.description).map(RECORD_STATUS, lotoIssueReport.recordStatus)
				.map(CREATED_DATE, lotoIssueReport.createdDate).map(CREATED_BY, lotoIssueReport.createdBy)
				.map(LAST_MODIFIED_DATE, lotoIssueReport.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoIssueReport.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoIssueReport);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoIssueReport> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QLotoIssueReport lotoIssueReport = QLotoIssueReport.lotoIssueReport;
		JPQLQuery<LotoIssueReport> query = from(lotoIssueReport);
		Path<?>[] paths = new Path<?>[] { lotoIssueReport.lotoInfo, lotoIssueReport.description,
				lotoIssueReport.recordStatus, lotoIssueReport.createdDate, lotoIssueReport.createdBy,
				lotoIssueReport.lastModifiedDate, lotoIssueReport.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(lotoIssueReport.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(LOTO_INFO, lotoIssueReport.lotoInfo)
				.map(DESCRIPTION, lotoIssueReport.description).map(RECORD_STATUS, lotoIssueReport.recordStatus)
				.map(CREATED_DATE, lotoIssueReport.createdDate).map(CREATED_BY, lotoIssueReport.createdBy)
				.map(LAST_MODIFIED_DATE, lotoIssueReport.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoIssueReport.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoIssueReport);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoIssueReport> findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable) {
		QLotoIssueReport lotoIssueReport = QLotoIssueReport.lotoIssueReport;
		JPQLQuery<LotoIssueReport> query = from(lotoIssueReport);
		Assert.notNull(lotoInfo, "lotoInfo is required");
		query.where(lotoIssueReport.lotoInfo.eq(lotoInfo));
		Path<?>[] paths = new Path<?>[] { lotoIssueReport.lotoInfo, lotoIssueReport.description,
				lotoIssueReport.recordStatus, lotoIssueReport.createdDate, lotoIssueReport.createdBy,
				lotoIssueReport.lastModifiedDate, lotoIssueReport.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOTO_INFO, lotoIssueReport.lotoInfo)
				.map(DESCRIPTION, lotoIssueReport.description).map(RECORD_STATUS, lotoIssueReport.recordStatus)
				.map(CREATED_DATE, lotoIssueReport.createdDate).map(CREATED_BY, lotoIssueReport.createdBy)
				.map(LAST_MODIFIED_DATE, lotoIssueReport.lastModifiedDate)
				.map(LAST_MODIFIED_BY, lotoIssueReport.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoIssueReport);
	}
}
