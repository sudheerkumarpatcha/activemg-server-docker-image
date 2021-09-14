package com.spb.activemqservice.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spb.activemqservice.models.Student;
import com.spb.activemqservice.service.ActiveMsgSenderService;

@RestController
@RequestMapping("/activemqservice")
public class ActiveMqMessageReceierContoller {
	
	private final static Logger LOGGER=LoggerFactory.getLogger(ActiveMqMessageReceierContoller.class);
	
	@Autowired
	private ActiveMsgSenderService activeMsgSenderService;
	
	@GetMapping("/textmessage/{textmessage}")
	public String receiveTextmesage(@PathVariable("textmessage") final String message){
		LOGGER.info("Text Msg: {}",message);
	return activeMsgSenderService.processTextMessage(message);	
	}
	
	@PostMapping("/objectmessage")
	public Object receiveObjectMessage(@RequestBody final Student student) {
		LOGGER.info("Student Msg: {}",student);
		return activeMsgSenderService.processStudentMessage(student);
	}

}
