// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.technicalobject;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentParameter;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.util.Assert;

privileged aspect EquipmentParameter_Roo_Jpa_Entity {
    
    declare @type: EquipmentParameter: @Entity;
    
    declare @type: EquipmentParameter: @Table(name = "PM_TECHNICALOBJECT_EQUIPMENTPARAMETER");
    
    declare @type: EquipmentParameter: @EntityFormat(message = "entity_format_message_pm_technicalobject_equipmentparameter");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentParameter.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String EquipmentParameter.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToAdd
     */
    public void EquipmentParameter.addToDocuments(Iterable<Document> documentsToAdd) {
        Assert.notNull(documentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToAdd) {
            this.documents.add(item);
            item.setEquipmentParameter(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToRemove
     */
    public void EquipmentParameter.removeFromDocuments(Iterable<Document> documentsToRemove) {
        Assert.notNull(documentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToRemove) {
            this.documents.remove(item);
            item.setEquipmentParameter(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToAdd
     */
    public void EquipmentParameter.addToImages(Iterable<ImageDocument> imagesToAdd) {
        Assert.notNull(imagesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToAdd) {
            this.images.add(item);
            item.setEquipmentParameter(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToRemove
     */
    public void EquipmentParameter.removeFromImages(Iterable<ImageDocument> imagesToRemove) {
        Assert.notNull(imagesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToRemove) {
            this.images.remove(item);
            item.setEquipmentParameter(null);
        }
    }
    
}
