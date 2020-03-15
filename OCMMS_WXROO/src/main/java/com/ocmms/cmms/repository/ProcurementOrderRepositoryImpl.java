package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;

/**
 * = ProcurementOrderRepositoryImpl
 *
 * Implementation of ProcurementOrderRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProcurementOrderRepositoryCustom.class)
public class ProcurementOrderRepositoryImpl extends QueryDslRepositorySupportExt<ProcurementOrder> implements ProcurementOrderRepositoryCustom{

    /**
     * Default constructor
     */
    ProcurementOrderRepositoryImpl() {
        super(ProcurementOrder.class);
    }
}