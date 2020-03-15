package com.ocmms.cmms.batch.servicematerialdetail;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class ServiceMaterialDetailItemProcessor implements ItemProcessor<ServiceMaterialDetail, ServiceMaterialDetail> {

    private static final Logger log = LoggerFactory.getLogger(ServiceMaterialDetailItemProcessor.class);

    @Override
    public ServiceMaterialDetail process(final ServiceMaterialDetail serviceMaterialDetail) throws Exception {
    	   
    	serviceMaterialDetail.setVersion(1L);
		serviceMaterialDetail.setCreatedBy("Alex Qin");
		serviceMaterialDetail.setCreatedDate(Calendar.getInstance());
		serviceMaterialDetail.setLastModifiedBy("ALEX");
		serviceMaterialDetail.setLastModifiedDate(Calendar.getInstance());	    
		serviceMaterialDetail.setDtype("ServiceMaterialDetail");
		log.info("processed ServiceMaterialDetail item {}", serviceMaterialDetail.getId());
        return serviceMaterialDetail;
    }

}