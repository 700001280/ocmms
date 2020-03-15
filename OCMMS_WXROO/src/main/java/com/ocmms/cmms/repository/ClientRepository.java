package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.hrm.Client;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ClientRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Client.class)
public interface ClientRepository extends DetachableJpaRepository<Client, Long>, ClientRepositoryCustom {
}
