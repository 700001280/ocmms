package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.mm.master.MROCatalog;

/**
 * = MROCatalogRepositoryImpl
 *
 * Implementation of MROCatalogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MROCatalogRepositoryCustom.class)
public class MROCatalogRepositoryImpl extends QueryDslRepositorySupportExt<MROCatalog> implements MROCatalogRepositoryCustom{

    /**
     * Default constructor
     */
    MROCatalogRepositoryImpl() {
        super(MROCatalog.class);
    }
}