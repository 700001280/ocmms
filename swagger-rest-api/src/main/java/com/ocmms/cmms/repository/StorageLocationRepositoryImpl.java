package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.mm.storage.QStorageLocation;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = StorageLocationRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class StorageLocationRepositoryImpl extends QueryDslRepositorySupportExt<StorageLocation>
		implements StorageLocationRepositoryCustom {

	/**
	 * Default constructor
	 */
	StorageLocationRepositoryImpl() {
		super(StorageLocation.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOCATION = "location";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WAREHOUSE = "warehouse";

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
	public static final String BIN_NAME = "binName";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<StorageLocation> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QStorageLocation storageLocation = QStorageLocation.storageLocation;
		JPQLQuery<StorageLocation> query = from(storageLocation);
		Path<?>[] paths = new Path<?>[] { storageLocation.warehouse, storageLocation.location, storageLocation.binName,
				storageLocation.description, storageLocation.recordStatus, storageLocation.createdDate,
				storageLocation.createdBy, storageLocation.lastModifiedDate, storageLocation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WAREHOUSE, storageLocation.warehouse)
				.map(LOCATION, storageLocation.location).map(BIN_NAME, storageLocation.binName)
				.map(DESCRIPTION, storageLocation.description).map(RECORD_STATUS, storageLocation.recordStatus)
				.map(CREATED_DATE, storageLocation.createdDate).map(CREATED_BY, storageLocation.createdBy)
				.map(LAST_MODIFIED_DATE, storageLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, storageLocation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, storageLocation);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<StorageLocation> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QStorageLocation storageLocation = QStorageLocation.storageLocation;
		JPQLQuery<StorageLocation> query = from(storageLocation);
		Path<?>[] paths = new Path<?>[] { storageLocation.warehouse, storageLocation.location, storageLocation.binName,
				storageLocation.description, storageLocation.recordStatus, storageLocation.createdDate,
				storageLocation.createdBy, storageLocation.lastModifiedDate, storageLocation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(storageLocation.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(WAREHOUSE, storageLocation.warehouse)
				.map(LOCATION, storageLocation.location).map(BIN_NAME, storageLocation.binName)
				.map(DESCRIPTION, storageLocation.description).map(RECORD_STATUS, storageLocation.recordStatus)
				.map(CREATED_DATE, storageLocation.createdDate).map(CREATED_BY, storageLocation.createdBy)
				.map(LAST_MODIFIED_DATE, storageLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, storageLocation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, storageLocation);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param warehouse
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<StorageLocation> findByWarehouse(Warehouse warehouse, GlobalSearch globalSearch, Pageable pageable) {
		QStorageLocation storageLocation = QStorageLocation.storageLocation;
		JPQLQuery<StorageLocation> query = from(storageLocation);
		Assert.notNull(warehouse, "warehouse is required");
		query.where(storageLocation.warehouse.eq(warehouse));
		Path<?>[] paths = new Path<?>[] { storageLocation.warehouse, storageLocation.location, storageLocation.binName,
				storageLocation.description, storageLocation.recordStatus, storageLocation.createdDate,
				storageLocation.createdBy, storageLocation.lastModifiedDate, storageLocation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WAREHOUSE, storageLocation.warehouse)
				.map(LOCATION, storageLocation.location).map(BIN_NAME, storageLocation.binName)
				.map(DESCRIPTION, storageLocation.description).map(RECORD_STATUS, storageLocation.recordStatus)
				.map(CREATED_DATE, storageLocation.createdDate).map(CREATED_BY, storageLocation.createdBy)
				.map(LAST_MODIFIED_DATE, storageLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, storageLocation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, storageLocation);
	}
}
