package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.storage.MovementType;

/**
 * = MovementTypeRepositoryImpl
 *
 * Implementation of MovementTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MovementTypeRepositoryCustom.class)
public class MovementTypeRepositoryImpl extends QueryDslRepositorySupportExt<MovementType> implements MovementTypeRepositoryCustom{

    /**
     * Default constructor
     */
    MovementTypeRepositoryImpl() {
        super(MovementType.class);
    }
}