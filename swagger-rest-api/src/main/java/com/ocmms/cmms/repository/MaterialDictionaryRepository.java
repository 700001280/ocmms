package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialDictionaryRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialdictionary", path = "materialdictionary")
public interface MaterialDictionaryRepository extends  MaterialDictionaryRepositoryCustom,
		PagingAndSortingRepository<MaterialDictionary, Long> {
}
