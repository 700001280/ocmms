// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.assistance;

import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.util.Assert;

privileged aspect TaskTracking_Roo_Jpa_Entity {
    
    declare @type: TaskTracking: @Entity;
    
    declare @type: TaskTracking: @Table(name = "ASSISTANCE_TASKTRACKING");
    
    declare @type: TaskTracking: @EntityFormat(message = "entity_format_message_assistance_tasktracking");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTracking.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String TaskTracking.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToAdd
     */
    public void TaskTracking.addToDocuments(Iterable<Document> documentsToAdd) {
        Assert.notNull(documentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToAdd) {
            this.documents.add(item);
            item.setTaskTracking(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToRemove
     */
    public void TaskTracking.removeFromDocuments(Iterable<Document> documentsToRemove) {
        Assert.notNull(documentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToRemove) {
            this.documents.remove(item);
            item.setTaskTracking(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToAdd
     */
    public void TaskTracking.addToImages(Iterable<ImageDocument> imagesToAdd) {
        Assert.notNull(imagesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToAdd) {
            this.images.add(item);
            item.setTaskTracking(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToRemove
     */
    public void TaskTracking.removeFromImages(Iterable<ImageDocument> imagesToRemove) {
        Assert.notNull(imagesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToRemove) {
            this.images.remove(item);
            item.setTaskTracking(null);
        }
    }
    
}
