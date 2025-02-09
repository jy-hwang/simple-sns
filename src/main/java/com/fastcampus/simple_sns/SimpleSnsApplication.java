package com.fastcampus.simple_sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SimpleSnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSnsApplication.class, args);
	}

}
