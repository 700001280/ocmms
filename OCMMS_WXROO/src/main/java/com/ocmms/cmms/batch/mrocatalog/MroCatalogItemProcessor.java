package com.ocmms.cmms.batch.mrocatalog;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MroCatalogItemProcessor implements ItemProcessor<MroCatalog, MroCatalog> {

    private static final Logger log = LoggerFactory.getLogger(MroCatalogItemProcessor.class);

    @Override
    public MroCatalog process(final MroCatalog mroCatalog) throws Exception {
    	   
    	mroCatalog.setVersion(1L);
		mroCatalog.setCreatedBy("Alex Qin");
		mroCatalog.setCreatedDate(Calendar.getInstance());
		mroCatalog.setLastModifiedBy("ALEX");
		mroCatalog.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed mroCatalog item {}", mroCatalog.getId());
        return mroCatalog;
    }

}