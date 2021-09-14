package com.spb.activemqservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqServiceApplication.class, args);
	}

}
