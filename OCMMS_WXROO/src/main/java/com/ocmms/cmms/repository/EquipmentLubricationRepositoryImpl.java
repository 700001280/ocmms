package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;

/**
 * = EquipmentLubricationRepositoryImpl
 *
 * Implementation of EquipmentLubricationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentLubricationRepositoryCustom.class)
public class EquipmentLubricationRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentLubrication> implements EquipmentLubricationRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentLubricationRepositoryImpl() {
        super(EquipmentLubrication.class);
    }
}