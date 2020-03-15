package com.ocmms.cmms.batch.equipmentreplacerecord;


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
import com.ocmms.cmms.batch.equipmentreplacerecord.EquipmentReplaceRecord;
import com.ocmms.cmms.batch.equipmentreplacerecord.EquipmentReplaceRecordItemProcessor;
import com.ocmms.cmms.batch.equipmentreplacerecord.EquipmentReplaceRecordRowMapper;
import com.ocmms.cmms.file.service.StorageProperties;

@Configuration
public class EquipmentReplaceRecordBatchConfiguration {
	private static final Logger log = LoggerFactory.getLogger(EquipmentReplaceRecordBatchConfiguration.class);


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
	public PoiItemReader<EquipmentReplaceRecord> excelEquipmentReplaceRecordReader() {
		PoiItemReader<EquipmentReplaceRecord> reader = new PoiItemReader<>();
		reader.setRowSetFactory(new DefaultRowSetFactory());
		reader.setLinesToSkip(1);
		PushbackInputStream input=null;
		try {
			input = new PushbackInputStream(new FileInputStream(properties.getLocation().concat("equipmentreplacerecord.xlsx")));
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
	    InputStreamResource resource = new InputStreamResource(input);
	    reader.setResource(resource);		
		reader.setRowMapper(excelEquipmentReplaceRecordRowMapper());
		return reader;
	}

	/**
	 * If your Excel document has no header, you have to create a custom row mapper
	 * and configure it here.
	 */
	private RowMapper<EquipmentReplaceRecord> excelEquipmentReplaceRecordRowMapper() {
		return new EquipmentReplaceRecordRowMapper();
	}

	@Bean
	public EquipmentReplaceRecordItemProcessor equipmentReplaceRecordProcessor() {
		return new EquipmentReplaceRecordItemProcessor();
	}

	
	@Bean
	public JdbcBatchItemWriter<EquipmentReplaceRecord> equipmentReplaceRecordWriter() {
		JdbcBatchItemWriter<EquipmentReplaceRecord> writer = new JdbcBatchItemWriter<EquipmentReplaceRecord>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<EquipmentReplaceRecord>());
		writer.setSql(
				"INSERT INTO mm_procurement_equipmentreplacerecord (`dtype`,`id`,`closed`,`created_by`,`created_date`,`description`,`lastmodified_by`,`lastmodified_date`,`memo`,`podate`,`ponumber`,`purchaserequestdate`,`purchaserequestno`,`quantity`,`submitdate`,`unitprice`,`version`,`workorderdate`,`workorderno`,`deliverdate`,`catalogtype`,`currencyunit`,`prioritytype`,`requester`,`supplier`,`materialcatalog`,`organization`,`workordermaterial`) VALUES (:dtype,:id,:closed,:createdBy,:createdDate,:description,:lastModifiedBy,:lastModifiedDate,:memo,:poDate,:poNumber,:purchaseRequestDate,:purchaseRequestNo,:quantity,:submitDate,:unitPrice,:version,:workOrderDate,:workOrderNo,:deliverDate,:catalogType,:currencyUnit,:priorityType,:requester,:supplier,:materialCatalog,:organization,:workorderMaterial)");
		writer.setDataSource(dataSource);
		return writer;
	}

	

	@Bean
	public Job importEquipmentReplaceRecordJob(JobCompletionNotificationListener listener) {		
			return jobBuilderFactory.get("importEquipmentReplaceRecordJob").incrementer(new RunIdIncrementer())
					.listener(listener).flow(equipmentReplaceRecordStep()).end().build();		
	}
	

	@Bean
	public Step equipmentReplaceRecordStep() {
		return stepBuilderFactory.get("equipmentReplaceRecordStep").<EquipmentReplaceRecord, EquipmentReplaceRecord>chunk(5)
				.reader(excelEquipmentReplaceRecordReader()).processor(equipmentReplaceRecordProcessor()).writer(equipmentReplaceRecordWriter())
				.build();
	}
}