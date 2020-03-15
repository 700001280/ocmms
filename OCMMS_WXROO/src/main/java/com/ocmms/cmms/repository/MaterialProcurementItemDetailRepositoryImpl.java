package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;

/**
 * = MaterialProcurementItemDetailRepositoryImpl
 *
 * Implementation of MaterialProcurementItemDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialProcurementItemDetailRepositoryCustom.class)
public class MaterialProcurementItemDetailRepositoryImpl extends QueryDslRepositorySupportExt<MaterialProcurementItemDetail> implements MaterialProcurementItemDetailRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialProcurementItemDetailRepositoryImpl() {
        super(MaterialProcurementItemDetail.class);
    }
}