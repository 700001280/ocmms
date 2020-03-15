package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.ocmms.cmms.service.api.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = WarehouseDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Warehouse.class)
public class WarehouseDeserializer extends JsonObjectDeserializer<Warehouse> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private WarehouseService warehouseService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param warehouseService
     * @param conversionService
     */
    @Autowired
    public WarehouseDeserializer(@Lazy WarehouseService warehouseService, ConversionService conversionService) {
        this.warehouseService = warehouseService;
        this.conversionService = conversionService;
    }
}
