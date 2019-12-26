package com.pujanov.unlimited;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class UnlimitedTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnlimitedTaskApplication.class, args);
	}

	@Bean
	@Primary
	@ConfigurationProperties(prefix ="spring.datasource")
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}

}
