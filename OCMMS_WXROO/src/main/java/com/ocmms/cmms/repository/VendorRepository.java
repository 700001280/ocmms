package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.srm.Vendor;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = VendorRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Vendor.class)
public interface VendorRepository extends DetachableJpaRepository<Vendor, Long>, VendorRepositoryCustom {
}
