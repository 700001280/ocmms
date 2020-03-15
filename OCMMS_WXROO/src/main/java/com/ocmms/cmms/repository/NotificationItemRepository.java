package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.NotificationItem;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = NotificationItemRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = NotificationItem.class)
public interface NotificationItemRepository extends DetachableJpaRepository<NotificationItem, Long>, NotificationItemRepositoryCustom {
}
