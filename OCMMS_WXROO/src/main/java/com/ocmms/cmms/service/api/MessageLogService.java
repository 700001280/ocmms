package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.assistance.MessageLog;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MessageLogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MessageLog.class)
public interface MessageLogService extends EntityResolver<MessageLog, Long>, ValidatorService<MessageLog> {
}
