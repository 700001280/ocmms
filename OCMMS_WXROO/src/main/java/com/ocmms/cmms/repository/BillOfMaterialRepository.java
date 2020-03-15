package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = BillOfMaterialRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = BillOfMaterial.class)
public interface BillOfMaterialRepository extends DetachableJpaRepository<BillOfMaterial, Long>, BillOfMaterialRepositoryCustom {
}
