package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.mm.storage.StorageType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = StorageTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "storagetype", path = "storagetype")
public interface StorageTypeRepository extends  StorageTypeRepositoryCustom,
		PagingAndSortingRepository<StorageType, Long>{
}
