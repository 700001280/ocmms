package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;

/**
 * = BillOfMaterialRepositoryImpl
 *
 * Implementation of BillOfMaterialRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = BillOfMaterialRepositoryCustom.class)
public class BillOfMaterialRepositoryImpl extends QueryDslRepositorySupportExt<BillOfMaterial> implements BillOfMaterialRepositoryCustom{

    /**
     * Default constructor
     */
    BillOfMaterialRepositoryImpl() {
        super(BillOfMaterial.class);
    }
}