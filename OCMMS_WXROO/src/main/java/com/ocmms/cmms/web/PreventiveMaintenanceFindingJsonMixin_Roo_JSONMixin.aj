// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.web.PreventiveMaintenanceFindingJsonMixin;
import java.util.Set;

privileged aspect PreventiveMaintenanceFindingJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> PreventiveMaintenanceFindingJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> PreventiveMaintenanceFindingJsonMixin.images;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> PreventiveMaintenanceFindingJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void PreventiveMaintenanceFindingJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> PreventiveMaintenanceFindingJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void PreventiveMaintenanceFindingJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
}
