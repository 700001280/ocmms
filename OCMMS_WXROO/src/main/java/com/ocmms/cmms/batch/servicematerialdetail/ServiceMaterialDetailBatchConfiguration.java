package com.ocmms.cmms.batch.servicematerialdetail;


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
import com.ocmms.cmms.file.service.StorageProperties;

@Configuration
public class ServiceMaterialDetailBatchConfiguration {

	private static final Logger log = LoggerFactory.getLogger(ServiceMaterialDetailBatchConfiguration.class);
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
	public PoiItemReader<ServiceMaterialDetail> excelServiceMaterialDetailReader() {
		PoiItemReader<ServiceMaterialDetail> reader = new PoiItemReader<>();
		reader.setRowSetFactory(new DefaultRowSetFactory());
		reader.setLinesToSkip(1);
		PushbackInputStream input=null;
		try {
			input = new PushbackInputStream(new FileInputStream(properties.getLocation().concat("servicematerialdetail.xlsx")));
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
	    InputStreamResource resource = new InputStreamResource(input);
	    reader.setResource(resource);		
		reader.setRowMapper(excelServiceMaterialDetailRowMapper());
		return reader;
	}

	/**
	 * If your Excel document has no header, you have to create a custom row mapper
	 * and configure it here.
	 */
	private RowMapper<ServiceMaterialDetail> excelServiceMaterialDetailRowMapper() {
		return new ServiceMaterialDetailRowMapper();
	}

	@Bean
	public ServiceMaterialDetailItemProcessor serviceMaterialDetailProcessor() {
		return new ServiceMaterialDetailItemProcessor();
	}

	
	@Bean
	public JdbcBatchItemWriter<ServiceMaterialDetail> serviceMaterialDetailWriter() {
		JdbcBatchItemWriter<ServiceMaterialDetail> writer = new JdbcBatchItemWriter<ServiceMaterialDetail>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<ServiceMaterialDetail>());
		writer.setSql("INSERT INTO mm_master_servicematerialdetail(`id`,`closed`,`created_by`,`created_date`,`description`,`lastmodified_by`,`lastmodified_date`,`memo`,`quantity`,`unitprice`,`version`,`currencyunit`,`servicecatalog`,`servicepurchasedetail`,`dtype`) VALUES (:id,:closed,:createdBy,:createdDate,:description,:lastModifiedBy,:lastModifiedDate,:memo,:quantity,:unitPrice,:version,:currencyUnit,:serviceCatalog,:servicePurchaseDetail,:dtype)");
		writer.setDataSource(dataSource);
		return writer;
	}

	

	@Bean
	public Job importServiceMaterialDetailJob(JobCompletionNotificationListener listener) {		
			return jobBuilderFactory.get("importServiceMaterialDetailJob").incrementer(new RunIdIncrementer())
					.listener(listener).flow(serviceMaterialDetailStep()).end().build();		
	}
	

	@Bean
	public Step serviceMaterialDetailStep() {
		return stepBuilderFactory.get("serviceMaterialDetailStep").<ServiceMaterialDetail, ServiceMaterialDetail>chunk(5)
				.reader(excelServiceMaterialDetailReader()).processor(serviceMaterialDetailProcessor()).writer(serviceMaterialDetailWriter())
				.build();
	}
}