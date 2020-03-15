package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.MaterialVendorInfo;

/**
 * = MaterialVendorInfoRepositoryImpl
 *
 * Implementation of MaterialVendorInfoRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialVendorInfoRepositoryCustom.class)
public class MaterialVendorInfoRepositoryImpl extends QueryDslRepositorySupportExt<MaterialVendorInfo> implements MaterialVendorInfoRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialVendorInfoRepositoryImpl() {
        super(MaterialVendorInfo.class);
    }
}