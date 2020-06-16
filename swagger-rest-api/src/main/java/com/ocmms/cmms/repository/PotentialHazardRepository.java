package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.PotentialHazard;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PotentialHazardRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "potentialhazard", path = "potentialhazard")
public interface PotentialHazardRepository extends  PotentialHazardRepositoryCustom,
		PagingAndSortingRepository<PotentialHazard, Long> {
}
