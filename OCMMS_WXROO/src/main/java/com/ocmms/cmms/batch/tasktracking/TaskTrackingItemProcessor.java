package com.ocmms.cmms.batch.tasktracking;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class TaskTrackingItemProcessor implements ItemProcessor<TaskTracking, TaskTracking> {

    private static final Logger log = LoggerFactory.getLogger(TaskTrackingItemProcessor.class);

    @Override
    public TaskTracking process(final TaskTracking tasktracking) throws Exception {
    	   
    	tasktracking.setVersion(1L);
		tasktracking.setCreatedBy("Alex Qin");
		tasktracking.setCreatedDate(Calendar.getInstance());
		tasktracking.setLastModifiedBy("ALEX");
		tasktracking.setLastModifiedDate(Calendar.getInstance());	    
		log.info("processed TaskTracking item {}", tasktracking.getId());
        return tasktracking;
    }

}