package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = NotificationHeaderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = NotificationHeader.class)
public interface NotificationHeaderRepository extends DetachableJpaRepository<NotificationHeader, Long>, NotificationHeaderRepositoryCustom {
}
