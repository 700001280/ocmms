package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.eshem.CriticalClassification;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CriticalClassificationRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "criticalclassification", path = "criticalclassification")
public interface CriticalClassificationRepository extends  CriticalClassificationRepositoryCustom,
		PagingAndSortingRepository<CriticalClassification, Long>  {
}
