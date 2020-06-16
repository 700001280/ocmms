package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.FailureDamageType;
import com.ocmms.cmms.model.pm.notification.QFailureDamageType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FailureDamageTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class FailureDamageTypeRepositoryImpl extends QueryDslRepositorySupportExt<FailureDamageType>
		implements FailureDamageTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	FailureDamageTypeRepositoryImpl() {
		super(FailureDamageType.class);
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
	public Page<FailureDamageType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QFailureDamageType failureDamageType = QFailureDamageType.failureDamageType;
		JPQLQuery<FailureDamageType> query = from(failureDamageType);
		Path<?>[] paths = new Path<?>[] { failureDamageType.code, failureDamageType.description,
				failureDamageType.groupCode, failureDamageType.groupDescription, failureDamageType.subCode,
				failureDamageType.subDescription, failureDamageType.recordStatus, failureDamageType.createdDate,
				failureDamageType.createdBy, failureDamageType.lastModifiedDate, failureDamageType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, failureDamageType.code)
				.map(DESCRIPTION, failureDamageType.description).map(GROUP_CODE, failureDamageType.groupCode)
				.map(GROUP_DESCRIPTION, failureDamageType.groupDescription).map(SUB_CODE, failureDamageType.subCode)
				.map(SUB_DESCRIPTION, failureDamageType.subDescription)
				.map(RECORD_STATUS, failureDamageType.recordStatus).map(CREATED_DATE, failureDamageType.createdDate)
				.map(CREATED_BY, failureDamageType.createdBy)
				.map(LAST_MODIFIED_DATE, failureDamageType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureDamageType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureDamageType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<FailureDamageType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QFailureDamageType failureDamageType = QFailureDamageType.failureDamageType;
		JPQLQuery<FailureDamageType> query = from(failureDamageType);
		Path<?>[] paths = new Path<?>[] { failureDamageType.code, failureDamageType.description,
				failureDamageType.groupCode, failureDamageType.groupDescription, failureDamageType.subCode,
				failureDamageType.subDescription, failureDamageType.recordStatus, failureDamageType.createdDate,
				failureDamageType.createdBy, failureDamageType.lastModifiedDate, failureDamageType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(failureDamageType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, failureDamageType.code)
				.map(DESCRIPTION, failureDamageType.description).map(GROUP_CODE, failureDamageType.groupCode)
				.map(GROUP_DESCRIPTION, failureDamageType.groupDescription).map(SUB_CODE, failureDamageType.subCode)
				.map(SUB_DESCRIPTION, failureDamageType.subDescription)
				.map(RECORD_STATUS, failureDamageType.recordStatus).map(CREATED_DATE, failureDamageType.createdDate)
				.map(CREATED_BY, failureDamageType.createdBy)
				.map(LAST_MODIFIED_DATE, failureDamageType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureDamageType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureDamageType);
	}
}
