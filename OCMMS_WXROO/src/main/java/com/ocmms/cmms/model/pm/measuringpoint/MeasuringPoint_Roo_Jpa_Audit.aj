// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.measuringpoint;

import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import javax.persistence.EntityListeners;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

privileged aspect MeasuringPoint_Roo_Jpa_Audit {
    
    declare @type: MeasuringPoint: @EntityListeners(AuditingEntityListener.class);
    
}
