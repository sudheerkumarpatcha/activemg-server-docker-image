package com.spb.activemqservice.configuration;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JmsConfiguration {

	@Value("${activemq.url}")
	private String activeMqUrl;
	
	@Value("${message.queue.testspb}")
	private String testQueueName;
	
	@Bean
	public Queue testSpringBootService() {
		return new ActiveMQQueue(testQueueName);
	}
	
    @Bean
    public ActiveMQConnectionFactory connectionFatory(){
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL(activeMqUrl);
        return factory;
    }
	
	@Bean
	public JmsTemplate jmsTemplate() {
		return new JmsTemplate(connectionFatory());
	}
	
}
