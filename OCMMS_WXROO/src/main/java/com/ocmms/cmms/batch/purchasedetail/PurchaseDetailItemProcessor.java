package com.ocmms.cmms.batch.purchasedetail;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PurchaseDetailItemProcessor implements ItemProcessor<PurchaseDetail, PurchaseDetail> {

    private static final Logger log = LoggerFactory.getLogger(PurchaseDetailItemProcessor.class);

    @Override
    public PurchaseDetail process(final PurchaseDetail purchaseDetail) throws Exception {
    	   
    	purchaseDetail.setVersion(1L);
		purchaseDetail.setCreatedBy("Alex Qin");
		purchaseDetail.setCreatedDate(Calendar.getInstance());
		purchaseDetail.setLastModifiedBy("ALEX");
		purchaseDetail.setLastModifiedDate(Calendar.getInstance());	   
		log.info("processed purchaseDetail item {}", purchaseDetail.getId());
        return purchaseDetail;
    }

}