package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialDiscipline;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialDisciplineRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialdiscipline", path = "materialdiscipline")
public interface MaterialDisciplineRepository extends  MaterialDisciplineRepositoryCustom,
		PagingAndSortingRepository<MaterialDiscipline, Long>  {
}
