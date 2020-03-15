package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentParameter;

/**
 * = EquipmentParameterRepositoryImpl
 *
 * Implementation of EquipmentParameterRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentParameterRepositoryCustom.class)
public class EquipmentParameterRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentParameter> implements EquipmentParameterRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentParameterRepositoryImpl() {
        super(EquipmentParameter.class);
    }
}