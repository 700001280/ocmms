package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.hrm.Client;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ClientService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Client.class)
public interface ClientService extends EntityResolver<Client, Long>, ValidatorService<Client> {
}
