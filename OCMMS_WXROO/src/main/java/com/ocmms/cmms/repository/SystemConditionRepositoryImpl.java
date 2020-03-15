package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;

/**
 * = SystemConditionRepositoryImpl
 *
 * Implementation of SystemConditionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = SystemConditionRepositoryCustom.class)
public class SystemConditionRepositoryImpl extends QueryDslRepositorySupportExt<SystemCondition> implements SystemConditionRepositoryCustom{

    /**
     * Default constructor
     */
    SystemConditionRepositoryImpl() {
        super(SystemCondition.class);
    }
}