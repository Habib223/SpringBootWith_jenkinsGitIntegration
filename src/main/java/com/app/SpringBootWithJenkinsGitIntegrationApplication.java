package com.app;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithJenkinsGitIntegrationApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringBootWithJenkinsGitIntegrationApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application start......");
		logger.debug("Debugging msg here");
	}
	
	public static void main(String[] args) {
		
		logger.info("Application start......");
		SpringApplication.run(SpringBootWithJenkinsGitIntegrationApplication.class, args);
	}

}
