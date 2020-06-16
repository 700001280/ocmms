package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.mm.storage.StorageType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = InstockDetailRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "instockdetail", path = "instockdetail")
public interface InstockDetailRepository extends  InstockDetailRepositoryCustom,
		PagingAndSortingRepository<InstockDetail, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @return Long
	 */
	public abstract long countByMaterialCatalog(MaterialCatalog materialCatalog);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param movementType
	 * @return Long
	 */
	public abstract long countByMovementType(MovementType movementType);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageLocation
	 * @return Long
	 */
	public abstract long countByStorageLocation(StorageLocation storageLocation);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageType
	 * @return Long
	 */
	public abstract long countByStorageType(StorageType storageType);
}
