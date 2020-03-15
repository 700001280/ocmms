package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ServiceProcurementItemDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ServiceProcurementItemDetail.class)
public interface ServiceProcurementItemDetailRepository extends DetachableJpaRepository<ServiceProcurementItemDetail, Long>, ServiceProcurementItemDetailRepositoryCustom {
}
