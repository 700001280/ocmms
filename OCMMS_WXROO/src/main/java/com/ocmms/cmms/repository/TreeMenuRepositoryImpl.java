package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.system.TreeMenu;

/**
 * = TreeMenuRepositoryImpl
 *
 * Implementation of TreeMenuRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TreeMenuRepositoryCustom.class)
public class TreeMenuRepositoryImpl extends QueryDslRepositorySupportExt<TreeMenu> implements TreeMenuRepositoryCustom{

    /**
     * Default constructor
     */
    TreeMenuRepositoryImpl() {
        super(TreeMenu.class);
    }
}