package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = RepairMaterialInstockDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = RepairMaterialInstockDetail.class)
public interface RepairMaterialInstockDetailRepository extends DetachableJpaRepository<RepairMaterialInstockDetail, Long>, RepairMaterialInstockDetailRepositoryCustom {
}
