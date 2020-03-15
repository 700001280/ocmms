package com.ocmms.cmms.batch.partmaintenancerecord;


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
import com.ocmms.cmms.batch.partmaintenancerecord.PartMaintenanceRecord;
import com.ocmms.cmms.batch.partmaintenancerecord.PartMaintenanceRecordItemProcessor;
import com.ocmms.cmms.batch.partmaintenancerecord.PartMaintenanceRecordRowMapper;
import com.ocmms.cmms.file.service.StorageProperties;

@Configuration
public class PartMaintenanceRecordBatchConfiguration {
	private static final Logger log = LoggerFactory.getLogger(PartMaintenanceRecordBatchConfiguration.class);


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
	public PoiItemReader<PartMaintenanceRecord> excelPartMaintenanceRecordReader() {
		PoiItemReader<PartMaintenanceRecord> reader = new PoiItemReader<>();
		reader.setRowSetFactory(new DefaultRowSetFactory());
		reader.setLinesToSkip(1);
		PushbackInputStream input=null;
		try {
			input = new PushbackInputStream(new FileInputStream(properties.getLocation().concat("partmaintenancerecord.xlsx")));
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
	    InputStreamResource resource = new InputStreamResource(input);
	    reader.setResource(resource);		
		reader.setRowMapper(excelPartMaintenanceRecordRowMapper());
		return reader;
	}

	/**
	 * If your Excel document has no header, you have to create a custom row mapper
	 * and configure it here.
	 */
	private RowMapper<PartMaintenanceRecord> excelPartMaintenanceRecordRowMapper() {
		return new PartMaintenanceRecordRowMapper();
	}

	@Bean
	public PartMaintenanceRecordItemProcessor partMaintenanceRecordProcessor() {
		return new PartMaintenanceRecordItemProcessor();
	}

	
	@Bean
	public JdbcBatchItemWriter<PartMaintenanceRecord> partMaintenanceRecordWriter() {
		JdbcBatchItemWriter<PartMaintenanceRecord> writer = new JdbcBatchItemWriter<PartMaintenanceRecord>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<PartMaintenanceRecord>());
		writer.setSql(
				"INSERT INTO pm_routine_partmaintenancerecord (`dtype`,`id`,`closed`,`created_by`,`created_date`,`description`,`lastmodified_by`,`lastmodified_date`,`memo`,`podate`,`ponumber`,`purchaserequestdate`,`purchaserequestno`,`quantity`,`submitdate`,`unitprice`,`version`,`workorderdate`,`workorderno`,`deliverdate`,`catalogtype`,`currencyunit`,`prioritytype`,`requester`,`supplier`,`materialcatalog`,`organization`,`workordermaterial`) VALUES (:dtype,:id,:closed,:createdBy,:createdDate,:description,:lastModifiedBy,:lastModifiedDate,:memo,:poDate,:poNumber,:purchaseRequestDate,:purchaseRequestNo,:quantity,:submitDate,:unitPrice,:version,:workOrderDate,:workOrderNo,:deliverDate,:catalogType,:currencyUnit,:priorityType,:requester,:supplier,:materialCatalog,:organization,:workorderMaterial)");
		writer.setDataSource(dataSource);
		return writer;
	}

	

	@Bean
	public Job importPartMaintenanceRecordJob(JobCompletionNotificationListener listener) {		
			return jobBuilderFactory.get("importPartMaintenanceRecordJob").incrementer(new RunIdIncrementer())
					.listener(listener).flow(partMaintenanceRecordStep()).end().build();		
	}
	

	@Bean
	public Step partMaintenanceRecordStep() {
		return stepBuilderFactory.get("partMaintenanceRecordStep").<PartMaintenanceRecord, PartMaintenanceRecord>chunk(5)
				.reader(excelPartMaintenanceRecordReader()).processor(partMaintenanceRecordProcessor()).writer(partMaintenanceRecordWriter())
				.build();
	}
}