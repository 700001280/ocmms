package com.ocmms.cmms.batch.partreplacerecord;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PartReplaceRecordItemProcessor implements ItemProcessor<PartReplaceRecord, PartReplaceRecord> {

    private static final Logger log = LoggerFactory.getLogger(PartReplaceRecordItemProcessor.class);

    @Override
    public PartReplaceRecord process(final PartReplaceRecord partReplaceRecord) throws Exception {
    	   
    	partReplaceRecord.setVersion(1L);
		partReplaceRecord.setCreatedBy("Alex Qin");
		partReplaceRecord.setCreatedDate(Calendar.getInstance());
		partReplaceRecord.setLastModifiedBy("ALEX");
		partReplaceRecord.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed partReplaceRecord item {}", partReplaceRecord.getId());
        return partReplaceRecord;
    }

}