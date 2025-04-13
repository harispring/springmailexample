package com.mailsender.springmailexample.dto;

import lombok.Data;

@Data
public class EmailRequest {

    // Class data members
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
    
    //generate getters 
}