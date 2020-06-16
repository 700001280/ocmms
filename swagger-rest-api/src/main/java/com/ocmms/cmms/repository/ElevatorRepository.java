package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ElevatorRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "elevator", path = "elevator")
public interface ElevatorRepository extends  ElevatorRepositoryCustom,
		PagingAndSortingRepository<Elevator, Long> {
}
