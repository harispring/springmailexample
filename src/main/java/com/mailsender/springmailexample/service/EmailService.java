package com.mailsender.springmailexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.mailsender.springmailexample.dto.EmailRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmailService {//implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    //@Override
    @Async
    public String  sendEmail(EmailRequest emailRequest) {

    	try {
    		SimpleMailMessage mailMessage = new SimpleMailMessage();
            //mailMessage.setFrom("abc@xyz");
            mailMessage.setTo(emailRequest.getRecipient());
            mailMessage.setText(emailRequest.getMsgBody());
            mailMessage.setSubject(emailRequest.getSubject());
            javaMailSender.send(mailMessage);

            log.info("Message Sent Successfully to: {}", emailRequest.getRecipient());
            return "Email Sent Successfully";
        }
          catch (Exception e) {
            log.error("sendEmail() | Error : {}", e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
