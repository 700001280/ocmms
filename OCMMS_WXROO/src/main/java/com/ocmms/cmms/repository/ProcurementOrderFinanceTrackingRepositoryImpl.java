package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;

/**
 * = ProcurementOrderFinanceTrackingRepositoryImpl
 *
 * Implementation of ProcurementOrderFinanceTrackingRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProcurementOrderFinanceTrackingRepositoryCustom.class)
public class ProcurementOrderFinanceTrackingRepositoryImpl extends QueryDslRepositorySupportExt<ProcurementOrderFinanceTracking> implements ProcurementOrderFinanceTrackingRepositoryCustom{

    /**
     * Default constructor
     */
    ProcurementOrderFinanceTrackingRepositoryImpl() {
        super(ProcurementOrderFinanceTracking.class);
    }
}