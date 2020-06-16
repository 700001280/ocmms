package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.StorageLocation;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialStorageLocationInfoRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialstoragelocationinfo", path = "materialstoragelocationinfo")
public interface MaterialStorageLocationInfoRepository extends  MaterialStorageLocationInfoRepositoryCustom,
		PagingAndSortingRepository<MaterialStorageLocationInfo, Long> {

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
	 * @param storageLocation
	 * @return Long
	 */
	public abstract long countByStorageLocation(StorageLocation storageLocation);
	
	public List<MaterialStorageLocationInfo> findByStorageLocation(StorageLocation storageLocation);
	
	
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param storageLocation
     * @param pageable
     * @return Page
     */
    public abstract List<MaterialStorageLocationInfo> findByMaterialCatalogAndStorageLocation(MaterialCatalog materialCatalog, StorageLocation storageLocation);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param storageLocation
     * @return Long
     */
    public abstract long countByMaterialCatalogAndStorageLocation(MaterialCatalog materialCatalog, StorageLocation storageLocation);
}
