package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;

import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartScrappingOutstockDetailRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "partscrappingoutstockdetail", path = "partscrappingoutstockdetail")
public interface PartScrappingOutstockDetailRepository extends  PartScrappingOutstockDetailRepositoryCustom,
		PagingAndSortingRepository<PartScrappingOutstockDetail, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partScrappingRecord
	 * @return Long
	 */
	public abstract long countByPartScrappingRecord(PartScrappingRecord partScrappingRecord);
}
