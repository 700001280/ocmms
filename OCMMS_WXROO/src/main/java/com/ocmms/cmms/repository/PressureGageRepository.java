package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PressureGageRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PressureGage.class)
public interface PressureGageRepository extends DetachableJpaRepository<PressureGage, Long>, PressureGageRepositoryCustom {
}
