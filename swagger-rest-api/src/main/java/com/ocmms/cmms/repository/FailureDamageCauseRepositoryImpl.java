package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.FailureDamageCause;
import com.ocmms.cmms.model.pm.notification.QFailureDamageCause;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FailureDamageCauseRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class FailureDamageCauseRepositoryImpl extends QueryDslRepositorySupportExt<FailureDamageCause>
		implements FailureDamageCauseRepositoryCustom {

	/**
	 * Default constructor
	 */
	FailureDamageCauseRepositoryImpl() {
		super(FailureDamageCause.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EXPLANATION = "explanation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUB_CODE = "subCode";

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
	public static final String SUB_DESCRIPTION = "subDescription";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String GROUP_DESCRIPTION = "groupDescription";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String GROUP_CODE = "groupCode";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<FailureDamageCause> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QFailureDamageCause failureDamageCause = QFailureDamageCause.failureDamageCause;
		JPQLQuery<FailureDamageCause> query = from(failureDamageCause);
		Path<?>[] paths = new Path<?>[] { failureDamageCause.code, failureDamageCause.description,
				failureDamageCause.groupCode, failureDamageCause.groupDescription, failureDamageCause.subCode,
				failureDamageCause.subDescription, failureDamageCause.explanation, failureDamageCause.recordStatus,
				failureDamageCause.createdDate, failureDamageCause.createdBy, failureDamageCause.lastModifiedDate,
				failureDamageCause.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, failureDamageCause.code)
				.map(DESCRIPTION, failureDamageCause.description).map(GROUP_CODE, failureDamageCause.groupCode)
				.map(GROUP_DESCRIPTION, failureDamageCause.groupDescription).map(SUB_CODE, failureDamageCause.subCode)
				.map(SUB_DESCRIPTION, failureDamageCause.subDescription)
				.map(EXPLANATION, failureDamageCause.explanation).map(RECORD_STATUS, failureDamageCause.recordStatus)
				.map(CREATED_DATE, failureDamageCause.createdDate).map(CREATED_BY, failureDamageCause.createdBy)
				.map(LAST_MODIFIED_DATE, failureDamageCause.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureDamageCause.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureDamageCause);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<FailureDamageCause> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QFailureDamageCause failureDamageCause = QFailureDamageCause.failureDamageCause;
		JPQLQuery<FailureDamageCause> query = from(failureDamageCause);
		Path<?>[] paths = new Path<?>[] { failureDamageCause.code, failureDamageCause.description,
				failureDamageCause.groupCode, failureDamageCause.groupDescription, failureDamageCause.subCode,
				failureDamageCause.subDescription, failureDamageCause.explanation, failureDamageCause.recordStatus,
				failureDamageCause.createdDate, failureDamageCause.createdBy, failureDamageCause.lastModifiedDate,
				failureDamageCause.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(failureDamageCause.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, failureDamageCause.code)
				.map(DESCRIPTION, failureDamageCause.description).map(GROUP_CODE, failureDamageCause.groupCode)
				.map(GROUP_DESCRIPTION, failureDamageCause.groupDescription).map(SUB_CODE, failureDamageCause.subCode)
				.map(SUB_DESCRIPTION, failureDamageCause.subDescription)
				.map(EXPLANATION, failureDamageCause.explanation).map(RECORD_STATUS, failureDamageCause.recordStatus)
				.map(CREATED_DATE, failureDamageCause.createdDate).map(CREATED_BY, failureDamageCause.createdBy)
				.map(LAST_MODIFIED_DATE, failureDamageCause.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureDamageCause.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureDamageCause);
	}
}
