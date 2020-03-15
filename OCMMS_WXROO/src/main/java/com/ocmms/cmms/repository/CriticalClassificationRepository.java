package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CriticalClassificationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = CriticalClassification.class)
public interface CriticalClassificationRepository extends DetachableJpaRepository<CriticalClassification, Long>, CriticalClassificationRepositoryCustom {
}
