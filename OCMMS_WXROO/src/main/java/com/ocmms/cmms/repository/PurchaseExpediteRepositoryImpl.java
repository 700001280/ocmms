package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;

/**
 * = PurchaseExpediteRepositoryImpl
 *
 * Implementation of PurchaseExpediteRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PurchaseExpediteRepositoryCustom.class)
public class PurchaseExpediteRepositoryImpl extends QueryDslRepositorySupportExt<PurchaseExpedite> implements PurchaseExpediteRepositoryCustom{

    /**
     * Default constructor
     */
    PurchaseExpediteRepositoryImpl() {
        super(PurchaseExpedite.class);
    }
}