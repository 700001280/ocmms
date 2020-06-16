package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.StorageLocation;

import com.ocmms.cmms.model.mm.storage.Warehouse;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = StorageLocationRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface StorageLocationRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param warehouse
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<StorageLocation> findByWarehouse(Warehouse warehouse, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<StorageLocation> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<StorageLocation> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
