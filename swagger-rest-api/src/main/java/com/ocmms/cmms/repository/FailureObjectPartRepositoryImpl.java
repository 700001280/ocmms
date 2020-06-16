package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.FailureObjectPart;
import com.ocmms.cmms.model.pm.notification.QFailureObjectPart;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FailureObjectPartRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class FailureObjectPartRepositoryImpl extends QueryDslRepositorySupportExt<FailureObjectPart>
		implements FailureObjectPartRepositoryCustom {

	/**
	 * Default constructor
	 */
	FailureObjectPartRepositoryImpl() {
		super(FailureObjectPart.class);
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
	public Page<FailureObjectPart> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QFailureObjectPart failureObjectPart = QFailureObjectPart.failureObjectPart;
		JPQLQuery<FailureObjectPart> query = from(failureObjectPart);
		Path<?>[] paths = new Path<?>[] { failureObjectPart.code, failureObjectPart.description,
				failureObjectPart.groupCode, failureObjectPart.groupDescription, failureObjectPart.subCode,
				failureObjectPart.subDescription, failureObjectPart.recordStatus, failureObjectPart.createdDate,
				failureObjectPart.createdBy, failureObjectPart.lastModifiedDate, failureObjectPart.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, failureObjectPart.code)
				.map(DESCRIPTION, failureObjectPart.description).map(GROUP_CODE, failureObjectPart.groupCode)
				.map(GROUP_DESCRIPTION, failureObjectPart.groupDescription).map(SUB_CODE, failureObjectPart.subCode)
				.map(SUB_DESCRIPTION, failureObjectPart.subDescription)
				.map(RECORD_STATUS, failureObjectPart.recordStatus).map(CREATED_DATE, failureObjectPart.createdDate)
				.map(CREATED_BY, failureObjectPart.createdBy)
				.map(LAST_MODIFIED_DATE, failureObjectPart.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureObjectPart.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureObjectPart);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<FailureObjectPart> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QFailureObjectPart failureObjectPart = QFailureObjectPart.failureObjectPart;
		JPQLQuery<FailureObjectPart> query = from(failureObjectPart);
		Path<?>[] paths = new Path<?>[] { failureObjectPart.code, failureObjectPart.description,
				failureObjectPart.groupCode, failureObjectPart.groupDescription, failureObjectPart.subCode,
				failureObjectPart.subDescription, failureObjectPart.recordStatus, failureObjectPart.createdDate,
				failureObjectPart.createdBy, failureObjectPart.lastModifiedDate, failureObjectPart.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(failureObjectPart.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, failureObjectPart.code)
				.map(DESCRIPTION, failureObjectPart.description).map(GROUP_CODE, failureObjectPart.groupCode)
				.map(GROUP_DESCRIPTION, failureObjectPart.groupDescription).map(SUB_CODE, failureObjectPart.subCode)
				.map(SUB_DESCRIPTION, failureObjectPart.subDescription)
				.map(RECORD_STATUS, failureObjectPart.recordStatus).map(CREATED_DATE, failureObjectPart.createdDate)
				.map(CREATED_BY, failureObjectPart.createdBy)
				.map(LAST_MODIFIED_DATE, failureObjectPart.lastModifiedDate)
				.map(LAST_MODIFIED_BY, failureObjectPart.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, failureObjectPart);
	}
}
