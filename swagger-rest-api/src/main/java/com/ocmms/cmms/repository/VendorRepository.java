package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.srm.Vendor;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = VendorRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "vendor", path = "vendor")
public interface VendorRepository extends  VendorRepositoryCustom,
		PagingAndSortingRepository<Vendor, Long>{
}
