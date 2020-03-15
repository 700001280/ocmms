package com.ocmms.cmms.batch.worklog;


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
import com.ocmms.cmms.batch.servicematerialdetail.ServiceMaterialDetailBatchConfiguration;
import com.ocmms.cmms.file.service.StorageProperties;

@Configuration
public class WorkLogBatchConfiguration {

	private static final Logger log = LoggerFactory.getLogger(WorkLogBatchConfiguration.class);
	
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
	public PoiItemReader<WorkLog> excelWorkLogReader() {
		PoiItemReader<WorkLog> reader = new PoiItemReader<>();
		reader.setRowSetFactory(new DefaultRowSetFactory());
		reader.setLinesToSkip(1);
		PushbackInputStream input=null;
		try {
			input = new PushbackInputStream(new FileInputStream(properties.getLocation().concat("worklog.xlsx")));
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
	    InputStreamResource resource = new InputStreamResource(input);
	    reader.setResource(resource);		
		reader.setRowMapper(excelWorkLogRowMapper());
		return reader;
	}

	/**
	 * If your Excel document has no header, you have to create a custom row mapper
	 * and configure it here.
	 */
	private RowMapper<WorkLog> excelWorkLogRowMapper() {
		return new WorkLogRowMapper();
	}

	@Bean
	public WorkLogItemProcessor serviceMaterialDetailProcessor() {
		return new WorkLogItemProcessor();
	}

	
	@Bean
	public JdbcBatchItemWriter<WorkLog> serviceMaterialDetailWriter() {
		JdbcBatchItemWriter<WorkLog> writer = new JdbcBatchItemWriter<WorkLog>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<WorkLog>());
		writer.setSql(					

				"INSERT INTO assistance_worklog(`id`,`assign`,`created_by`,`created_date`,`description`,`lastmodified_by`,`lastmodified_date`,`logdate`,`remark`,`logger`,`version`,`worklogtype`) VALUES "
				+ "(:id,:assign,:createdBy,:createdDate,:description,:lastModifiedBy,:lastModifiedDate,:logdate,:remark,:logger,:version,:worklogtype)");
		writer.setDataSource(dataSource);
		return writer;
	}

	

	@Bean
	public Job importWorkLogJob(JobCompletionNotificationListener listener) {		
			return jobBuilderFactory.get("importWorkLogJob").incrementer(new RunIdIncrementer())
					.listener(listener).flow(serviceMaterialDetailStep()).end().build();		
	}
	

	@Bean
	public Step serviceMaterialDetailStep() {
		return stepBuilderFactory.get("serviceMaterialDetailStep").<WorkLog, WorkLog>chunk(5)
				.reader(excelWorkLogReader()).processor(serviceMaterialDetailProcessor()).writer(serviceMaterialDetailWriter())
				.build();
	}
}