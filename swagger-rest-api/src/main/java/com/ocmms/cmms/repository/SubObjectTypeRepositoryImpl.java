package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.SubObjectType;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.model.pm.configuration.QSubObjectType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = SubObjectTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class SubObjectTypeRepositoryImpl extends QueryDslRepositorySupportExt<SubObjectType>
		implements SubObjectTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	SubObjectTypeRepositoryImpl() {
		super(SubObjectType.class);
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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OBJECT_TYPE = "objectType";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<SubObjectType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QSubObjectType subObjectType = QSubObjectType.subObjectType;
		JPQLQuery<SubObjectType> query = from(subObjectType);
		Path<?>[] paths = new Path<?>[] { subObjectType.code, subObjectType.description, subObjectType.objectType,
				subObjectType.recordStatus, subObjectType.createdDate, subObjectType.createdBy,
				subObjectType.lastModifiedDate, subObjectType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, subObjectType.code)
				.map(DESCRIPTION, subObjectType.description).map(OBJECT_TYPE, subObjectType.objectType)
				.map(RECORD_STATUS, subObjectType.recordStatus).map(CREATED_DATE, subObjectType.createdDate)
				.map(CREATED_BY, subObjectType.createdBy).map(LAST_MODIFIED_DATE, subObjectType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, subObjectType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, subObjectType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<SubObjectType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QSubObjectType subObjectType = QSubObjectType.subObjectType;
		JPQLQuery<SubObjectType> query = from(subObjectType);
		Path<?>[] paths = new Path<?>[] { subObjectType.code, subObjectType.description, subObjectType.objectType,
				subObjectType.recordStatus, subObjectType.createdDate, subObjectType.createdBy,
				subObjectType.lastModifiedDate, subObjectType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(subObjectType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, subObjectType.code)
				.map(DESCRIPTION, subObjectType.description).map(OBJECT_TYPE, subObjectType.objectType)
				.map(RECORD_STATUS, subObjectType.recordStatus).map(CREATED_DATE, subObjectType.createdDate)
				.map(CREATED_BY, subObjectType.createdBy).map(LAST_MODIFIED_DATE, subObjectType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, subObjectType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, subObjectType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param objectType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<SubObjectType> findByObjectType(ObjectType objectType, GlobalSearch globalSearch, Pageable pageable) {
		QSubObjectType subObjectType = QSubObjectType.subObjectType;
		JPQLQuery<SubObjectType> query = from(subObjectType);
		Assert.notNull(objectType, "objectType is required");
		query.where(subObjectType.objectType.eq(objectType));
		Path<?>[] paths = new Path<?>[] { subObjectType.code, subObjectType.description, subObjectType.objectType,
				subObjectType.recordStatus, subObjectType.createdDate, subObjectType.createdBy,
				subObjectType.lastModifiedDate, subObjectType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, subObjectType.code)
				.map(DESCRIPTION, subObjectType.description).map(OBJECT_TYPE, subObjectType.objectType)
				.map(RECORD_STATUS, subObjectType.recordStatus).map(CREATED_DATE, subObjectType.createdDate)
				.map(CREATED_BY, subObjectType.createdBy).map(LAST_MODIFIED_DATE, subObjectType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, subObjectType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, subObjectType);
	}
}
