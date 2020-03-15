package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;

/**
 * = ProcurementRequestRepositoryImpl
 *
 * Implementation of ProcurementRequestRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProcurementRequestRepositoryCustom.class)
public class ProcurementRequestRepositoryImpl extends QueryDslRepositorySupportExt<ProcurementRequest> implements ProcurementRequestRepositoryCustom{

    /**
     * Default constructor
     */
    ProcurementRequestRepositoryImpl() {
        super(ProcurementRequest.class);
    }
}