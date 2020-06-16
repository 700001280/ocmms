package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.ScrewElement;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ScrewElementRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "screwelement", path = "screwelement")
public interface ScrewElementRepository extends  ScrewElementRepositoryCustom,
		PagingAndSortingRepository<ScrewElement, Long> {
}
