package com.ocmms.cmms.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		String os = System.getProperty("os.name");

		if (os.toLowerCase().startsWith("win")) {
			registry.addResourceHandler("/pics/**").addResourceLocations("file:c:/uploadDir/");
			// registry.addResourceHandler("/img/**").addResourceLocations("classpath:/resources/static/public/img/");
			System.out.println(registry.toString());
		} else {
			registry.addResourceHandler("/pics/**").addResourceLocations("file:/uploadDir/");
			// registry.addResourceHandler("/img/**").addResourceLocations("classpath:/resources/static/public/img/");
			System.out.println(registry.toString());
		}

	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
				.maxAge(3600).allowCredentials(true);
	}

	/**
	 * TODO Auto-generated method documentation
	 * 
	 * @return LocalValidatorFactoryBean
	 */
	@Primary
	@Bean
	public LocalValidatorFactoryBean validator() {
		return new LocalValidatorFactoryBean();
	}

	/**
	 * TODO Auto-generated method documentation
	 * 
	 * @return LocaleResolver
	 */
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(new Locale("en"));
		return localeResolver;
	}

	/**
	 * TODO Auto-generated method documentation
	 * 
	 * @return LocaleChangeInterceptor
	 */
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		return localeChangeInterceptor;
	}

}
