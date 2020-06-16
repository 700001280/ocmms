package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.StorageType;
import com.ocmms.cmms.model.mm.storage.QStorageType;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = StorageTypeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class StorageTypeRepositoryImpl extends QueryDslRepositorySupportExt<StorageType>
		implements StorageTypeRepositoryCustom {

	/**
	 * Default constructor
	 */
	StorageTypeRepositoryImpl() {
		super(StorageType.class);
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
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<StorageType> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QStorageType storageType = QStorageType.storageType;
		JPQLQuery<StorageType> query = from(storageType);
		Path<?>[] paths = new Path<?>[] { storageType.code, storageType.memo, storageType.description,
				storageType.recordStatus, storageType.createdDate, storageType.createdBy, storageType.lastModifiedDate,
				storageType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, storageType.code).map(MEMO, storageType.memo)
				.map(DESCRIPTION, storageType.description).map(RECORD_STATUS, storageType.recordStatus)
				.map(CREATED_DATE, storageType.createdDate).map(CREATED_BY, storageType.createdBy)
				.map(LAST_MODIFIED_DATE, storageType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, storageType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, storageType);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<StorageType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QStorageType storageType = QStorageType.storageType;
		JPQLQuery<StorageType> query = from(storageType);
		Path<?>[] paths = new Path<?>[] { storageType.code, storageType.memo, storageType.description,
				storageType.recordStatus, storageType.createdDate, storageType.createdBy, storageType.lastModifiedDate,
				storageType.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(storageType.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, storageType.code).map(MEMO, storageType.memo)
				.map(DESCRIPTION, storageType.description).map(RECORD_STATUS, storageType.recordStatus)
				.map(CREATED_DATE, storageType.createdDate).map(CREATED_BY, storageType.createdBy)
				.map(LAST_MODIFIED_DATE, storageType.lastModifiedDate)
				.map(LAST_MODIFIED_BY, storageType.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, storageType);
	}
}
