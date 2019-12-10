package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.annotation.beans.MessageBean;

@Configuration // it make class as config
public class MessageConfig {

	@Bean // to know it is from bean class if not give it shows exception No qualifying
			// bean of type 'com.capgemini.springcore.annotation.beans.MessageBean'
			// available
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hello World!!!");
		return messageBean;
	}// End of getMessage()
}// End of class
