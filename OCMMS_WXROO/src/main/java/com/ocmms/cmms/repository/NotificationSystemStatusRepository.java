package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = NotificationSystemStatusRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = NotificationSystemStatus.class)
public interface NotificationSystemStatusRepository extends DetachableJpaRepository<NotificationSystemStatus, Long>, NotificationSystemStatusRepositoryCustom {
}
