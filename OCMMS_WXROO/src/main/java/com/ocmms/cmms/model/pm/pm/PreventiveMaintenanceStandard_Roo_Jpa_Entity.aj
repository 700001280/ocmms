// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.pm;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.util.Assert;

privileged aspect PreventiveMaintenanceStandard_Roo_Jpa_Entity {
    
    declare @type: PreventiveMaintenanceStandard: @Entity;
    
    declare @type: PreventiveMaintenanceStandard: @Table(name = "PM_PM_PREVENTIVEMAINTENANCESTANDARD");
    
    declare @type: PreventiveMaintenanceStandard: @EntityFormat(message = "entity_format_message_pm_pm_preventivemaintenancestandard");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PreventiveMaintenanceStandard.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PreventiveMaintenanceStandard.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContentsToAdd
     */
    public void PreventiveMaintenanceStandard.addToPreventiveMaintenanceContents(Iterable<PreventiveMaintenanceContent> preventiveMaintenanceContentsToAdd) {
        Assert.notNull(preventiveMaintenanceContentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (PreventiveMaintenanceContent item : preventiveMaintenanceContentsToAdd) {
            this.preventiveMaintenanceContents.add(item);
            item.setPreventiveMaintenanceStandard(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContentsToRemove
     */
    public void PreventiveMaintenanceStandard.removeFromPreventiveMaintenanceContents(Iterable<PreventiveMaintenanceContent> preventiveMaintenanceContentsToRemove) {
        Assert.notNull(preventiveMaintenanceContentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (PreventiveMaintenanceContent item : preventiveMaintenanceContentsToRemove) {
            this.preventiveMaintenanceContents.remove(item);
            item.setPreventiveMaintenanceStandard(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToAdd
     */
    public void PreventiveMaintenanceStandard.addToDocuments(Iterable<Document> documentsToAdd) {
        Assert.notNull(documentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToAdd) {
            this.documents.add(item);
            item.setPreventiveMaintenanceStandard(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToRemove
     */
    public void PreventiveMaintenanceStandard.removeFromDocuments(Iterable<Document> documentsToRemove) {
        Assert.notNull(documentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToRemove) {
            this.documents.remove(item);
            item.setPreventiveMaintenanceStandard(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToAdd
     */
    public void PreventiveMaintenanceStandard.addToImages(Iterable<ImageDocument> imagesToAdd) {
        Assert.notNull(imagesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToAdd) {
            this.images.add(item);
            item.setPreventiveMaintenanceStandard(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToRemove
     */
    public void PreventiveMaintenanceStandard.removeFromImages(Iterable<ImageDocument> imagesToRemove) {
        Assert.notNull(imagesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToRemove) {
            this.images.remove(item);
            item.setPreventiveMaintenanceStandard(null);
        }
    }
    
}
