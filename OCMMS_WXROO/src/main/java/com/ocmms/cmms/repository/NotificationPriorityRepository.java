package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = NotificationPriorityRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = NotificationPriority.class)
public interface NotificationPriorityRepository extends DetachableJpaRepository<NotificationPriority, Long>, NotificationPriorityRepositoryCustom {
}
