package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentCategoryRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentCategory.class)
public interface EquipmentCategoryRepository extends DetachableJpaRepository<EquipmentCategory, Long>, EquipmentCategoryRepositoryCustom {
}
