package com.school.automobileSalesPlatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AutomobileSalesPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomobileSalesPlatformApplication.class, args);
	}

}
