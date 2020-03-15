package com.ocmms.cmms.batch.instockdetail;


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
import com.ocmms.cmms.batch.instockdetail.InstockDetail;
import com.ocmms.cmms.batch.instockdetail.InstockDetailItemProcessor;
import com.ocmms.cmms.batch.instockdetail.InstockDetailRowMapper;
import com.ocmms.cmms.file.service.StorageProperties;

@Configuration
public class InstockDetailBatchConfiguration {
	private static final Logger log = LoggerFactory.getLogger(InstockDetailBatchConfiguration.class);


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
	public PoiItemReader<InstockDetail> excelInstockDetailReader() {
		PoiItemReader<InstockDetail> reader = new PoiItemReader<>();
		reader.setRowSetFactory(new DefaultRowSetFactory());
		reader.setLinesToSkip(1);
		PushbackInputStream input=null;
		try {
			input = new PushbackInputStream(new FileInputStream(properties.getLocation().concat("instockdetail.xlsx")));
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
	    InputStreamResource resource = new InputStreamResource(input);
	    reader.setResource(resource);		
		reader.setRowMapper(excelInstockDetailRowMapper());
		return reader;
	}

	/**
	 * If your Excel document has no header, you have to create a custom row mapper
	 * and configure it here.
	 */
	private RowMapper<InstockDetail> excelInstockDetailRowMapper() {
		return new InstockDetailRowMapper();
	}

	@Bean
	public InstockDetailItemProcessor instockDetailProcessor() {
		return new InstockDetailItemProcessor();
	}

	
	@Bean
	public JdbcBatchItemWriter<InstockDetail> instockDetailWriter() {
		JdbcBatchItemWriter<InstockDetail> writer = new JdbcBatchItemWriter<InstockDetail>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<InstockDetail>());
		writer.setSql(
				"INSERT INTO mm_procurement_instockdetail (`dtype`,`id`,`closed`,`created_by`,`created_date`,`description`,`lastmodified_by`,`lastmodified_date`,`memo`,`podate`,`ponumber`,`purchaserequestdate`,`purchaserequestno`,`quantity`,`submitdate`,`unitprice`,`version`,`workorderdate`,`workorderno`,`deliverdate`,`catalogtype`,`currencyunit`,`prioritytype`,`requester`,`supplier`,`materialcatalog`,`organization`,`workordermaterial`) VALUES (:dtype,:id,:closed,:createdBy,:createdDate,:description,:lastModifiedBy,:lastModifiedDate,:memo,:poDate,:poNumber,:purchaseRequestDate,:purchaseRequestNo,:quantity,:submitDate,:unitPrice,:version,:workOrderDate,:workOrderNo,:deliverDate,:catalogType,:currencyUnit,:priorityType,:requester,:supplier,:materialCatalog,:organization,:workorderMaterial)");
		writer.setDataSource(dataSource);
		return writer;
	}

	

	@Bean
	public Job importInstockDetailJob(JobCompletionNotificationListener listener) {		
			return jobBuilderFactory.get("importInstockDetailJob").incrementer(new RunIdIncrementer())
					.listener(listener).flow(instockDetailStep()).end().build();		
	}
	

	@Bean
	public Step instockDetailStep() {
		return stepBuilderFactory.get("instockDetailStep").<InstockDetail, InstockDetail>chunk(5)
				.reader(excelInstockDetailReader()).processor(instockDetailProcessor()).writer(instockDetailWriter())
				.build();
	}
}