package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.loto.IsolationMethod;

/**
 * = IsolationMethodRepositoryImpl
 *
 * Implementation of IsolationMethodRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = IsolationMethodRepositoryCustom.class)
public class IsolationMethodRepositoryImpl extends QueryDslRepositorySupportExt<IsolationMethod> implements IsolationMethodRepositoryCustom{

    /**
     * Default constructor
     */
    IsolationMethodRepositoryImpl() {
        super(IsolationMethod.class);
    }
}