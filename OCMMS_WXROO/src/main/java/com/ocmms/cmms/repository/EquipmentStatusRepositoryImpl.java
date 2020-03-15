package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;

/**
 * = EquipmentStatusRepositoryImpl
 *
 * Implementation of EquipmentStatusRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentStatusRepositoryCustom.class)
public class EquipmentStatusRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentStatus> implements EquipmentStatusRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentStatusRepositoryImpl() {
        super(EquipmentStatus.class);
    }
}