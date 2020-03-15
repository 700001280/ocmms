package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.LotoDeviceType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = LotoDeviceTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = LotoDeviceType.class)
public interface LotoDeviceTypeRepository extends DetachableJpaRepository<LotoDeviceType, Long>, LotoDeviceTypeRepositoryCustom {
}
