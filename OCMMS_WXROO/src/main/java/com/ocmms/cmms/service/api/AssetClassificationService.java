package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.asset.AssetClassification;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AssetClassificationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = AssetClassification.class)
public interface AssetClassificationService extends EntityResolver<AssetClassification, Long>, ValidatorService<AssetClassification> {
}
