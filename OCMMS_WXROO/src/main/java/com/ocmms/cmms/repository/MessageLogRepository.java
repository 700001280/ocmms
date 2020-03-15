package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.assistance.MessageLog;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MessageLogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MessageLog.class)
public interface MessageLogRepository extends DetachableJpaRepository<MessageLog, Long>, MessageLogRepositoryCustom {
}
