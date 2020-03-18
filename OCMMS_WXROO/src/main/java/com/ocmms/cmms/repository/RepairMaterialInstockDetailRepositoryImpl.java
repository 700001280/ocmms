package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;

/**
 * = RepairMaterialInstockDetailRepositoryImpl
 *
 * Implementation of RepairMaterialInstockDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = RepairMaterialInstockDetailRepositoryCustom.class)
public class RepairMaterialInstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<RepairMaterialInstockDetail> implements RepairMaterialInstockDetailRepositoryCustom{

    /**
     * Default constructor
     */
    RepairMaterialInstockDetailRepositoryImpl() {
        super(RepairMaterialInstockDetail.class);
    }
}