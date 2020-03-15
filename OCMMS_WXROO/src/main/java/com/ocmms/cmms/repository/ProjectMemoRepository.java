package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.system.ProjectMemo;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProjectMemoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ProjectMemo.class)
public interface ProjectMemoRepository extends DetachableJpaRepository<ProjectMemo, Long>, ProjectMemoRepositoryCustom {
}
