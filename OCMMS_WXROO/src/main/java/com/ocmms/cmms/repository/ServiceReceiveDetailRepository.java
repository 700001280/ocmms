package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ServiceReceiveDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ServiceReceiveDetail.class)
public interface ServiceReceiveDetailRepository extends DetachableJpaRepository<ServiceReceiveDetail, Long>, ServiceReceiveDetailRepositoryCustom {
}
