// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.system.TreeMenu;
import com.ocmms.cmms.service.api.TreeMenuService;
import com.ocmms.cmms.web.TreeMenusItemJsonController;
import io.springlets.web.NotFoundException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

privileged aspect TreeMenusItemJsonController_Roo_JSON {
    
    declare @type: TreeMenusItemJsonController: @RestController;
    
    declare @type: TreeMenusItemJsonController: @RequestMapping(value = "/api/treemenus/{treeMenu}", name = "TreeMenusItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TreeMenuService TreeMenusItemJsonController.treeMenuService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param treeMenuService
     */
    @Autowired
    public TreeMenusItemJsonController.new(TreeMenuService treeMenuService) {
        this.treeMenuService = treeMenuService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return TreeMenuService
     */
    public TreeMenuService TreeMenusItemJsonController.getTreeMenuService() {
        return treeMenuService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treeMenuService
     */
    public void TreeMenusItemJsonController.setTreeMenuService(TreeMenuService treeMenuService) {
        this.treeMenuService = treeMenuService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TreeMenu
     */
    @ModelAttribute
    public TreeMenu TreeMenusItemJsonController.getTreeMenu(@PathVariable("treeMenu") Long id) {
        TreeMenu treeMenu = treeMenuService.findOne(id);
        if (treeMenu == null) {
            throw new NotFoundException(String.format("TreeMenu with identifier '%s' not found",id));
        }
        return treeMenu;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treeMenu
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> TreeMenusItemJsonController.show(@ModelAttribute TreeMenu treeMenu) {
        return ResponseEntity.ok(treeMenu);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treeMenu
     * @return UriComponents
     */
    public static UriComponents TreeMenusItemJsonController.showURI(TreeMenu treeMenu) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(TreeMenusItemJsonController.class).show(treeMenu))
            .buildAndExpand(treeMenu.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedTreeMenu
     * @param treeMenu
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> TreeMenusItemJsonController.update(@ModelAttribute TreeMenu storedTreeMenu, @Valid @RequestBody TreeMenu treeMenu, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        treeMenu.setId(storedTreeMenu.getId());
        getTreeMenuService().save(treeMenu);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param treeMenu
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> TreeMenusItemJsonController.delete(@ModelAttribute TreeMenu treeMenu) {
        getTreeMenuService().delete(treeMenu);
        return ResponseEntity.ok().build();
    }
    
}
