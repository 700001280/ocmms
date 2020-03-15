package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.common.Address;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AddressRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Address.class)
public interface AddressRepository extends DetachableJpaRepository<Address, Long>, AddressRepositoryCustom {
}
