package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialProcurementItemDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialProcurementItemDetail.class)
public interface MaterialProcurementItemDetailRepository extends DetachableJpaRepository<MaterialProcurementItemDetail, Long>, MaterialProcurementItemDetailRepositoryCustom {
}
