package com.c1se44.school_connect.config;


import com.sendgrid.SendGrid;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Sendgridconfig {

	private static final String key="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";


	@Bean
	public SendGrid getSendgrid()
	{
		return new SendGrid(key);
	}

}