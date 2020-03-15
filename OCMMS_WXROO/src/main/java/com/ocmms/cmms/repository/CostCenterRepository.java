package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.fico.CostCenter;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CostCenterRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = CostCenter.class)
public interface CostCenterRepository extends DetachableJpaRepository<CostCenter, Long>, CostCenterRepositoryCustom {
}
