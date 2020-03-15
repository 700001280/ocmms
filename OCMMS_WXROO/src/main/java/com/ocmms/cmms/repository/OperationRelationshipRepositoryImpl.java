package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.OperationRelationship;

/**
 * = OperationRelationshipRepositoryImpl
 *
 * Implementation of OperationRelationshipRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = OperationRelationshipRepositoryCustom.class)
public class OperationRelationshipRepositoryImpl extends QueryDslRepositorySupportExt<OperationRelationship> implements OperationRelationshipRepositoryCustom{

    /**
     * Default constructor
     */
    OperationRelationshipRepositoryImpl() {
        super(OperationRelationship.class);
    }
}