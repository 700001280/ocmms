package com.ocmms.cmms.batch.materialoutstockdetail;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MaterialOutstockDetailItemProcessor implements ItemProcessor<MaterialOutstockDetail, MaterialOutstockDetail> {

    private static final Logger log = LoggerFactory.getLogger(MaterialOutstockDetailItemProcessor.class);

    @Override
    public MaterialOutstockDetail process(final MaterialOutstockDetail materialOutstockDetail) throws Exception {
    	   
    	materialOutstockDetail.setVersion(1L);
		materialOutstockDetail.setCreatedBy("Alex Qin");
		materialOutstockDetail.setCreatedDate(Calendar.getInstance());
		materialOutstockDetail.setLastModifiedBy("ALEX");
		materialOutstockDetail.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed materialOutstockDetail item {}", materialOutstockDetail.getId());
        return materialOutstockDetail;
    }

}