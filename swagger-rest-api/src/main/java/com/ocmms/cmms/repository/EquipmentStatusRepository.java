package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentStatusRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "equipmentstatus", path = "equipmentstatus")
public interface EquipmentStatusRepository extends  EquipmentStatusRepositoryCustom,
		PagingAndSortingRepository<EquipmentStatus, Long> {
}
