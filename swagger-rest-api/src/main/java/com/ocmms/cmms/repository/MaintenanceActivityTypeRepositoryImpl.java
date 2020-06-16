package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import com.ocmms.cmms.model.pm.technicalobject.QMaintenanceActivityType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaintenanceActivityTypeRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class MaintenanceActivityTypeRepositoryImpl extends QueryDslRepositorySupportExt<MaintenanceActivityType>
		implements MaintenanceActivityTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaintenanceActivityTypeRepositoryImpl() {
		super(MaintenanceActivityType.class);
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
	public static final String CODE = "code";

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
	public Page<MaintenanceActivityType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaintenanceActivityType maintenanceActivityType = QMaintenanceActivityType.maintenanceActivityType;
		JPQLQuery<MaintenanceActivityType> query = from(maintenanceActivityType);
		Path<?>[] paths = new Path<?>[] { maintenanceActivityType.code, maintenanceActivityType.description,
				maintenanceActivityType.recordStatus, maintenanceActivityType.createdDate,
				maintenanceActivityType.createdBy, maintenanceActivityType.lastModifiedDate,
				maintenanceActivityType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, maintenanceActivityType.code)
				.map(DESCRIPTION, maintenanceActivityType.description)
				.map(RECORD_STATUS, maintenanceActivityType.recordStatus)
				.map(CREATED_DATE, maintenanceActivityType.createdDate)
				.map(CREATED_BY, maintenanceActivityType.createdBy)
				.map(LAST_MODIFIED_DATE, maintenanceActivityType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, maintenanceActivityType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, maintenanceActivityType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaintenanceActivityType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaintenanceActivityType maintenanceActivityType = QMaintenanceActivityType.maintenanceActivityType;
		JPQLQuery<MaintenanceActivityType> query = from(maintenanceActivityType);
		Path<?>[] paths = new Path<?>[] { maintenanceActivityType.code, maintenanceActivityType.description,
				maintenanceActivityType.recordStatus, maintenanceActivityType.createdDate,
				maintenanceActivityType.createdBy, maintenanceActivityType.lastModifiedDate,
				maintenanceActivityType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(maintenanceActivityType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, maintenanceActivityType.code)
				.map(DESCRIPTION, maintenanceActivityType.description)
				.map(RECORD_STATUS, maintenanceActivityType.recordStatus)
				.map(CREATED_DATE, maintenanceActivityType.createdDate)
				.map(CREATED_BY, maintenanceActivityType.createdBy)
				.map(LAST_MODIFIED_DATE, maintenanceActivityType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, maintenanceActivityType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, maintenanceActivityType);
	}
}
