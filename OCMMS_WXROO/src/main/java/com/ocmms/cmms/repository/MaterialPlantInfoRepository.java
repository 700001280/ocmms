package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialPlantInfoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialPlantInfo.class)
public interface MaterialPlantInfoRepository extends DetachableJpaRepository<MaterialPlantInfo, Long>, MaterialPlantInfoRepositoryCustom {
}
