package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentLubricationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentLubrication.class)
public interface EquipmentLubricationRepository extends DetachableJpaRepository<EquipmentLubrication, Long>, EquipmentLubricationRepositoryCustom {
}
