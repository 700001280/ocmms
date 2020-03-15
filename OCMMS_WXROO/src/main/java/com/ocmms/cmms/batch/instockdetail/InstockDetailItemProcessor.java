package com.ocmms.cmms.batch.instockdetail;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class InstockDetailItemProcessor implements ItemProcessor<InstockDetail, InstockDetail> {

    private static final Logger log = LoggerFactory.getLogger(InstockDetailItemProcessor.class);

    @Override
    public InstockDetail process(final InstockDetail instockDetail) throws Exception {
    	   
    	instockDetail.setVersion(1L);
		instockDetail.setCreatedBy("Alex Qin");
		instockDetail.setCreatedDate(Calendar.getInstance());
		instockDetail.setLastModifiedBy("ALEX");
		instockDetail.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed instockDetail item {}", instockDetail.getId());
        return instockDetail;
    }

}