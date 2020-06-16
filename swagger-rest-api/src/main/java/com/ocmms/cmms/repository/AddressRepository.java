package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.ocmms.cmms.model.common.City;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AddressRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends  AddressRepositoryCustom,
		PagingAndSortingRepository<Address, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param city
	 * @return Long
	 */
	public abstract long countByCity(City city);
}
