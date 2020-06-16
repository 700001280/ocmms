package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.QHierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = HierarchyWorkCenterRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class HierarchyWorkCenterRepositoryImpl extends QueryDslRepositorySupportExt<HierarchyWorkCenter>
		implements HierarchyWorkCenterRepositoryCustom {

	/**
	 * Default constructor
	 */
	HierarchyWorkCenterRepositoryImpl() {
		super(HierarchyWorkCenter.class);
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
	public static final String CODE = "code";

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
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATEGORY = "category";

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
	public static final String NAME = "name";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<HierarchyWorkCenter> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QHierarchyWorkCenter hierarchyWorkCenter = QHierarchyWorkCenter.hierarchyWorkCenter;
		JPQLQuery<HierarchyWorkCenter> query = from(hierarchyWorkCenter);
		Path<?>[] paths = new Path<?>[] { hierarchyWorkCenter.organization, hierarchyWorkCenter.code,
				hierarchyWorkCenter.category, hierarchyWorkCenter.name, hierarchyWorkCenter.responsible,
				hierarchyWorkCenter.recordStatus, hierarchyWorkCenter.createdDate, hierarchyWorkCenter.createdBy,
				hierarchyWorkCenter.lastModifiedDate, hierarchyWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, hierarchyWorkCenter.organization)
				.map(CODE, hierarchyWorkCenter.code).map(CATEGORY, hierarchyWorkCenter.category)
				.map(NAME, hierarchyWorkCenter.name).map(RESPONSIBLE, hierarchyWorkCenter.responsible)
				.map(RECORD_STATUS, hierarchyWorkCenter.recordStatus).map(CREATED_DATE, hierarchyWorkCenter.createdDate)
				.map(CREATED_BY, hierarchyWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, hierarchyWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, hierarchyWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, hierarchyWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<HierarchyWorkCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QHierarchyWorkCenter hierarchyWorkCenter = QHierarchyWorkCenter.hierarchyWorkCenter;
		JPQLQuery<HierarchyWorkCenter> query = from(hierarchyWorkCenter);
		Path<?>[] paths = new Path<?>[] { hierarchyWorkCenter.organization, hierarchyWorkCenter.code,
				hierarchyWorkCenter.category, hierarchyWorkCenter.name, hierarchyWorkCenter.responsible,
				hierarchyWorkCenter.recordStatus, hierarchyWorkCenter.createdDate, hierarchyWorkCenter.createdBy,
				hierarchyWorkCenter.lastModifiedDate, hierarchyWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(hierarchyWorkCenter.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, hierarchyWorkCenter.organization)
				.map(CODE, hierarchyWorkCenter.code).map(CATEGORY, hierarchyWorkCenter.category)
				.map(NAME, hierarchyWorkCenter.name).map(RESPONSIBLE, hierarchyWorkCenter.responsible)
				.map(RECORD_STATUS, hierarchyWorkCenter.recordStatus).map(CREATED_DATE, hierarchyWorkCenter.createdDate)
				.map(CREATED_BY, hierarchyWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, hierarchyWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, hierarchyWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, hierarchyWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<HierarchyWorkCenter> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable) {
		QHierarchyWorkCenter hierarchyWorkCenter = QHierarchyWorkCenter.hierarchyWorkCenter;
		JPQLQuery<HierarchyWorkCenter> query = from(hierarchyWorkCenter);
		Assert.notNull(organization, "organization is required");
		query.where(hierarchyWorkCenter.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { hierarchyWorkCenter.organization, hierarchyWorkCenter.code,
				hierarchyWorkCenter.category, hierarchyWorkCenter.name, hierarchyWorkCenter.responsible,
				hierarchyWorkCenter.recordStatus, hierarchyWorkCenter.createdDate, hierarchyWorkCenter.createdBy,
				hierarchyWorkCenter.lastModifiedDate, hierarchyWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, hierarchyWorkCenter.organization)
				.map(CODE, hierarchyWorkCenter.code).map(CATEGORY, hierarchyWorkCenter.category)
				.map(NAME, hierarchyWorkCenter.name).map(RESPONSIBLE, hierarchyWorkCenter.responsible)
				.map(RECORD_STATUS, hierarchyWorkCenter.recordStatus).map(CREATED_DATE, hierarchyWorkCenter.createdDate)
				.map(CREATED_BY, hierarchyWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, hierarchyWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, hierarchyWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, hierarchyWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param responsible
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<HierarchyWorkCenter> findByResponsible(WorkCenterResponsible responsible, GlobalSearch globalSearch,
			Pageable pageable) {
		QHierarchyWorkCenter hierarchyWorkCenter = QHierarchyWorkCenter.hierarchyWorkCenter;
		JPQLQuery<HierarchyWorkCenter> query = from(hierarchyWorkCenter);
		Assert.notNull(responsible, "responsible is required");
		query.where(hierarchyWorkCenter.responsible.eq(responsible));
		Path<?>[] paths = new Path<?>[] { hierarchyWorkCenter.organization, hierarchyWorkCenter.code,
				hierarchyWorkCenter.category, hierarchyWorkCenter.name, hierarchyWorkCenter.responsible,
				hierarchyWorkCenter.recordStatus, hierarchyWorkCenter.createdDate, hierarchyWorkCenter.createdBy,
				hierarchyWorkCenter.lastModifiedDate, hierarchyWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, hierarchyWorkCenter.organization)
				.map(CODE, hierarchyWorkCenter.code).map(CATEGORY, hierarchyWorkCenter.category)
				.map(NAME, hierarchyWorkCenter.name).map(RESPONSIBLE, hierarchyWorkCenter.responsible)
				.map(RECORD_STATUS, hierarchyWorkCenter.recordStatus).map(CREATED_DATE, hierarchyWorkCenter.createdDate)
				.map(CREATED_BY, hierarchyWorkCenter.createdBy)
				.map(LAST_MODIFIED_DATE, hierarchyWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, hierarchyWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, hierarchyWorkCenter);
	}
}
