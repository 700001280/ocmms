package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MachineWorkCenterRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "machineworkcenter", path = "machineworkcenter")
public interface MachineWorkCenterRepository extends  MachineWorkCenterRepositoryCustom,
		PagingAndSortingRepository<MachineWorkCenter, Long>  {
}
