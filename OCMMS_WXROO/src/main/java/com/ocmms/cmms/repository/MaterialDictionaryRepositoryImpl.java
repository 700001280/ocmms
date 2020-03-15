package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;

/**
 * = MaterialDictionaryRepositoryImpl
 *
 * Implementation of MaterialDictionaryRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MaterialDictionaryRepositoryCustom.class)
public class MaterialDictionaryRepositoryImpl extends QueryDslRepositorySupportExt<MaterialDictionary> implements MaterialDictionaryRepositoryCustom{

    /**
     * Default constructor
     */
    MaterialDictionaryRepositoryImpl() {
        super(MaterialDictionary.class);
    }
}