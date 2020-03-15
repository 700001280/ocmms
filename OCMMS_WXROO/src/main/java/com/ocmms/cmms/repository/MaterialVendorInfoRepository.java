package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.MaterialVendorInfo;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialVendorInfoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialVendorInfo.class)
public interface MaterialVendorInfoRepository extends DetachableJpaRepository<MaterialVendorInfo, Long>, MaterialVendorInfoRepositoryCustom {
}
