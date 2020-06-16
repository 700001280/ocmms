package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.OperationRelationship;
import com.ocmms.cmms.model.pm.configuration.QOperationRelationship;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = OperationRelationshipRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class OperationRelationshipRepositoryImpl extends QueryDslRepositorySupportExt<OperationRelationship>
		implements OperationRelationshipRepositoryCustom {

	/**
	 * Default constructor
	 */
	OperationRelationshipRepositoryImpl() {
		super(OperationRelationship.class);
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
	public Page<OperationRelationship> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QOperationRelationship operationRelationship = QOperationRelationship.operationRelationship;
		JPQLQuery<OperationRelationship> query = from(operationRelationship);
		Path<?>[] paths = new Path<?>[] { operationRelationship.type, operationRelationship.description,
				operationRelationship.recordStatus, operationRelationship.createdDate, operationRelationship.createdBy,
				operationRelationship.lastModifiedDate, operationRelationship.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, operationRelationship.type)
				.map(DESCRIPTION, operationRelationship.description)
				.map(RECORD_STATUS, operationRelationship.recordStatus)
				.map(CREATED_DATE, operationRelationship.createdDate).map(CREATED_BY, operationRelationship.createdBy)
				.map(LAST_MODIFIED_DATE, operationRelationship.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationRelationship.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationRelationship);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<OperationRelationship> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QOperationRelationship operationRelationship = QOperationRelationship.operationRelationship;
		JPQLQuery<OperationRelationship> query = from(operationRelationship);
		Path<?>[] paths = new Path<?>[] { operationRelationship.type, operationRelationship.description,
				operationRelationship.recordStatus, operationRelationship.createdDate, operationRelationship.createdBy,
				operationRelationship.lastModifiedDate, operationRelationship.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(operationRelationship.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TYPE, operationRelationship.type)
				.map(DESCRIPTION, operationRelationship.description)
				.map(RECORD_STATUS, operationRelationship.recordStatus)
				.map(CREATED_DATE, operationRelationship.createdDate).map(CREATED_BY, operationRelationship.createdBy)
				.map(LAST_MODIFIED_DATE, operationRelationship.lastModifiedDate)
				.map(LAST_MODIFIED_BY, operationRelationship.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, operationRelationship);
	}
}
