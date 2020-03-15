package com.ocmms.cmms.batch.equipmentmaintenancerecord;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class EquipmentMaintenanceRecordItemProcessor implements ItemProcessor<EquipmentMaintenanceRecord, EquipmentMaintenanceRecord> {

    private static final Logger log = LoggerFactory.getLogger(EquipmentMaintenanceRecordItemProcessor.class);

    @Override
    public EquipmentMaintenanceRecord process(final EquipmentMaintenanceRecord equipmentMaintenanceRecord) throws Exception {
    	   
    	equipmentMaintenanceRecord.setVersion(1L);
		equipmentMaintenanceRecord.setCreatedBy("Alex Qin");
		equipmentMaintenanceRecord.setCreatedDate(Calendar.getInstance());
		equipmentMaintenanceRecord.setLastModifiedBy("ALEX");
		equipmentMaintenanceRecord.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed equipmentMaintenanceRecord item {}", equipmentMaintenanceRecord.getId());
        return equipmentMaintenanceRecord;
    }

}