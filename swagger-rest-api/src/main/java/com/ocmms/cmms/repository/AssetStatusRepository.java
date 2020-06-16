package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetStatus;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AssetStatusRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "assetstatus", path = "assetstatus")
public interface AssetStatusRepository extends  AssetStatusRepositoryCustom,
		PagingAndSortingRepository<AssetStatus, Long>{
}
