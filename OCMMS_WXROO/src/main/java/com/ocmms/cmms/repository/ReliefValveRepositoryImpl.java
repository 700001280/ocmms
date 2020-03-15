package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;

/**
 * = ReliefValveRepositoryImpl
 *
 * Implementation of ReliefValveRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ReliefValveRepositoryCustom.class)
public class ReliefValveRepositoryImpl extends QueryDslRepositorySupportExt<ReliefValve> implements ReliefValveRepositoryCustom{

    /**
     * Default constructor
     */
    ReliefValveRepositoryImpl() {
        super(ReliefValve.class);
    }
}