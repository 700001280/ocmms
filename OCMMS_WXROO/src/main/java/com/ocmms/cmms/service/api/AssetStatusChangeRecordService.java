package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AssetStatusChangeRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = AssetStatusChangeRecord.class)
public interface AssetStatusChangeRecordService extends EntityResolver<AssetStatusChangeRecord, Long>, ValidatorService<AssetStatusChangeRecord> {
}
