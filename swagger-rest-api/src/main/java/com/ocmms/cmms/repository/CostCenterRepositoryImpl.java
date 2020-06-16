package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.fico.QCostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = CostCenterRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class CostCenterRepositoryImpl extends QueryDslRepositorySupportExt<CostCenter>
		implements CostCenterRepositoryCustom {

	/**
	 * Default constructor
	 */
	CostCenterRepositoryImpl() {
		super(CostCenter.class);
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
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<CostCenter> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QCostCenter costCenter = QCostCenter.costCenter;
		JPQLQuery<CostCenter> query = from(costCenter);
		Path<?>[] paths = new Path<?>[] { costCenter.code, costCenter.description, costCenter.organization,
				costCenter.recordStatus, costCenter.createdDate, costCenter.createdBy, costCenter.lastModifiedDate,
				costCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, costCenter.code)
				.map(DESCRIPTION, costCenter.description).map(ORGANIZATION, costCenter.organization)
				.map(RECORD_STATUS, costCenter.recordStatus).map(CREATED_DATE, costCenter.createdDate)
				.map(CREATED_BY, costCenter.createdBy).map(LAST_MODIFIED_DATE, costCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, costCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, costCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<CostCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QCostCenter costCenter = QCostCenter.costCenter;
		JPQLQuery<CostCenter> query = from(costCenter);
		Path<?>[] paths = new Path<?>[] { costCenter.code, costCenter.description, costCenter.organization,
				costCenter.recordStatus, costCenter.createdDate, costCenter.createdBy, costCenter.lastModifiedDate,
				costCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(costCenter.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, costCenter.code)
				.map(DESCRIPTION, costCenter.description).map(ORGANIZATION, costCenter.organization)
				.map(RECORD_STATUS, costCenter.recordStatus).map(CREATED_DATE, costCenter.createdDate)
				.map(CREATED_BY, costCenter.createdBy).map(LAST_MODIFIED_DATE, costCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, costCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, costCenter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<CostCenter> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable) {
		QCostCenter costCenter = QCostCenter.costCenter;
		JPQLQuery<CostCenter> query = from(costCenter);
		Assert.notNull(organization, "organization is required");
		query.where(costCenter.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { costCenter.code, costCenter.description, costCenter.organization,
				costCenter.recordStatus, costCenter.createdDate, costCenter.createdBy, costCenter.lastModifiedDate,
				costCenter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, costCenter.code)
				.map(DESCRIPTION, costCenter.description).map(ORGANIZATION, costCenter.organization)
				.map(RECORD_STATUS, costCenter.recordStatus).map(CREATED_DATE, costCenter.createdDate)
				.map(CREATED_BY, costCenter.createdBy).map(LAST_MODIFIED_DATE, costCenter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, costCenter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, costCenter);
	}
}
