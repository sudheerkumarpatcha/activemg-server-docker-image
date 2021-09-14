package com.spb.activemqservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMsgListener {
	
	private final static Logger LOGGER=LoggerFactory.getLogger(ActiveMsgListener.class);
		
	@JmsListener(destination = "testspringbootservice")
    public void listener(Object msg){
		LOGGER.info("Received Message at Listener End : {}",msg);
    }

}
