package com.ocmms.cmms.batch.materialoutstockdetail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Petri Kainulainen
 */
@Component
public class MaterialOutstockDetailJobLauncher {


    private static final Logger LOGGER = LoggerFactory.getLogger(MaterialOutstockDetailJobLauncher.class);

    private final Job job;

    private final JobLauncher jobLauncher;

    @Autowired
    MaterialOutstockDetailJobLauncher(@Qualifier("importMaterialOutstockDetailJob") Job job, JobLauncher jobLauncher) {
        this.job = job;
        this.jobLauncher = jobLauncher;
    }

    //@Scheduled(cron = "${excel.to.database.job.cron}")
   public void launchMaterialOutstockDetailJob() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        LOGGER.info("Starting excelFileToDatabase job");

        jobLauncher.run(job, newExecution());

        LOGGER.info("Stopping excelFileToDatabase job");
    }

    private JobParameters newExecution() {
        Map<String, JobParameter> parameters = new HashMap<>();

        JobParameter parameter = new JobParameter(new Date());
        parameters.put("currentTime", parameter);

        return new JobParameters(parameters);
    }
}
