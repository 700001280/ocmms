package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.pm.pm.QPreventiveMaintenanceContent;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = PreventiveMaintenanceContentRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PreventiveMaintenanceContentRepositoryImpl
		extends QueryDslRepositorySupportExt<PreventiveMaintenanceContent>
		implements PreventiveMaintenanceContentRepositoryCustom {

	/**
	 * Default constructor
	 */
	PreventiveMaintenanceContentRepositoryImpl() {
		super(PreventiveMaintenanceContent.class);
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
	public static final String SERIAL_NO = "serialNo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SINGLE_CYCLE = "singleCycle";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String START_DATE = "startDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CYCLE_UNIT = "cycleUnit";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String METHOD = "method";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PREVENTIVE_MAINTENANCE_STANDARD = "preventiveMaintenanceStandard";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String STANDARD = "standard";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TOOL = "tool";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceContent> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceContent preventiveMaintenanceContent = QPreventiveMaintenanceContent.preventiveMaintenanceContent;
		JPQLQuery<PreventiveMaintenanceContent> query = from(preventiveMaintenanceContent);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceContent.serialNo,
				preventiveMaintenanceContent.description, preventiveMaintenanceContent.method,
				preventiveMaintenanceContent.standard, preventiveMaintenanceContent.tool,
				preventiveMaintenanceContent.materialCatalog, preventiveMaintenanceContent.startDate,
				preventiveMaintenanceContent.singleCycle, preventiveMaintenanceContent.cycleUnit,
				preventiveMaintenanceContent.preventiveMaintenanceStandard, preventiveMaintenanceContent.recordStatus,
				preventiveMaintenanceContent.createdDate, preventiveMaintenanceContent.createdBy,
				preventiveMaintenanceContent.lastModifiedDate, preventiveMaintenanceContent.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SERIAL_NO, preventiveMaintenanceContent.serialNo)
				.map(DESCRIPTION, preventiveMaintenanceContent.description)
				.map(METHOD, preventiveMaintenanceContent.method).map(STANDARD, preventiveMaintenanceContent.standard)
				.map(TOOL, preventiveMaintenanceContent.tool)
				.map(MATERIAL_CATALOG, preventiveMaintenanceContent.materialCatalog)
				.map(START_DATE, preventiveMaintenanceContent.startDate)
				.map(SINGLE_CYCLE, preventiveMaintenanceContent.singleCycle)
				.map(CYCLE_UNIT, preventiveMaintenanceContent.cycleUnit)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, preventiveMaintenanceContent.preventiveMaintenanceStandard)
				.map(RECORD_STATUS, preventiveMaintenanceContent.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceContent.createdDate)
				.map(CREATED_BY, preventiveMaintenanceContent.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceContent.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceContent.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceContent);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceContent> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPreventiveMaintenanceContent preventiveMaintenanceContent = QPreventiveMaintenanceContent.preventiveMaintenanceContent;
		JPQLQuery<PreventiveMaintenanceContent> query = from(preventiveMaintenanceContent);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceContent.serialNo,
				preventiveMaintenanceContent.description, preventiveMaintenanceContent.method,
				preventiveMaintenanceContent.standard, preventiveMaintenanceContent.tool,
				preventiveMaintenanceContent.materialCatalog, preventiveMaintenanceContent.startDate,
				preventiveMaintenanceContent.singleCycle, preventiveMaintenanceContent.cycleUnit,
				preventiveMaintenanceContent.preventiveMaintenanceStandard, preventiveMaintenanceContent.recordStatus,
				preventiveMaintenanceContent.createdDate, preventiveMaintenanceContent.createdBy,
				preventiveMaintenanceContent.lastModifiedDate, preventiveMaintenanceContent.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(preventiveMaintenanceContent.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(SERIAL_NO, preventiveMaintenanceContent.serialNo)
				.map(DESCRIPTION, preventiveMaintenanceContent.description)
				.map(METHOD, preventiveMaintenanceContent.method).map(STANDARD, preventiveMaintenanceContent.standard)
				.map(TOOL, preventiveMaintenanceContent.tool)
				.map(MATERIAL_CATALOG, preventiveMaintenanceContent.materialCatalog)
				.map(START_DATE, preventiveMaintenanceContent.startDate)
				.map(SINGLE_CYCLE, preventiveMaintenanceContent.singleCycle)
				.map(CYCLE_UNIT, preventiveMaintenanceContent.cycleUnit)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, preventiveMaintenanceContent.preventiveMaintenanceStandard)
				.map(RECORD_STATUS, preventiveMaintenanceContent.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceContent.createdDate)
				.map(CREATED_BY, preventiveMaintenanceContent.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceContent.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceContent.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceContent);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandard
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceContent> findByPreventiveMaintenanceStandard(
			PreventiveMaintenanceStandard preventiveMaintenanceStandard, GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceContent preventiveMaintenanceContent = QPreventiveMaintenanceContent.preventiveMaintenanceContent;
		JPQLQuery<PreventiveMaintenanceContent> query = from(preventiveMaintenanceContent);
		Assert.notNull(preventiveMaintenanceStandard, "preventiveMaintenanceStandard is required");
		query.where(preventiveMaintenanceContent.preventiveMaintenanceStandard.eq(preventiveMaintenanceStandard));
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceContent.serialNo,
				preventiveMaintenanceContent.description, preventiveMaintenanceContent.method,
				preventiveMaintenanceContent.standard, preventiveMaintenanceContent.tool,
				preventiveMaintenanceContent.materialCatalog, preventiveMaintenanceContent.startDate,
				preventiveMaintenanceContent.singleCycle, preventiveMaintenanceContent.cycleUnit,
				preventiveMaintenanceContent.preventiveMaintenanceStandard, preventiveMaintenanceContent.recordStatus,
				preventiveMaintenanceContent.createdDate, preventiveMaintenanceContent.createdBy,
				preventiveMaintenanceContent.lastModifiedDate, preventiveMaintenanceContent.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SERIAL_NO, preventiveMaintenanceContent.serialNo)
				.map(DESCRIPTION, preventiveMaintenanceContent.description)
				.map(METHOD, preventiveMaintenanceContent.method).map(STANDARD, preventiveMaintenanceContent.standard)
				.map(TOOL, preventiveMaintenanceContent.tool)
				.map(MATERIAL_CATALOG, preventiveMaintenanceContent.materialCatalog)
				.map(START_DATE, preventiveMaintenanceContent.startDate)
				.map(SINGLE_CYCLE, preventiveMaintenanceContent.singleCycle)
				.map(CYCLE_UNIT, preventiveMaintenanceContent.cycleUnit)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, preventiveMaintenanceContent.preventiveMaintenanceStandard)
				.map(RECORD_STATUS, preventiveMaintenanceContent.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceContent.createdDate)
				.map(CREATED_BY, preventiveMaintenanceContent.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceContent.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceContent.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceContent);
	}
}
