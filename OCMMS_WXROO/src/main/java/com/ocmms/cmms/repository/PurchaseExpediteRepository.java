package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PurchaseExpediteRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PurchaseExpedite.class)
public interface PurchaseExpediteRepository extends DetachableJpaRepository<PurchaseExpedite, Long>, PurchaseExpediteRepositoryCustom {
}
