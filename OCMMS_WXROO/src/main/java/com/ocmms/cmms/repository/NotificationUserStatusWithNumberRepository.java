package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = NotificationUserStatusWithNumberRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = NotificationUserStatusWithNumber.class)
public interface NotificationUserStatusWithNumberRepository extends DetachableJpaRepository<NotificationUserStatusWithNumber, Long>, NotificationUserStatusWithNumberRepositoryCustom {
}
