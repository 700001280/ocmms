package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.system.TreeMenu;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TreeMenuService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = TreeMenu.class)
public interface TreeMenuService extends EntityResolver<TreeMenu, Long>, ValidatorService<TreeMenu> {
}
