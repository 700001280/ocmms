package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.hrm.Department;

/**
 * = DepartmentRepositoryImpl
 *
 * Implementation of DepartmentRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = DepartmentRepositoryCustom.class)
public class DepartmentRepositoryImpl extends QueryDslRepositorySupportExt<Department> implements DepartmentRepositoryCustom{

    /**
     * Default constructor
     */
    DepartmentRepositoryImpl() {
        super(Department.class);
    }
}