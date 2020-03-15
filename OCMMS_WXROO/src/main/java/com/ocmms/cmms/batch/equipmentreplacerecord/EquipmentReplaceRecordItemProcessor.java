package com.ocmms.cmms.batch.equipmentreplacerecord;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class EquipmentReplaceRecordItemProcessor implements ItemProcessor<EquipmentReplaceRecord, EquipmentReplaceRecord> {

    private static final Logger log = LoggerFactory.getLogger(EquipmentReplaceRecordItemProcessor.class);

    @Override
    public EquipmentReplaceRecord process(final EquipmentReplaceRecord equipmentReplaceRecord) throws Exception {
    	   
    	equipmentReplaceRecord.setVersion(1L);
		equipmentReplaceRecord.setCreatedBy("Alex Qin");
		equipmentReplaceRecord.setCreatedDate(Calendar.getInstance());
		equipmentReplaceRecord.setLastModifiedBy("ALEX");
		equipmentReplaceRecord.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed equipmentReplaceRecord item {}", equipmentReplaceRecord.getId());
        return equipmentReplaceRecord;
    }

}