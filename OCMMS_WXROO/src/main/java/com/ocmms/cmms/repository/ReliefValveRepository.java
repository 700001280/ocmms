package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ReliefValveRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ReliefValve.class)
public interface ReliefValveRepository extends DetachableJpaRepository<ReliefValve, Long>, ReliefValveRepositoryCustom {
}
