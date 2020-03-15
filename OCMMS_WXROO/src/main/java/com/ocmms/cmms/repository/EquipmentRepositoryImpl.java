package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;

/**
 * = EquipmentRepositoryImpl
 *
 * Implementation of EquipmentRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentRepositoryCustom.class)
public class EquipmentRepositoryImpl extends QueryDslRepositorySupportExt<Equipment> implements EquipmentRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentRepositoryImpl() {
        super(Equipment.class);
    }
}