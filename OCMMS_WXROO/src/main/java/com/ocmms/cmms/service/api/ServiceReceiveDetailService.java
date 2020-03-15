package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ServiceReceiveDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ServiceReceiveDetail.class)
public interface ServiceReceiveDetailService extends EntityResolver<ServiceReceiveDetail, Long>, ValidatorService<ServiceReceiveDetail> {
}
