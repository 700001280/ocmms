package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.model.pm.configuration.QObjectType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ObjectTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ObjectTypeRepositoryImpl extends QueryDslRepositorySupportExt<ObjectType>
		implements ObjectTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	ObjectTypeRepositoryImpl() {
		super(ObjectType.class);
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
	public Page<ObjectType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QObjectType objectType = QObjectType.objectType;
		JPQLQuery<ObjectType> query = from(objectType);
		Path<?>[] paths = new Path<?>[] { objectType.code, objectType.description, objectType.recordStatus,
				objectType.createdDate, objectType.createdBy, objectType.lastModifiedDate, objectType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, objectType.code)
				.map(DESCRIPTION, objectType.description).map(RECORD_STATUS, objectType.recordStatus)
				.map(CREATED_DATE, objectType.createdDate).map(CREATED_BY, objectType.createdBy)
				.map(LAST_MODIFIED_DATE, objectType.lastModifiedDate).map(LAST_MODIFIED_BY, objectType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, objectType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ObjectType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QObjectType objectType = QObjectType.objectType;
		JPQLQuery<ObjectType> query = from(objectType);
		Path<?>[] paths = new Path<?>[] { objectType.code, objectType.description, objectType.recordStatus,
				objectType.createdDate, objectType.createdBy, objectType.lastModifiedDate, objectType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(objectType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, objectType.code)
				.map(DESCRIPTION, objectType.description).map(RECORD_STATUS, objectType.recordStatus)
				.map(CREATED_DATE, objectType.createdDate).map(CREATED_BY, objectType.createdBy)
				.map(LAST_MODIFIED_DATE, objectType.lastModifiedDate).map(LAST_MODIFIED_BY, objectType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, objectType);
	}
}
