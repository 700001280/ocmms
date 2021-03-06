// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.loto;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.loto.LotoDetail;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.util.Assert;

privileged aspect LotoInfo_Roo_Jpa_Entity {
    
    declare @type: LotoInfo: @Entity;
    
    declare @type: LotoInfo: @Table(name = "LOTO_LOTOINFO");
    
    declare @type: LotoInfo: @EntityFormat(message = "entity_format_message_loto_lotoinfo");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfo.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String LotoInfo.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoDetailsToAdd
     */
    public void LotoInfo.addToLotoDetails(Iterable<LotoDetail> lotoDetailsToAdd) {
        Assert.notNull(lotoDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (LotoDetail item : lotoDetailsToAdd) {
            this.lotoDetails.add(item);
            item.setLotoInfo(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoDetailsToRemove
     */
    public void LotoInfo.removeFromLotoDetails(Iterable<LotoDetail> lotoDetailsToRemove) {
        Assert.notNull(lotoDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (LotoDetail item : lotoDetailsToRemove) {
            this.lotoDetails.remove(item);
            item.setLotoInfo(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToAdd
     */
    public void LotoInfo.addToDocuments(Iterable<Document> documentsToAdd) {
        Assert.notNull(documentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToAdd) {
            this.documents.add(item);
            item.setLotoInfo(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentsToRemove
     */
    public void LotoInfo.removeFromDocuments(Iterable<Document> documentsToRemove) {
        Assert.notNull(documentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Document item : documentsToRemove) {
            this.documents.remove(item);
            item.setLotoInfo(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToAdd
     */
    public void LotoInfo.addToImages(Iterable<ImageDocument> imagesToAdd) {
        Assert.notNull(imagesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToAdd) {
            this.images.add(item);
            item.setLotoInfo(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imagesToRemove
     */
    public void LotoInfo.removeFromImages(Iterable<ImageDocument> imagesToRemove) {
        Assert.notNull(imagesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (ImageDocument item : imagesToRemove) {
            this.images.remove(item);
            item.setLotoInfo(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReportsToAdd
     */
    public void LotoInfo.addToLotoIssueReports(Iterable<LotoIssueReport> lotoIssueReportsToAdd) {
        Assert.notNull(lotoIssueReportsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (LotoIssueReport item : lotoIssueReportsToAdd) {
            this.lotoIssueReports.add(item);
            item.setLotoInfo(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReportsToRemove
     */
    public void LotoInfo.removeFromLotoIssueReports(Iterable<LotoIssueReport> lotoIssueReportsToRemove) {
        Assert.notNull(lotoIssueReportsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (LotoIssueReport item : lotoIssueReportsToRemove) {
            this.lotoIssueReports.remove(item);
            item.setLotoInfo(null);
        }
    }
    
}
