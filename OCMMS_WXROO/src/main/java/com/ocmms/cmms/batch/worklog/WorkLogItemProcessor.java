package com.ocmms.cmms.batch.worklog;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class WorkLogItemProcessor implements ItemProcessor<WorkLog, WorkLog> {

    private static final Logger log = LoggerFactory.getLogger(WorkLogItemProcessor.class);

    @Override
    public WorkLog process(final WorkLog workLog) throws Exception {
    	   
    	workLog.setVersion(1L);
		workLog.setCreatedBy("Alex Qin");
		workLog.setCreatedDate(Calendar.getInstance());
		workLog.setLastModifiedBy("ALEX");
		workLog.setLastModifiedDate(Calendar.getInstance());
		log.info("processed workLog item {}", workLog.getId());
        return workLog;
    }

}