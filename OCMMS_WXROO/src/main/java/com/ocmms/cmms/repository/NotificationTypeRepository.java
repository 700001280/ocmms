package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = NotificationTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = NotificationType.class)
public interface NotificationTypeRepository extends DetachableJpaRepository<NotificationType, Long>, NotificationTypeRepositoryCustom {
}
