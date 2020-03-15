package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.procurement.PriorityType;

/**
 * = PriorityTypeRepositoryImpl
 *
 * Implementation of PriorityTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PriorityTypeRepositoryCustom.class)
public class PriorityTypeRepositoryImpl extends QueryDslRepositorySupportExt<PriorityType> implements PriorityTypeRepositoryCustom{

    /**
     * Default constructor
     */
    PriorityTypeRepositoryImpl() {
        super(PriorityType.class);
    }
}