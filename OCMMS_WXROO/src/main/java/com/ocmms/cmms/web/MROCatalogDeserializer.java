package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MROCatalog;
import com.ocmms.cmms.service.api.MROCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MROCatalogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MROCatalog.class)
public class MROCatalogDeserializer extends JsonObjectDeserializer<MROCatalog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MROCatalogService mROCatalogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param mROCatalogService
     * @param conversionService
     */
    @Autowired
    public MROCatalogDeserializer(@Lazy MROCatalogService mROCatalogService, ConversionService conversionService) {
        this.mROCatalogService = mROCatalogService;
        this.conversionService = conversionService;
    }
}
