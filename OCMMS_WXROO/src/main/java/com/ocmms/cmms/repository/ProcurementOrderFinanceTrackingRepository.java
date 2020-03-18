package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProcurementOrderFinanceTrackingRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ProcurementOrderFinanceTracking.class)
public interface ProcurementOrderFinanceTrackingRepository extends DetachableJpaRepository<ProcurementOrderFinanceTracking, Long>, ProcurementOrderFinanceTrackingRepositoryCustom {
}
