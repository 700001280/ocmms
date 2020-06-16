package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ReliefValveRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "reliefvalve", path = "reliefvalve")
public interface ReliefValveRepository extends  ReliefValveRepositoryCustom,
		PagingAndSortingRepository<ReliefValve, Long>  {
}
