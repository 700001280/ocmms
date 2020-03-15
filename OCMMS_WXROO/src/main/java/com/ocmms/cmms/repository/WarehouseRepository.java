package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WarehouseRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Warehouse.class)
public interface WarehouseRepository extends DetachableJpaRepository<Warehouse, Long>, WarehouseRepositoryCustom {
}
