package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetClassification;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AssetClassificationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "assetclassification", path = "assetclassification")
public interface AssetClassificationRepository extends  AssetClassificationRepositoryCustom,
		PagingAndSortingRepository<AssetClassification, Long> 
{
}
