package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialDictionaryRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialDictionary.class)
public interface MaterialDictionaryRepository extends DetachableJpaRepository<MaterialDictionary, Long>, MaterialDictionaryRepositoryCustom {
}
