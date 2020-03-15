package com.ocmms.cmms.batch.tasktracking;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PushbackInputStream;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.batch.item.excel.support.rowset.DefaultRowSetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.InputStreamResource;

import com.ocmms.cmms.batch.listener.JobCompletionNotificationListener;
import com.ocmms.cmms.batch.servicematerialdetail.ServiceMaterialDetailItemProcessor;
import com.ocmms.cmms.batch.tasktracking.TaskTracking;
import com.ocmms.cmms.batch.tasktracking.TaskTrackingItemProcessor;
import com.ocmms.cmms.batch.tasktracking.TaskTrackingRowMapper;
import com.ocmms.cmms.file.service.StorageProperties;

@Configuration
public class TaskTrackingBatchConfiguration {
	 private static final Logger log = LoggerFactory.getLogger(TaskTrackingBatchConfiguration.class);

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public DataSource dataSource;	

	@Autowired
	public StorageProperties properties;
	
	
	@Bean
	@StepScope
	public PoiItemReader<TaskTracking> excelTaskTrackingReader() {
		PoiItemReader<TaskTracking> reader = new PoiItemReader<>();
		reader.setRowSetFactory(new DefaultRowSetFactory());
		reader.setLinesToSkip(1);
		PushbackInputStream input=null;
		try {
			input = new PushbackInputStream(new FileInputStream(properties.getLocation().concat("assistance_tasktracking.xlsx")));
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
	    InputStreamResource resource = new InputStreamResource(input);
	    reader.setResource(resource);		
		reader.setRowMapper(excelTaskTrackingRowMapper());
		return reader;
	}

	/**
	 * If your Excel document has no header, you have to create a custom row mapper
	 * and configure it here.
	 */
	private RowMapper<TaskTracking> excelTaskTrackingRowMapper() {
		return new TaskTrackingRowMapper();
	}

	@Bean
	public TaskTrackingItemProcessor taskTrackingProcessor() {
		return new TaskTrackingItemProcessor();
	}

	
	@Bean
	public JdbcBatchItemWriter<TaskTracking> taskTrackingWriter() {
		JdbcBatchItemWriter<TaskTracking> writer = new JdbcBatchItemWriter<TaskTracking>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<TaskTracking>());
		writer.setSql(													

				"INSERT INTO assistance_tasktracking (`id`,`assigndate`,`created_by`,`created_date`,`description`,`lastmodified_by`,`lastmodified_date`,`memo`,`completedate`,`reference`,`submitdate`,`targetdate`,`submitter`,`supportvendor`,`taskowner`,`version`,`tasktrackingpriority`,`tasktrackingstatus`,`tasktrackingtype`,`technicalobject`) VALUES "
				+ "(:id,:assigndate,:createdBy,:createdDate,:description,:lastModifiedBy,:lastModifiedDate,:memo,:completedate,:reference,:submitdate,:targetdate,:submitter,:supportvendor,:taskowner,:version,:tasktrackingpriority,:tasktrackingstatus,:tasktrackingtype,:technicalobject)");
		writer.setDataSource(dataSource);
		return writer;
	}

	

	@Bean
	public Job importTaskTrackingJob(JobCompletionNotificationListener listener) {		
			return jobBuilderFactory.get("importTaskTrackingJob").incrementer(new RunIdIncrementer())
					.listener(listener).flow(taskTrackingStep()).end().build();		
	}
	

	@Bean
	public Step taskTrackingStep() {
		return stepBuilderFactory.get("taskTrackingStep").<TaskTracking, TaskTracking>chunk(5)
				.reader(excelTaskTrackingReader()).processor(taskTrackingProcessor()).writer(taskTrackingWriter())
				.build();
	}
}