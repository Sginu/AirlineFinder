package com.airline.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.airline.model.FlightsCache;


@Configuration
@EnableWebMvc
@ComponentScan("{com.airline}")
public class AppConfig {

	@Bean(name="flightsCache")
	public FlightsCache getFlightsCache(){
		System.out.println("init");
		return new FlightsCache();
	}
	
}
