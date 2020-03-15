package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;

/**
 * = EquipmentCategoryRepositoryImpl
 *
 * Implementation of EquipmentCategoryRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = EquipmentCategoryRepositoryCustom.class)
public class EquipmentCategoryRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentCategory> implements EquipmentCategoryRepositoryCustom{

    /**
     * Default constructor
     */
    EquipmentCategoryRepositoryImpl() {
        super(EquipmentCategory.class);
    }
}