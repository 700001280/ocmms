package com.ocmms.cmms.batch.partmaintenancerecord;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PartMaintenanceRecordItemProcessor implements ItemProcessor<PartMaintenanceRecord, PartMaintenanceRecord> {

    private static final Logger log = LoggerFactory.getLogger(PartMaintenanceRecordItemProcessor.class);

    @Override
    public PartMaintenanceRecord process(final PartMaintenanceRecord partMaintenanceRecord) throws Exception {
    	   
    	partMaintenanceRecord.setVersion(1L);
		partMaintenanceRecord.setCreatedBy("Alex Qin");
		partMaintenanceRecord.setCreatedDate(Calendar.getInstance());
		partMaintenanceRecord.setLastModifiedBy("ALEX");
		partMaintenanceRecord.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed partMaintenanceRecord item {}", partMaintenanceRecord.getId());
        return partMaintenanceRecord;
    }

}