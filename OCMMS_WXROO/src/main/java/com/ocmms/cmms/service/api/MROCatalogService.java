package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.MROCatalog;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MROCatalogService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MROCatalog.class)
public interface MROCatalogService extends EntityResolver<MROCatalog, Long>, ValidatorService<MROCatalog> {
}
