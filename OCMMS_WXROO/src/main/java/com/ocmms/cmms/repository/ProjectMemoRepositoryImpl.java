package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.system.ProjectMemo;

/**
 * = ProjectMemoRepositoryImpl
 *
 * Implementation of ProjectMemoRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProjectMemoRepositoryCustom.class)
public class ProjectMemoRepositoryImpl extends QueryDslRepositorySupportExt<ProjectMemo> implements ProjectMemoRepositoryCustom{

    /**
     * Default constructor
     */
    ProjectMemoRepositoryImpl() {
        super(ProjectMemo.class);
    }
}