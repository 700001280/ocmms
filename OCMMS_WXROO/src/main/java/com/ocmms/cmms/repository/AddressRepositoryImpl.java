package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.common.Address;

/**
 * = AddressRepositoryImpl
 *
 * Implementation of AddressRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AddressRepositoryCustom.class)
public class AddressRepositoryImpl extends QueryDslRepositorySupportExt<Address> implements AddressRepositoryCustom{

    /**
     * Default constructor
     */
    AddressRepositoryImpl() {
        super(Address.class);
    }
}