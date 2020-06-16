package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.BarcodeDefinition;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = BarcodeDefinitionRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "barcodedefinition", path = "barcodedefinition")
public interface BarcodeDefinitionRepository extends  BarcodeDefinitionRepositoryCustom,
		PagingAndSortingRepository<BarcodeDefinition, Long>  {
}
