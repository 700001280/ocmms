package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.QMainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MainWorkCenterRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MainWorkCenterRepositoryImpl extends QueryDslRepositorySupportExt<MainWorkCenter>
		implements MainWorkCenterRepositoryCustom {

	/**
	 * Default constructor
	 */
	MainWorkCenterRepositoryImpl() {
		super(MainWorkCenter.class);
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
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COST_CENTER = "costCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String VALIDITY_START_DATE = "validityStartDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATEGORY = "category";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String HIERARCHY_WORK_CENTER = "hierarchyWorkCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CONTROL_KEY = "controlKey";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String VALIDITY_END_DATE = "validityEndDate";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MainWorkCenter> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMainWorkCenter mainWorkCenter = QMainWorkCenter.mainWorkCenter;
		JPQLQuery<MainWorkCenter> query = from(mainWorkCenter);
		Path<?>[] paths = new Path<?>[] { mainWorkCenter.organization, mainWorkCenter.code, mainWorkCenter.category,
				mainWorkCenter.description, mainWorkCenter.responsible, mainWorkCenter.controlKey,
				mainWorkCenter.validityStartDate, mainWorkCenter.validityEndDate, mainWorkCenter.costCenter,
				mainWorkCenter.hierarchyWorkCenter, mainWorkCenter.recordStatus, mainWorkCenter.createdDate,
				mainWorkCenter.createdBy, mainWorkCenter.lastModifiedDate, mainWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, mainWorkCenter.organization)
				.map(CODE, mainWorkCenter.code).map(CATEGORY, mainWorkCenter.category)
				.map(DESCRIPTION, mainWorkCenter.description).map(RESPONSIBLE, mainWorkCenter.responsible)
				.map(CONTROL_KEY, mainWorkCenter.controlKey).map(VALIDITY_START_DATE, mainWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, mainWorkCenter.validityEndDate).map(COST_CENTER, mainWorkCenter.costCenter)
				.map(HIERARCHY_WORK_CENTER, mainWorkCenter.hierarchyWorkCenter)
				.map(RECORD_STATUS, mainWorkCenter.recordStatus).map(CREATED_DATE, mainWorkCenter.createdDate)
				.map(CREATED_BY, mainWorkCenter.createdBy).map(LAST_MODIFIED_DATE, mainWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mainWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mainWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MainWorkCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMainWorkCenter mainWorkCenter = QMainWorkCenter.mainWorkCenter;
		JPQLQuery<MainWorkCenter> query = from(mainWorkCenter);
		Path<?>[] paths = new Path<?>[] { mainWorkCenter.organization, mainWorkCenter.code, mainWorkCenter.category,
				mainWorkCenter.description, mainWorkCenter.responsible, mainWorkCenter.controlKey,
				mainWorkCenter.validityStartDate, mainWorkCenter.validityEndDate, mainWorkCenter.costCenter,
				mainWorkCenter.hierarchyWorkCenter, mainWorkCenter.recordStatus, mainWorkCenter.createdDate,
				mainWorkCenter.createdBy, mainWorkCenter.lastModifiedDate, mainWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(mainWorkCenter.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, mainWorkCenter.organization)
				.map(CODE, mainWorkCenter.code).map(CATEGORY, mainWorkCenter.category)
				.map(DESCRIPTION, mainWorkCenter.description).map(RESPONSIBLE, mainWorkCenter.responsible)
				.map(CONTROL_KEY, mainWorkCenter.controlKey).map(VALIDITY_START_DATE, mainWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, mainWorkCenter.validityEndDate).map(COST_CENTER, mainWorkCenter.costCenter)
				.map(HIERARCHY_WORK_CENTER, mainWorkCenter.hierarchyWorkCenter)
				.map(RECORD_STATUS, mainWorkCenter.recordStatus).map(CREATED_DATE, mainWorkCenter.createdDate)
				.map(CREATED_BY, mainWorkCenter.createdBy).map(LAST_MODIFIED_DATE, mainWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mainWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mainWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MainWorkCenter> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch, Pageable pageable) {
		QMainWorkCenter mainWorkCenter = QMainWorkCenter.mainWorkCenter;
		JPQLQuery<MainWorkCenter> query = from(mainWorkCenter);
		Assert.notNull(costCenter, "costCenter is required");
		query.where(mainWorkCenter.costCenter.eq(costCenter));
		Path<?>[] paths = new Path<?>[] { mainWorkCenter.organization, mainWorkCenter.code, mainWorkCenter.category,
				mainWorkCenter.description, mainWorkCenter.responsible, mainWorkCenter.controlKey,
				mainWorkCenter.validityStartDate, mainWorkCenter.validityEndDate, mainWorkCenter.costCenter,
				mainWorkCenter.hierarchyWorkCenter, mainWorkCenter.recordStatus, mainWorkCenter.createdDate,
				mainWorkCenter.createdBy, mainWorkCenter.lastModifiedDate, mainWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, mainWorkCenter.organization)
				.map(CODE, mainWorkCenter.code).map(CATEGORY, mainWorkCenter.category)
				.map(DESCRIPTION, mainWorkCenter.description).map(RESPONSIBLE, mainWorkCenter.responsible)
				.map(CONTROL_KEY, mainWorkCenter.controlKey).map(VALIDITY_START_DATE, mainWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, mainWorkCenter.validityEndDate).map(COST_CENTER, mainWorkCenter.costCenter)
				.map(HIERARCHY_WORK_CENTER, mainWorkCenter.hierarchyWorkCenter)
				.map(RECORD_STATUS, mainWorkCenter.recordStatus).map(CREATED_DATE, mainWorkCenter.createdDate)
				.map(CREATED_BY, mainWorkCenter.createdBy).map(LAST_MODIFIED_DATE, mainWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mainWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mainWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MainWorkCenter> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable) {
		QMainWorkCenter mainWorkCenter = QMainWorkCenter.mainWorkCenter;
		JPQLQuery<MainWorkCenter> query = from(mainWorkCenter);
		Assert.notNull(organization, "organization is required");
		query.where(mainWorkCenter.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { mainWorkCenter.organization, mainWorkCenter.code, mainWorkCenter.category,
				mainWorkCenter.description, mainWorkCenter.responsible, mainWorkCenter.controlKey,
				mainWorkCenter.validityStartDate, mainWorkCenter.validityEndDate, mainWorkCenter.costCenter,
				mainWorkCenter.hierarchyWorkCenter, mainWorkCenter.recordStatus, mainWorkCenter.createdDate,
				mainWorkCenter.createdBy, mainWorkCenter.lastModifiedDate, mainWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, mainWorkCenter.organization)
				.map(CODE, mainWorkCenter.code).map(CATEGORY, mainWorkCenter.category)
				.map(DESCRIPTION, mainWorkCenter.description).map(RESPONSIBLE, mainWorkCenter.responsible)
				.map(CONTROL_KEY, mainWorkCenter.controlKey).map(VALIDITY_START_DATE, mainWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, mainWorkCenter.validityEndDate).map(COST_CENTER, mainWorkCenter.costCenter)
				.map(HIERARCHY_WORK_CENTER, mainWorkCenter.hierarchyWorkCenter)
				.map(RECORD_STATUS, mainWorkCenter.recordStatus).map(CREATED_DATE, mainWorkCenter.createdDate)
				.map(CREATED_BY, mainWorkCenter.createdBy).map(LAST_MODIFIED_DATE, mainWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mainWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mainWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param hierarchyWorkCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MainWorkCenter> findByHierarchyWorkCenter(HierarchyWorkCenter hierarchyWorkCenter,
			GlobalSearch globalSearch, Pageable pageable) {
		QMainWorkCenter mainWorkCenter = QMainWorkCenter.mainWorkCenter;
		JPQLQuery<MainWorkCenter> query = from(mainWorkCenter);
		Assert.notNull(hierarchyWorkCenter, "hierarchyWorkCenter is required");
		query.where(mainWorkCenter.hierarchyWorkCenter.eq(hierarchyWorkCenter));
		Path<?>[] paths = new Path<?>[] { mainWorkCenter.organization, mainWorkCenter.code, mainWorkCenter.category,
				mainWorkCenter.description, mainWorkCenter.responsible, mainWorkCenter.controlKey,
				mainWorkCenter.validityStartDate, mainWorkCenter.validityEndDate, mainWorkCenter.costCenter,
				mainWorkCenter.hierarchyWorkCenter, mainWorkCenter.recordStatus, mainWorkCenter.createdDate,
				mainWorkCenter.createdBy, mainWorkCenter.lastModifiedDate, mainWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, mainWorkCenter.organization)
				.map(CODE, mainWorkCenter.code).map(CATEGORY, mainWorkCenter.category)
				.map(DESCRIPTION, mainWorkCenter.description).map(RESPONSIBLE, mainWorkCenter.responsible)
				.map(CONTROL_KEY, mainWorkCenter.controlKey).map(VALIDITY_START_DATE, mainWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, mainWorkCenter.validityEndDate).map(COST_CENTER, mainWorkCenter.costCenter)
				.map(HIERARCHY_WORK_CENTER, mainWorkCenter.hierarchyWorkCenter)
				.map(RECORD_STATUS, mainWorkCenter.recordStatus).map(CREATED_DATE, mainWorkCenter.createdDate)
				.map(CREATED_BY, mainWorkCenter.createdBy).map(LAST_MODIFIED_DATE, mainWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mainWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mainWorkCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param responsible
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MainWorkCenter> findByResponsible(WorkCenterResponsible responsible, GlobalSearch globalSearch,
			Pageable pageable) {
		QMainWorkCenter mainWorkCenter = QMainWorkCenter.mainWorkCenter;
		JPQLQuery<MainWorkCenter> query = from(mainWorkCenter);
		Assert.notNull(responsible, "responsible is required");
		query.where(mainWorkCenter.responsible.eq(responsible));
		Path<?>[] paths = new Path<?>[] { mainWorkCenter.organization, mainWorkCenter.code, mainWorkCenter.category,
				mainWorkCenter.description, mainWorkCenter.responsible, mainWorkCenter.controlKey,
				mainWorkCenter.validityStartDate, mainWorkCenter.validityEndDate, mainWorkCenter.costCenter,
				mainWorkCenter.hierarchyWorkCenter, mainWorkCenter.recordStatus, mainWorkCenter.createdDate,
				mainWorkCenter.createdBy, mainWorkCenter.lastModifiedDate, mainWorkCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, mainWorkCenter.organization)
				.map(CODE, mainWorkCenter.code).map(CATEGORY, mainWorkCenter.category)
				.map(DESCRIPTION, mainWorkCenter.description).map(RESPONSIBLE, mainWorkCenter.responsible)
				.map(CONTROL_KEY, mainWorkCenter.controlKey).map(VALIDITY_START_DATE, mainWorkCenter.validityStartDate)
				.map(VALIDITY_END_DATE, mainWorkCenter.validityEndDate).map(COST_CENTER, mainWorkCenter.costCenter)
				.map(HIERARCHY_WORK_CENTER, mainWorkCenter.hierarchyWorkCenter)
				.map(RECORD_STATUS, mainWorkCenter.recordStatus).map(CREATED_DATE, mainWorkCenter.createdDate)
				.map(CREATED_BY, mainWorkCenter.createdBy).map(LAST_MODIFIED_DATE, mainWorkCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mainWorkCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mainWorkCenter);
	}
}
