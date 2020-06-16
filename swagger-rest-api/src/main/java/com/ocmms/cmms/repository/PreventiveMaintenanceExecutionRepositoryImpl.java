package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import com.ocmms.cmms.model.pm.pm.QPreventiveMaintenanceExecution;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = PreventiveMaintenanceExecutionRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PreventiveMaintenanceExecutionRepositoryImpl
		extends QueryDslRepositorySupportExt<PreventiveMaintenanceExecution>
		implements PreventiveMaintenanceExecutionRepositoryCustom {

	/**
	 * Default constructor
	 */
	PreventiveMaintenanceExecutionRepositoryImpl() {
		super(PreventiveMaintenanceExecution.class);
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
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OWNER = "owner";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COMPLETE_DATE = "completeDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PREVENTIVE_MAINTENANCE_CONTENT = "preventiveMaintenanceContent";

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
	public static final String PREVENTIVE_MAINTENANCE_FINDING = "preventiveMaintenanceFinding";

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
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceExecution> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceExecution preventiveMaintenanceExecution = QPreventiveMaintenanceExecution.preventiveMaintenanceExecution;
		JPQLQuery<PreventiveMaintenanceExecution> query = from(preventiveMaintenanceExecution);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceExecution.preventiveMaintenanceContent,
				preventiveMaintenanceExecution.technicalObject, preventiveMaintenanceExecution.description,
				preventiveMaintenanceExecution.startDate, preventiveMaintenanceExecution.completeDate,
				preventiveMaintenanceExecution.owner, preventiveMaintenanceExecution.preventiveMaintenanceFinding,
				preventiveMaintenanceExecution.recordStatus, preventiveMaintenanceExecution.createdDate,
				preventiveMaintenanceExecution.createdBy, preventiveMaintenanceExecution.lastModifiedDate,
				preventiveMaintenanceExecution.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PREVENTIVE_MAINTENANCE_CONTENT, preventiveMaintenanceExecution.preventiveMaintenanceContent)
				.map(TECHNICAL_OBJECT, preventiveMaintenanceExecution.technicalObject)
				.map(DESCRIPTION, preventiveMaintenanceExecution.description)
				.map(START_DATE, preventiveMaintenanceExecution.startDate)
				.map(COMPLETE_DATE, preventiveMaintenanceExecution.completeDate)
				.map(OWNER, preventiveMaintenanceExecution.owner)
				.map(PREVENTIVE_MAINTENANCE_FINDING, preventiveMaintenanceExecution.preventiveMaintenanceFinding)
				.map(RECORD_STATUS, preventiveMaintenanceExecution.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceExecution.createdDate)
				.map(CREATED_BY, preventiveMaintenanceExecution.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceExecution.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceExecution.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceExecution);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceExecution> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPreventiveMaintenanceExecution preventiveMaintenanceExecution = QPreventiveMaintenanceExecution.preventiveMaintenanceExecution;
		JPQLQuery<PreventiveMaintenanceExecution> query = from(preventiveMaintenanceExecution);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceExecution.preventiveMaintenanceContent,
				preventiveMaintenanceExecution.technicalObject, preventiveMaintenanceExecution.description,
				preventiveMaintenanceExecution.startDate, preventiveMaintenanceExecution.completeDate,
				preventiveMaintenanceExecution.owner, preventiveMaintenanceExecution.preventiveMaintenanceFinding,
				preventiveMaintenanceExecution.recordStatus, preventiveMaintenanceExecution.createdDate,
				preventiveMaintenanceExecution.createdBy, preventiveMaintenanceExecution.lastModifiedDate,
				preventiveMaintenanceExecution.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(preventiveMaintenanceExecution.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(PREVENTIVE_MAINTENANCE_CONTENT, preventiveMaintenanceExecution.preventiveMaintenanceContent)
				.map(TECHNICAL_OBJECT, preventiveMaintenanceExecution.technicalObject)
				.map(DESCRIPTION, preventiveMaintenanceExecution.description)
				.map(START_DATE, preventiveMaintenanceExecution.startDate)
				.map(COMPLETE_DATE, preventiveMaintenanceExecution.completeDate)
				.map(OWNER, preventiveMaintenanceExecution.owner)
				.map(PREVENTIVE_MAINTENANCE_FINDING, preventiveMaintenanceExecution.preventiveMaintenanceFinding)
				.map(RECORD_STATUS, preventiveMaintenanceExecution.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceExecution.createdDate)
				.map(CREATED_BY, preventiveMaintenanceExecution.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceExecution.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceExecution.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceExecution);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceExecution> findByTechnicalObject(TechnicalObject technicalObject,
			GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceExecution preventiveMaintenanceExecution = QPreventiveMaintenanceExecution.preventiveMaintenanceExecution;
		JPQLQuery<PreventiveMaintenanceExecution> query = from(preventiveMaintenanceExecution);
		Assert.notNull(technicalObject, "technicalObject is required");
		query.where(preventiveMaintenanceExecution.technicalObject.eq(technicalObject));
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceExecution.preventiveMaintenanceContent,
				preventiveMaintenanceExecution.technicalObject, preventiveMaintenanceExecution.description,
				preventiveMaintenanceExecution.startDate, preventiveMaintenanceExecution.completeDate,
				preventiveMaintenanceExecution.owner, preventiveMaintenanceExecution.preventiveMaintenanceFinding,
				preventiveMaintenanceExecution.recordStatus, preventiveMaintenanceExecution.createdDate,
				preventiveMaintenanceExecution.createdBy, preventiveMaintenanceExecution.lastModifiedDate,
				preventiveMaintenanceExecution.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(PREVENTIVE_MAINTENANCE_CONTENT, preventiveMaintenanceExecution.preventiveMaintenanceContent)
				.map(TECHNICAL_OBJECT, preventiveMaintenanceExecution.technicalObject)
				.map(DESCRIPTION, preventiveMaintenanceExecution.description)
				.map(START_DATE, preventiveMaintenanceExecution.startDate)
				.map(COMPLETE_DATE, preventiveMaintenanceExecution.completeDate)
				.map(OWNER, preventiveMaintenanceExecution.owner)
				.map(PREVENTIVE_MAINTENANCE_FINDING, preventiveMaintenanceExecution.preventiveMaintenanceFinding)
				.map(RECORD_STATUS, preventiveMaintenanceExecution.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceExecution.createdDate)
				.map(CREATED_BY, preventiveMaintenanceExecution.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceExecution.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceExecution.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceExecution);
	}
}
