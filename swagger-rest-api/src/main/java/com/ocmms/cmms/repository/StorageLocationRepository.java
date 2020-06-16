package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.StorageLocation;

import com.ocmms.cmms.model.mm.storage.Warehouse;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = StorageLocationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "storagelocation", path = "storagelocation")
public interface StorageLocationRepository extends  StorageLocationRepositoryCustom,
		PagingAndSortingRepository<StorageLocation, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param warehouse
	 * @return Long
	 */
	public abstract long countByWarehouse(Warehouse warehouse);
}
