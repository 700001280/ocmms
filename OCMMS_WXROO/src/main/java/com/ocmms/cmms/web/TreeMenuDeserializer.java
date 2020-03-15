package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.TreeMenu;
import com.ocmms.cmms.service.api.TreeMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TreeMenuDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TreeMenu.class)
public class TreeMenuDeserializer extends JsonObjectDeserializer<TreeMenu> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TreeMenuService treeMenuService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param treeMenuService
     * @param conversionService
     */
    @Autowired
    public TreeMenuDeserializer(@Lazy TreeMenuService treeMenuService, ConversionService conversionService) {
        this.treeMenuService = treeMenuService;
        this.conversionService = conversionService;
    }
}
