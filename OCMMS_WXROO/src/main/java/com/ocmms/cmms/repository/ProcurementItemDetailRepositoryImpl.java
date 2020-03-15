package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;

/**
 * = ProcurementItemDetailRepositoryImpl
 *
 * Implementation of ProcurementItemDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProcurementItemDetailRepositoryCustom.class)
public class ProcurementItemDetailRepositoryImpl extends QueryDslRepositorySupportExt<ProcurementItemDetail> implements ProcurementItemDetailRepositoryCustom{

    /**
     * Default constructor
     */
    ProcurementItemDetailRepositoryImpl() {
        super(ProcurementItemDetail.class);
    }
}