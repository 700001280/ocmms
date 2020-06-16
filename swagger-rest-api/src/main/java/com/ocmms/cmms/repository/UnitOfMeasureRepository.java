package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.UnitOfMeasure;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = UnitOfMeasureRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "unitofmeasure", path = "unitofmeasure")
public interface UnitOfMeasureRepository extends  UnitOfMeasureRepositoryCustom,
		PagingAndSortingRepository<UnitOfMeasure, Long>  {
}
