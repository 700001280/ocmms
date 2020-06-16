package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoDeviceType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoDeviceTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "lotodevicetype", path = "lotodevicetype")
public interface LotoDeviceTypeRepository extends  LotoDeviceTypeRepositoryCustom,
		PagingAndSortingRepository<LotoDeviceType, Long>  {
}
