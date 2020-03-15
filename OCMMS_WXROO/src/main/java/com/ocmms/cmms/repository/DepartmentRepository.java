package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.hrm.Department;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = DepartmentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Department.class)
public interface DepartmentRepository extends DetachableJpaRepository<Department, Long>, DepartmentRepositoryCustom {
}
