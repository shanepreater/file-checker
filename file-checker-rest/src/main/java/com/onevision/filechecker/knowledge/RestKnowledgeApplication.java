/**
 * 
 */
package com.onevision.filechecker.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main spring boot application entry point.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class RestKnowledgeApplication {
	public static void main(String[] args) throws Throwable {
		SpringApplication.run(RestKnowledgeApplication.class, args);
	}
}
