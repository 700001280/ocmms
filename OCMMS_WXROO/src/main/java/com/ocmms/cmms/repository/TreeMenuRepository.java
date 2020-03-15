package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.system.TreeMenu;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TreeMenuRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TreeMenu.class)
public interface TreeMenuRepository extends DetachableJpaRepository<TreeMenu, Long>, TreeMenuRepositoryCustom {
}
