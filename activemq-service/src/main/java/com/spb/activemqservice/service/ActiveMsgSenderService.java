package com.spb.activemqservice.service;

import javax.jms.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.spb.activemqservice.models.Student;

@Service
public class ActiveMsgSenderService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(ActiveMsgSenderService.class);

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	public String processTextMessage(final String message) {
		LOGGER.info("Text message received :: {}",message);
		jmsTemplate.convertAndSend(queue, message);
		LOGGER.debug("Text message sent successfully :: {}",message);
		return message;
	}
	
	public Student processStudentMessage(final Student student) {
		LOGGER.info("Student message received :: {}",student);
		jmsTemplate.convertAndSend(queue, student);
		LOGGER.debug("Student message sent successfully :: {}",student);
		return student;
	}
}
