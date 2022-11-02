package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	JavaMailSender javaMailSender;

	SimpleMailMessage message = new SimpleMailMessage();
	
	public String sendEmail(Email email) {
		
	message.setFrom("vamsikurimeti92@gmail.com");	
	message.setTo(email.getTo());
	message.setSubject(email.getSubject());
	message.setText(email.getBody());
	
	javaMailSender.send(message);
	
	return "mail sent sucessfully";
	}
	

}
