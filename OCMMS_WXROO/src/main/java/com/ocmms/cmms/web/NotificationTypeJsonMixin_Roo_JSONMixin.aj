// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.NotificationTypeJsonMixin;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import java.util.Set;

privileged aspect NotificationTypeJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<NotificationHeader> NotificationTypeJsonMixin.notificationHeaders;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus NotificationTypeJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<NotificationHeader> NotificationTypeJsonMixin.getNotificationHeaders() {
        return notificationHeaders;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationHeaders
     */
    public void NotificationTypeJsonMixin.setNotificationHeaders(Set<NotificationHeader> notificationHeaders) {
        this.notificationHeaders = notificationHeaders;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus NotificationTypeJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void NotificationTypeJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
}
