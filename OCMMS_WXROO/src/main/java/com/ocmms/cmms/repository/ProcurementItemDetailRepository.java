package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProcurementItemDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ProcurementItemDetail.class)
public interface ProcurementItemDetailRepository extends DetachableJpaRepository<ProcurementItemDetail, Long>, ProcurementItemDetailRepositoryCustom {
}
