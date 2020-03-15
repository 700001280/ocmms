package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentStatusRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentStatus.class)
public interface EquipmentStatusRepository extends DetachableJpaRepository<EquipmentStatus, Long>, EquipmentStatusRepositoryCustom {
}
