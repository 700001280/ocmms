package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;

/**
 * = MaterialPlantInfoRepositoryImpl
 *
 * Implementation of MaterialPlantInfoRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialPlantInfoRepositoryCustom.class)
public class MaterialPlantInfoRepositoryImpl extends QueryDslRepositorySupportExt<MaterialPlantInfo> implements MaterialPlantInfoRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialPlantInfoRepositoryImpl() {
        super(MaterialPlantInfo.class);
    }
}