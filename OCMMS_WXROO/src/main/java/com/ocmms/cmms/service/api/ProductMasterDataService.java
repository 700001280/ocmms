package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pp.configuration.ProductMasterData;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProductMasterDataService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ProductMasterData.class)
public interface ProductMasterDataService extends EntityResolver<ProductMasterData, Long>, ValidatorService<ProductMasterData> {
}
