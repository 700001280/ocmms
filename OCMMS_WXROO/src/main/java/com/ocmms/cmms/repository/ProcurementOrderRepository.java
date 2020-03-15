package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProcurementOrderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ProcurementOrder.class)
public interface ProcurementOrderRepository extends DetachableJpaRepository<ProcurementOrder, Long>, ProcurementOrderRepositoryCustom {
}
