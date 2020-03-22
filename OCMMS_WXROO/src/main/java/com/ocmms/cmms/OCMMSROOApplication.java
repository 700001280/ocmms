package com.ocmms.cmms;

//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ocmms.cmms.file.service.StorageProperties;

/**
 * = OCMMSROOApplication
 *
 * TODO Auto-generated class documentation
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling
//@EnableBatchProcessing
@EnableConfigurationProperties(StorageProperties.class)
public class OCMMSROOApplication {

    /**
     * TODO Auto-generated method documentation
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(OCMMSROOApplication.class, args);
    }
}