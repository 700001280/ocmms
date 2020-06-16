package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.PriorityType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PriorityTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "prioritytype", path = "prioritytype")
public interface PriorityTypeRepository extends  PriorityTypeRepositoryCustom,
		PagingAndSortingRepository<PriorityType, Long>{
}
