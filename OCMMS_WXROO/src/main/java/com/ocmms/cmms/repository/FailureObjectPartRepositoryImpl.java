package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.FailureObjectPart;

/**
 * = FailureObjectPartRepositoryImpl
 *
 * Implementation of FailureObjectPartRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = FailureObjectPartRepositoryCustom.class)
public class FailureObjectPartRepositoryImpl extends QueryDslRepositorySupportExt<FailureObjectPart> implements FailureObjectPartRepositoryCustom{

    /**
     * Default constructor
     */
    FailureObjectPartRepositoryImpl() {
        super(FailureObjectPart.class);
    }
}