package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.QPlannerGroup;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PlannerGroupRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PlannerGroupRepositoryImpl extends QueryDslRepositorySupportExt<PlannerGroup>
		implements PlannerGroupRepositoryCustom {

	/**
	 * Default constructor
	 */
	PlannerGroupRepositoryImpl() {
		super(PlannerGroup.class);
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
	public static final String PHONE_NUMBER = "phoneNumber";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlannerGroup> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPlannerGroup plannerGroup = QPlannerGroup.plannerGroup;
		JPQLQuery<PlannerGroup> query = from(plannerGroup);
		Path<?>[] paths = new Path<?>[] { plannerGroup.code, plannerGroup.description, plannerGroup.organization,
				plannerGroup.phoneNumber, plannerGroup.recordStatus, plannerGroup.createdDate, plannerGroup.createdBy,
				plannerGroup.lastModifiedDate, plannerGroup.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, plannerGroup.code)
				.map(DESCRIPTION, plannerGroup.description).map(ORGANIZATION, plannerGroup.organization)
				.map(PHONE_NUMBER, plannerGroup.phoneNumber).map(RECORD_STATUS, plannerGroup.recordStatus)
				.map(CREATED_DATE, plannerGroup.createdDate).map(CREATED_BY, plannerGroup.createdBy)
				.map(LAST_MODIFIED_DATE, plannerGroup.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plannerGroup.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plannerGroup);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlannerGroup> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPlannerGroup plannerGroup = QPlannerGroup.plannerGroup;
		JPQLQuery<PlannerGroup> query = from(plannerGroup);
		Path<?>[] paths = new Path<?>[] { plannerGroup.code, plannerGroup.description, plannerGroup.organization,
				plannerGroup.phoneNumber, plannerGroup.recordStatus, plannerGroup.createdDate, plannerGroup.createdBy,
				plannerGroup.lastModifiedDate, plannerGroup.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(plannerGroup.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, plannerGroup.code)
				.map(DESCRIPTION, plannerGroup.description).map(ORGANIZATION, plannerGroup.organization)
				.map(PHONE_NUMBER, plannerGroup.phoneNumber).map(RECORD_STATUS, plannerGroup.recordStatus)
				.map(CREATED_DATE, plannerGroup.createdDate).map(CREATED_BY, plannerGroup.createdBy)
				.map(LAST_MODIFIED_DATE, plannerGroup.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plannerGroup.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plannerGroup);
	}
}
