package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.pm.QPreventiveMaintenanceStandard;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = PreventiveMaintenanceStandardRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PreventiveMaintenanceStandardRepositoryImpl
		extends QueryDslRepositorySupportExt<PreventiveMaintenanceStandard>
		implements PreventiveMaintenanceStandardRepositoryCustom {

	/**
	 * Default constructor
	 */
	PreventiveMaintenanceStandardRepositoryImpl() {
		super(PreventiveMaintenanceStandard.class);
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
	public static final String OWNER = "owner";

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
	public Page<PreventiveMaintenanceStandard> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceStandard preventiveMaintenanceStandard = QPreventiveMaintenanceStandard.preventiveMaintenanceStandard;
		JPQLQuery<PreventiveMaintenanceStandard> query = from(preventiveMaintenanceStandard);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceStandard.code, preventiveMaintenanceStandard.description,
				preventiveMaintenanceStandard.owner, preventiveMaintenanceStandard.organization,
				preventiveMaintenanceStandard.recordStatus, preventiveMaintenanceStandard.createdDate,
				preventiveMaintenanceStandard.createdBy, preventiveMaintenanceStandard.lastModifiedDate,
				preventiveMaintenanceStandard.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, preventiveMaintenanceStandard.code)
				.map(DESCRIPTION, preventiveMaintenanceStandard.description)
				.map(OWNER, preventiveMaintenanceStandard.owner)
				.map(ORGANIZATION, preventiveMaintenanceStandard.organization)
				.map(RECORD_STATUS, preventiveMaintenanceStandard.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceStandard.createdDate)
				.map(CREATED_BY, preventiveMaintenanceStandard.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceStandard.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceStandard.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceStandard);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceStandard> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPreventiveMaintenanceStandard preventiveMaintenanceStandard = QPreventiveMaintenanceStandard.preventiveMaintenanceStandard;
		JPQLQuery<PreventiveMaintenanceStandard> query = from(preventiveMaintenanceStandard);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceStandard.code, preventiveMaintenanceStandard.description,
				preventiveMaintenanceStandard.owner, preventiveMaintenanceStandard.organization,
				preventiveMaintenanceStandard.recordStatus, preventiveMaintenanceStandard.createdDate,
				preventiveMaintenanceStandard.createdBy, preventiveMaintenanceStandard.lastModifiedDate,
				preventiveMaintenanceStandard.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(preventiveMaintenanceStandard.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, preventiveMaintenanceStandard.code)
				.map(DESCRIPTION, preventiveMaintenanceStandard.description)
				.map(OWNER, preventiveMaintenanceStandard.owner)
				.map(ORGANIZATION, preventiveMaintenanceStandard.organization)
				.map(RECORD_STATUS, preventiveMaintenanceStandard.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceStandard.createdDate)
				.map(CREATED_BY, preventiveMaintenanceStandard.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceStandard.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceStandard.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceStandard);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param owner
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceStandard> findByOwner(Employee owner, GlobalSearch globalSearch,
			Pageable pageable) {
		QPreventiveMaintenanceStandard preventiveMaintenanceStandard = QPreventiveMaintenanceStandard.preventiveMaintenanceStandard;
		JPQLQuery<PreventiveMaintenanceStandard> query = from(preventiveMaintenanceStandard);
		Assert.notNull(owner, "owner is required");
		query.where(preventiveMaintenanceStandard.owner.eq(owner));
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceStandard.code, preventiveMaintenanceStandard.description,
				preventiveMaintenanceStandard.owner, preventiveMaintenanceStandard.organization,
				preventiveMaintenanceStandard.recordStatus, preventiveMaintenanceStandard.createdDate,
				preventiveMaintenanceStandard.createdBy, preventiveMaintenanceStandard.lastModifiedDate,
				preventiveMaintenanceStandard.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, preventiveMaintenanceStandard.code)
				.map(DESCRIPTION, preventiveMaintenanceStandard.description)
				.map(OWNER, preventiveMaintenanceStandard.owner)
				.map(ORGANIZATION, preventiveMaintenanceStandard.organization)
				.map(RECORD_STATUS, preventiveMaintenanceStandard.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceStandard.createdDate)
				.map(CREATED_BY, preventiveMaintenanceStandard.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceStandard.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceStandard.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceStandard);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObjects
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceStandard> findByTechnicalObjectsContains(TechnicalObject technicalObjects,
			GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceStandard preventiveMaintenanceStandard = QPreventiveMaintenanceStandard.preventiveMaintenanceStandard;
		JPQLQuery<PreventiveMaintenanceStandard> query = from(preventiveMaintenanceStandard);
		Assert.notNull(technicalObjects, "technicalObjects is required");
		query.where(preventiveMaintenanceStandard.technicalObjects.contains(technicalObjects));
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceStandard.code, preventiveMaintenanceStandard.description,
				preventiveMaintenanceStandard.owner, preventiveMaintenanceStandard.organization,
				preventiveMaintenanceStandard.recordStatus, preventiveMaintenanceStandard.createdDate,
				preventiveMaintenanceStandard.createdBy, preventiveMaintenanceStandard.lastModifiedDate,
				preventiveMaintenanceStandard.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, preventiveMaintenanceStandard.code)
				.map(DESCRIPTION, preventiveMaintenanceStandard.description)
				.map(OWNER, preventiveMaintenanceStandard.owner)
				.map(ORGANIZATION, preventiveMaintenanceStandard.organization)
				.map(RECORD_STATUS, preventiveMaintenanceStandard.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceStandard.createdDate)
				.map(CREATED_BY, preventiveMaintenanceStandard.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceStandard.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceStandard.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceStandard);
	}
}
