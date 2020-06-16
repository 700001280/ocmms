package com.ocmms.cmms.model.pm.configuration;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Value;

public class UserSequenceGenerator {

	@Value("${pm_code_prefix}")
	private String prefix;
	@Value("${pm_code_suffix}")
	private String suffix;
	@Value("${pm_code_initial}")
	private int initial;
	private final AtomicInteger counter = new AtomicInteger();

	public UserSequenceGenerator() {
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public String getSequence() {
		StringBuilder builder = new StringBuilder();
		builder.append(prefix).append(initial).append(counter.getAndIncrement()).append(suffix);
		return builder.toString();
	}
}