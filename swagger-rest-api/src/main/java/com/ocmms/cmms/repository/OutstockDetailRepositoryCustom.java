package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.OutstockDetail;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.mm.storage.StorageType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = OutstockDetailRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface OutstockDetailRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OutstockDetail> findByMaterialCatalog(MaterialCatalog materialCatalog,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param movementType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OutstockDetail> findByMovementType(MovementType movementType, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OutstockDetail> findByStorageLocation(StorageLocation storageLocation,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param storageType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OutstockDetail> findByStorageType(StorageType storageType, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OutstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<OutstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
