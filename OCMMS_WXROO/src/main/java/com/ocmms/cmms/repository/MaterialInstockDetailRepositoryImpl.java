package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;

/**
 * = MaterialInstockDetailRepositoryImpl
 *
 * Implementation of MaterialInstockDetailRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialInstockDetailRepositoryCustom.class)
public class MaterialInstockDetailRepositoryImpl extends QueryDslRepositorySupportExt<MaterialInstockDetail> implements MaterialInstockDetailRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialInstockDetailRepositoryImpl() {
        super(MaterialInstockDetail.class);
    }
}