package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.system.BarcodeDefinition;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = BarcodeDefinitionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = BarcodeDefinition.class)
public interface BarcodeDefinitionRepository extends DetachableJpaRepository<BarcodeDefinition, Long>, BarcodeDefinitionRepositoryCustom {
}
