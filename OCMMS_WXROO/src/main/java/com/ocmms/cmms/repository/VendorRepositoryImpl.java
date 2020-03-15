package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.srm.Vendor;

/**
 * = VendorRepositoryImpl
 *
 * Implementation of VendorRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = VendorRepositoryCustom.class)
public class VendorRepositoryImpl extends QueryDslRepositorySupportExt<Vendor> implements VendorRepositoryCustom{

    /**
     * Default constructor
     */
    VendorRepositoryImpl() {
        super(Vendor.class);
    }
}