package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MovementType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MovementTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "movementtype", path = "movementtype")
public interface MovementTypeRepository extends  MovementTypeRepositoryCustom,
		PagingAndSortingRepository<MovementType, Long> {
}
