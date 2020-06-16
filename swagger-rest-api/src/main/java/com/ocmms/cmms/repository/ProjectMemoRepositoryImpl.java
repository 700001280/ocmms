package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.ProjectMemo;
import com.ocmms.cmms.model.system.QProjectMemo;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProjectMemoRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ProjectMemoRepositoryImpl extends QueryDslRepositorySupportExt<ProjectMemo>
		implements ProjectMemoRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProjectMemoRepositoryImpl() {
		super(ProjectMemo.class);
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
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProjectMemo> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProjectMemo projectMemo = QProjectMemo.projectMemo;
		JPQLQuery<ProjectMemo> query = from(projectMemo);
		Path<?>[] paths = new Path<?>[] { projectMemo.description, projectMemo.submitter, projectMemo.recordStatus,
				projectMemo.createdDate, projectMemo.createdBy, projectMemo.lastModifiedDate,
				projectMemo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, projectMemo.description)
				.map(SUBMITTER, projectMemo.submitter).map(RECORD_STATUS, projectMemo.recordStatus)
				.map(CREATED_DATE, projectMemo.createdDate).map(CREATED_BY, projectMemo.createdBy)
				.map(LAST_MODIFIED_DATE, projectMemo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, projectMemo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, projectMemo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProjectMemo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QProjectMemo projectMemo = QProjectMemo.projectMemo;
		JPQLQuery<ProjectMemo> query = from(projectMemo);
		Path<?>[] paths = new Path<?>[] { projectMemo.description, projectMemo.submitter, projectMemo.recordStatus,
				projectMemo.createdDate, projectMemo.createdBy, projectMemo.lastModifiedDate,
				projectMemo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(projectMemo.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, projectMemo.description)
				.map(SUBMITTER, projectMemo.submitter).map(RECORD_STATUS, projectMemo.recordStatus)
				.map(CREATED_DATE, projectMemo.createdDate).map(CREATED_BY, projectMemo.createdBy)
				.map(LAST_MODIFIED_DATE, projectMemo.lastModifiedDate)
				.map(LAST_MODIFIED_BY, projectMemo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, projectMemo);
	}
}
