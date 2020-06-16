package com.ocmms.cmms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ocmms.cmms.file.service.StorageProperties;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
@EnableConfigurationProperties(StorageProperties.class)
public class OcmmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcmmsApiApplication.class, args);
	}

	/*
	 * @Bean public JavaMailSenderImpl JavaMailSender() { JavaMailSenderImpl
	 * mailSender = new JavaMailSenderImpl(); return mailSender; }
	 */

}
