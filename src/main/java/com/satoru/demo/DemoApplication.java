package com.satoru.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static String env;
	@Value("${env}")
	public void setEnv(String setEnv) {
		DemoApplication.env = setEnv;
	}

	public static String site;
	@Value("${site}")
	public void setsite(String site) {
		DemoApplication.site = site;
	}

	public static String proj;
	@Value("${project}")
	public void setproj(String proj) {
		DemoApplication.proj = proj;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
