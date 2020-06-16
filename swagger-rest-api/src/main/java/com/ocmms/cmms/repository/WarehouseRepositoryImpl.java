package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.storage.QWarehouse;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WarehouseRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WarehouseRepositoryImpl extends QueryDslRepositorySupportExt<Warehouse>
		implements WarehouseRepositoryCustom {

	/**
	 * Default constructor
	 */
	WarehouseRepositoryImpl() {
		super(Warehouse.class);
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
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Warehouse> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWarehouse warehouse = QWarehouse.warehouse;
		JPQLQuery<Warehouse> query = from(warehouse);
		Path<?>[] paths = new Path<?>[] { warehouse.code, warehouse.memo, warehouse.description, warehouse.organization,
				warehouse.recordStatus, warehouse.createdDate, warehouse.createdBy, warehouse.lastModifiedDate,
				warehouse.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, warehouse.code).map(MEMO, warehouse.memo)
				.map(DESCRIPTION, warehouse.description).map(ORGANIZATION, warehouse.organization)
				.map(RECORD_STATUS, warehouse.recordStatus).map(CREATED_DATE, warehouse.createdDate)
				.map(CREATED_BY, warehouse.createdBy).map(LAST_MODIFIED_DATE, warehouse.lastModifiedDate)
				.map(LAST_MODIFIED_BY, warehouse.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, warehouse);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Warehouse> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWarehouse warehouse = QWarehouse.warehouse;
		JPQLQuery<Warehouse> query = from(warehouse);
		Path<?>[] paths = new Path<?>[] { warehouse.code, warehouse.memo, warehouse.description, warehouse.organization,
				warehouse.recordStatus, warehouse.createdDate, warehouse.createdBy, warehouse.lastModifiedDate,
				warehouse.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(warehouse.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, warehouse.code).map(MEMO, warehouse.memo)
				.map(DESCRIPTION, warehouse.description).map(ORGANIZATION, warehouse.organization)
				.map(RECORD_STATUS, warehouse.recordStatus).map(CREATED_DATE, warehouse.createdDate)
				.map(CREATED_BY, warehouse.createdBy).map(LAST_MODIFIED_DATE, warehouse.lastModifiedDate)
				.map(LAST_MODIFIED_BY, warehouse.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, warehouse);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Warehouse> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable) {
		QWarehouse warehouse = QWarehouse.warehouse;
		JPQLQuery<Warehouse> query = from(warehouse);
		Assert.notNull(organization, "organization is required");
		query.where(warehouse.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { warehouse.code, warehouse.memo, warehouse.description, warehouse.organization,
				warehouse.recordStatus, warehouse.createdDate, warehouse.createdBy, warehouse.lastModifiedDate,
				warehouse.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, warehouse.code).map(MEMO, warehouse.memo)
				.map(DESCRIPTION, warehouse.description).map(ORGANIZATION, warehouse.organization)
				.map(RECORD_STATUS, warehouse.recordStatus).map(CREATED_DATE, warehouse.createdDate)
				.map(CREATED_BY, warehouse.createdBy).map(LAST_MODIFIED_DATE, warehouse.lastModifiedDate)
				.map(LAST_MODIFIED_BY, warehouse.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, warehouse);
	}
}
