package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import com.ocmms.cmms.model.mm.master.QServiceCatalog;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ServiceCatalogRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ServiceCatalogRepositoryImpl extends QueryDslRepositorySupportExt<ServiceCatalog>
		implements ServiceCatalogRepositoryCustom {

	/**
	 * Default constructor
	 */
	ServiceCatalogRepositoryImpl() {
		super(ServiceCatalog.class);
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
	public static final String GENERAL_LEDGER_ACCOUNT = "generalLedgerAccount";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_GROUP = "materialGroup";

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
	public static final String PURPOSE = "purpose";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_NAME = "materialName";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ServiceCatalog> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QServiceCatalog serviceCatalog = QServiceCatalog.serviceCatalog;
		JPQLQuery<ServiceCatalog> query = from(serviceCatalog);
		Path<?>[] paths = new Path<?>[] { serviceCatalog.code, serviceCatalog.materialName,
				serviceCatalog.materialGroup, serviceCatalog.recordStatus, serviceCatalog.createdDate,
				serviceCatalog.createdBy, serviceCatalog.lastModifiedDate, serviceCatalog.lastModifiedBy,
				serviceCatalog.category, serviceCatalog.purpose, serviceCatalog.generalLedgerAccount };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, serviceCatalog.code)
				.map(MATERIAL_NAME, serviceCatalog.materialName).map(MATERIAL_GROUP, serviceCatalog.materialGroup)
				.map(RECORD_STATUS, serviceCatalog.recordStatus).map(CREATED_DATE, serviceCatalog.createdDate)
				.map(CREATED_BY, serviceCatalog.createdBy).map(LAST_MODIFIED_DATE, serviceCatalog.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceCatalog.lastModifiedBy).map(CATEGORY, serviceCatalog.category)
				.map(PURPOSE, serviceCatalog.purpose).map(GENERAL_LEDGER_ACCOUNT, serviceCatalog.generalLedgerAccount);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceCatalog);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ServiceCatalog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QServiceCatalog serviceCatalog = QServiceCatalog.serviceCatalog;
		JPQLQuery<ServiceCatalog> query = from(serviceCatalog);
		Path<?>[] paths = new Path<?>[] { serviceCatalog.code, serviceCatalog.materialName,
				serviceCatalog.materialGroup, serviceCatalog.recordStatus, serviceCatalog.createdDate,
				serviceCatalog.createdBy, serviceCatalog.lastModifiedDate, serviceCatalog.lastModifiedBy,
				serviceCatalog.category, serviceCatalog.purpose, serviceCatalog.generalLedgerAccount };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(serviceCatalog.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, serviceCatalog.code)
				.map(MATERIAL_NAME, serviceCatalog.materialName).map(MATERIAL_GROUP, serviceCatalog.materialGroup)
				.map(RECORD_STATUS, serviceCatalog.recordStatus).map(CREATED_DATE, serviceCatalog.createdDate)
				.map(CREATED_BY, serviceCatalog.createdBy).map(LAST_MODIFIED_DATE, serviceCatalog.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceCatalog.lastModifiedBy).map(CATEGORY, serviceCatalog.category)
				.map(PURPOSE, serviceCatalog.purpose).map(GENERAL_LEDGER_ACCOUNT, serviceCatalog.generalLedgerAccount);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceCatalog);
	}
}
