package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProcurementRequestRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ProcurementRequest.class)
public interface ProcurementRequestRepository extends DetachableJpaRepository<ProcurementRequest, Long>, ProcurementRequestRepositoryCustom {
}
