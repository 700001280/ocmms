package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentParameter;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentParameterRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentParameter.class)
public interface EquipmentParameterRepository extends DetachableJpaRepository<EquipmentParameter, Long>, EquipmentParameterRepositoryCustom {
}
