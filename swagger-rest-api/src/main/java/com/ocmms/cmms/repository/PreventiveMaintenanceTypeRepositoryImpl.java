package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenanceType;
import com.ocmms.cmms.model.pm.plan.QPreventiveMaintenanceType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenanceTypeRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PreventiveMaintenanceTypeRepositoryImpl extends QueryDslRepositorySupportExt<PreventiveMaintenanceType>
		implements PreventiveMaintenanceTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	PreventiveMaintenanceTypeRepositoryImpl() {
		super(PreventiveMaintenanceType.class);
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
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TYPE = "type";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPreventiveMaintenanceType preventiveMaintenanceType = QPreventiveMaintenanceType.preventiveMaintenanceType;
		JPQLQuery<PreventiveMaintenanceType> query = from(preventiveMaintenanceType);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceType.type, preventiveMaintenanceType.description,
				preventiveMaintenanceType.recordStatus, preventiveMaintenanceType.createdDate,
				preventiveMaintenanceType.createdBy, preventiveMaintenanceType.lastModifiedDate,
				preventiveMaintenanceType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, preventiveMaintenanceType.type)
				.map(DESCRIPTION, preventiveMaintenanceType.description)
				.map(RECORD_STATUS, preventiveMaintenanceType.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceType.createdDate)
				.map(CREATED_BY, preventiveMaintenanceType.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PreventiveMaintenanceType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPreventiveMaintenanceType preventiveMaintenanceType = QPreventiveMaintenanceType.preventiveMaintenanceType;
		JPQLQuery<PreventiveMaintenanceType> query = from(preventiveMaintenanceType);
		Path<?>[] paths = new Path<?>[] { preventiveMaintenanceType.type, preventiveMaintenanceType.description,
				preventiveMaintenanceType.recordStatus, preventiveMaintenanceType.createdDate,
				preventiveMaintenanceType.createdBy, preventiveMaintenanceType.lastModifiedDate,
				preventiveMaintenanceType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(preventiveMaintenanceType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, preventiveMaintenanceType.type)
				.map(DESCRIPTION, preventiveMaintenanceType.description)
				.map(RECORD_STATUS, preventiveMaintenanceType.recordStatus)
				.map(CREATED_DATE, preventiveMaintenanceType.createdDate)
				.map(CREATED_BY, preventiveMaintenanceType.createdBy)
				.map(LAST_MODIFIED_DATE, preventiveMaintenanceType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, preventiveMaintenanceType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, preventiveMaintenanceType);
	}
}
