package com.mailsender.springmailexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mailsender.springmailexample.dto.EmailRequest;
import com.mailsender.springmailexample.service.EmailService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendmail")
    public ResponseEntity<Object> sendEMail(@RequestBody EmailRequest emailRequest) {
        log.info("Going to Send email: " + emailRequest.toString());
        
        return ResponseEntity.ok(emailService.sendEmail(emailRequest));
    }
}
