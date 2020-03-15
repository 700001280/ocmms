package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.MaterialDiscipline;

/**
 * = MaterialDisciplineRepositoryImpl
 *
 * Implementation of MaterialDisciplineRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialDisciplineRepositoryCustom.class)
public class MaterialDisciplineRepositoryImpl extends QueryDslRepositorySupportExt<MaterialDiscipline> implements MaterialDisciplineRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialDisciplineRepositoryImpl() {
        super(MaterialDiscipline.class);
    }
}