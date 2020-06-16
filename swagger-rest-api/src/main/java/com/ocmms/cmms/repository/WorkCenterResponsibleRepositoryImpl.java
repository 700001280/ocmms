package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.QWorkCenterResponsible;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkCenterResponsibleRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkCenterResponsibleRepositoryImpl extends QueryDslRepositorySupportExt<WorkCenterResponsible>
		implements WorkCenterResponsibleRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkCenterResponsibleRepositoryImpl() {
		super(WorkCenterResponsible.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RESPONSIBLE = "responsible";

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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkCenterResponsible> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkCenterResponsible workCenterResponsible = QWorkCenterResponsible.workCenterResponsible;
		JPQLQuery<WorkCenterResponsible> query = from(workCenterResponsible);
		Path<?>[] paths = new Path<?>[] { workCenterResponsible.organization, workCenterResponsible.responsible,
				workCenterResponsible.description, workCenterResponsible.recordStatus,
				workCenterResponsible.createdDate, workCenterResponsible.createdBy,
				workCenterResponsible.lastModifiedDate, workCenterResponsible.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, workCenterResponsible.organization)
				.map(RESPONSIBLE, workCenterResponsible.responsible).map(DESCRIPTION, workCenterResponsible.description)
				.map(RECORD_STATUS, workCenterResponsible.recordStatus)
				.map(CREATED_DATE, workCenterResponsible.createdDate).map(CREATED_BY, workCenterResponsible.createdBy)
				.map(LAST_MODIFIED_DATE, workCenterResponsible.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workCenterResponsible.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workCenterResponsible);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkCenterResponsible> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkCenterResponsible workCenterResponsible = QWorkCenterResponsible.workCenterResponsible;
		JPQLQuery<WorkCenterResponsible> query = from(workCenterResponsible);
		Path<?>[] paths = new Path<?>[] { workCenterResponsible.organization, workCenterResponsible.responsible,
				workCenterResponsible.description, workCenterResponsible.recordStatus,
				workCenterResponsible.createdDate, workCenterResponsible.createdBy,
				workCenterResponsible.lastModifiedDate, workCenterResponsible.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workCenterResponsible.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, workCenterResponsible.organization)
				.map(RESPONSIBLE, workCenterResponsible.responsible).map(DESCRIPTION, workCenterResponsible.description)
				.map(RECORD_STATUS, workCenterResponsible.recordStatus)
				.map(CREATED_DATE, workCenterResponsible.createdDate).map(CREATED_BY, workCenterResponsible.createdBy)
				.map(LAST_MODIFIED_DATE, workCenterResponsible.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workCenterResponsible.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workCenterResponsible);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkCenterResponsible> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkCenterResponsible workCenterResponsible = QWorkCenterResponsible.workCenterResponsible;
		JPQLQuery<WorkCenterResponsible> query = from(workCenterResponsible);
		Assert.notNull(organization, "organization is required");
		query.where(workCenterResponsible.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { workCenterResponsible.organization, workCenterResponsible.responsible,
				workCenterResponsible.description, workCenterResponsible.recordStatus,
				workCenterResponsible.createdDate, workCenterResponsible.createdBy,
				workCenterResponsible.lastModifiedDate, workCenterResponsible.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, workCenterResponsible.organization)
				.map(RESPONSIBLE, workCenterResponsible.responsible).map(DESCRIPTION, workCenterResponsible.description)
				.map(RECORD_STATUS, workCenterResponsible.recordStatus)
				.map(CREATED_DATE, workCenterResponsible.createdDate).map(CREATED_BY, workCenterResponsible.createdBy)
				.map(LAST_MODIFIED_DATE, workCenterResponsible.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workCenterResponsible.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workCenterResponsible);
	}
}
