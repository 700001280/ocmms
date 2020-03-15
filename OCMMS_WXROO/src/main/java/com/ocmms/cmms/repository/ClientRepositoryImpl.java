package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.hrm.Client;

/**
 * = ClientRepositoryImpl
 *
 * Implementation of ClientRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ClientRepositoryCustom.class)
public class ClientRepositoryImpl extends QueryDslRepositorySupportExt<Client> implements ClientRepositoryCustom{

    /**
     * Default constructor
     */
    ClientRepositoryImpl() {
        super(Client.class);
    }
}