package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.asset.AssetStatus;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AssetStatusService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = AssetStatus.class)
public interface AssetStatusService extends EntityResolver<AssetStatus, Long>, ValidatorService<AssetStatus> {
}
