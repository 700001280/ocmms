package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.ReportTemplateDefinition;
import com.ocmms.cmms.model.system.QReportTemplateDefinition;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ReportTemplateDefinitionRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class ReportTemplateDefinitionRepositoryImpl extends QueryDslRepositorySupportExt<ReportTemplateDefinition>
		implements ReportTemplateDefinitionRepositoryCustom {

	/**
	 * Default constructor
	 */
	ReportTemplateDefinitionRepositoryImpl() {
		super(ReportTemplateDefinition.class);
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
	public static final String OWNER = "Owner";

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
	public static final String SYSTEM_DEFAULT = "systemDefault";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TEMPLATE = "template";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TITLE = "title";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLASS_NAME = "className";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ReportTemplateDefinition> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QReportTemplateDefinition reportTemplateDefinition = QReportTemplateDefinition.reportTemplateDefinition;
		JPQLQuery<ReportTemplateDefinition> query = from(reportTemplateDefinition);
		Path<?>[] paths = new Path<?>[] { reportTemplateDefinition.template, reportTemplateDefinition.className,
				reportTemplateDefinition.description, reportTemplateDefinition.title, reportTemplateDefinition.Owner,
				reportTemplateDefinition.systemDefault, reportTemplateDefinition.recordStatus,
				reportTemplateDefinition.createdDate, reportTemplateDefinition.createdBy,
				reportTemplateDefinition.lastModifiedDate, reportTemplateDefinition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TEMPLATE, reportTemplateDefinition.template)
				.map(CLASS_NAME, reportTemplateDefinition.className)
				.map(DESCRIPTION, reportTemplateDefinition.description).map(TITLE, reportTemplateDefinition.title)
				.map(OWNER, reportTemplateDefinition.Owner).map(SYSTEM_DEFAULT, reportTemplateDefinition.systemDefault)
				.map(RECORD_STATUS, reportTemplateDefinition.recordStatus)
				.map(CREATED_DATE, reportTemplateDefinition.createdDate)
				.map(CREATED_BY, reportTemplateDefinition.createdBy)
				.map(LAST_MODIFIED_DATE, reportTemplateDefinition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, reportTemplateDefinition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, reportTemplateDefinition);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ReportTemplateDefinition> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QReportTemplateDefinition reportTemplateDefinition = QReportTemplateDefinition.reportTemplateDefinition;
		JPQLQuery<ReportTemplateDefinition> query = from(reportTemplateDefinition);
		Path<?>[] paths = new Path<?>[] { reportTemplateDefinition.template, reportTemplateDefinition.className,
				reportTemplateDefinition.description, reportTemplateDefinition.title, reportTemplateDefinition.Owner,
				reportTemplateDefinition.systemDefault, reportTemplateDefinition.recordStatus,
				reportTemplateDefinition.createdDate, reportTemplateDefinition.createdBy,
				reportTemplateDefinition.lastModifiedDate, reportTemplateDefinition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(reportTemplateDefinition.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TEMPLATE, reportTemplateDefinition.template)
				.map(CLASS_NAME, reportTemplateDefinition.className)
				.map(DESCRIPTION, reportTemplateDefinition.description).map(TITLE, reportTemplateDefinition.title)
				.map(OWNER, reportTemplateDefinition.Owner).map(SYSTEM_DEFAULT, reportTemplateDefinition.systemDefault)
				.map(RECORD_STATUS, reportTemplateDefinition.recordStatus)
				.map(CREATED_DATE, reportTemplateDefinition.createdDate)
				.map(CREATED_BY, reportTemplateDefinition.createdBy)
				.map(LAST_MODIFIED_DATE, reportTemplateDefinition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, reportTemplateDefinition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, reportTemplateDefinition);
	}
}
