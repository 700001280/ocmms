package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Equipment.class)
public interface EquipmentRepository extends DetachableJpaRepository<Equipment, Long>, EquipmentRepositoryCustom {
}
