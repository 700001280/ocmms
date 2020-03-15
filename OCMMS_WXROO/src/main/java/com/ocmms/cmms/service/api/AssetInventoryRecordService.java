package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AssetInventoryRecordService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = AssetInventoryRecord.class)
public interface AssetInventoryRecordService extends EntityResolver<AssetInventoryRecord, Long>, ValidatorService<AssetInventoryRecord> {
}
