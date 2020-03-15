package com.ocmms.cmms.batch.materialoutstockdetail;


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
import com.ocmms.cmms.batch.materialoutstockdetail.MaterialOutstockDetail;
import com.ocmms.cmms.batch.materialoutstockdetail.MaterialOutstockDetailItemProcessor;
import com.ocmms.cmms.batch.materialoutstockdetail.MaterialOutstockDetailRowMapper;
import com.ocmms.cmms.file.service.StorageProperties;

@Configuration
public class MaterialOutstockDetailBatchConfiguration {
	private static final Logger log = LoggerFactory.getLogger(MaterialOutstockDetailBatchConfiguration.class);


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
	public PoiItemReader<MaterialOutstockDetail> excelMaterialOutstockDetailReader() {
		PoiItemReader<MaterialOutstockDetail> reader = new PoiItemReader<>();
		reader.setRowSetFactory(new DefaultRowSetFactory());
		reader.setLinesToSkip(1);
		PushbackInputStream input=null;
		try {
			input = new PushbackInputStream(new FileInputStream(properties.getLocation().concat("materialoutstockdetail.xlsx")));
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
	    InputStreamResource resource = new InputStreamResource(input);
	    reader.setResource(resource);		
		reader.setRowMapper(excelMaterialOutstockDetailRowMapper());
		return reader;
	}

	/**
	 * If your Excel document has no header, you have to create a custom row mapper
	 * and configure it here.
	 */
	private RowMapper<MaterialOutstockDetail> excelMaterialOutstockDetailRowMapper() {
		return new MaterialOutstockDetailRowMapper();
	}

	@Bean
	public MaterialOutstockDetailItemProcessor materialOutstockDetailProcessor() {
		return new MaterialOutstockDetailItemProcessor();
	}

	
	@Bean
	public JdbcBatchItemWriter<MaterialOutstockDetail> materialOutstockDetailWriter() {
		JdbcBatchItemWriter<MaterialOutstockDetail> writer = new JdbcBatchItemWriter<MaterialOutstockDetail>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<MaterialOutstockDetail>());
		writer.setSql(
				"INSERT INTO mm_procurement_materialoutstockdetail (`dtype`,`id`,`closed`,`created_by`,`created_date`,`description`,`lastmodified_by`,`lastmodified_date`,`memo`,`podate`,`ponumber`,`purchaserequestdate`,`purchaserequestno`,`quantity`,`submitdate`,`unitprice`,`version`,`workorderdate`,`workorderno`,`deliverdate`,`catalogtype`,`currencyunit`,`prioritytype`,`requester`,`supplier`,`materialcatalog`,`organization`,`workordermaterial`) VALUES (:dtype,:id,:closed,:createdBy,:createdDate,:description,:lastModifiedBy,:lastModifiedDate,:memo,:poDate,:poNumber,:purchaseRequestDate,:purchaseRequestNo,:quantity,:submitDate,:unitPrice,:version,:workOrderDate,:workOrderNo,:deliverDate,:catalogType,:currencyUnit,:priorityType,:requester,:supplier,:materialCatalog,:organization,:workorderMaterial)");
		writer.setDataSource(dataSource);
		return writer;
	}

	

	@Bean
	public Job importMaterialOutstockDetailJob(JobCompletionNotificationListener listener) {		
			return jobBuilderFactory.get("importMaterialOutstockDetailJob").incrementer(new RunIdIncrementer())
					.listener(listener).flow(materialOutstockDetailStep()).end().build();		
	}
	

	@Bean
	public Step materialOutstockDetailStep() {
		return stepBuilderFactory.get("materialOutstockDetailStep").<MaterialOutstockDetail, MaterialOutstockDetail>chunk(5)
				.reader(excelMaterialOutstockDetailReader()).processor(materialOutstockDetailProcessor()).writer(materialOutstockDetailWriter())
				.build();
	}
}