package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = NotificationUserStatusWithoutNumberRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = NotificationUserStatusWithoutNumber.class)
public interface NotificationUserStatusWithoutNumberRepository extends DetachableJpaRepository<NotificationUserStatusWithoutNumber, Long>, NotificationUserStatusWithoutNumberRepositoryCustom {
}
