package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.common.Currency;

/**
 * = CurrencyRepositoryImpl
 *
 * Implementation of CurrencyRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CurrencyRepositoryCustom.class)
public class CurrencyRepositoryImpl extends QueryDslRepositorySupportExt<Currency> implements CurrencyRepositoryCustom{

    /**
     * Default constructor
     */
    CurrencyRepositoryImpl() {
        super(Currency.class);
    }
}