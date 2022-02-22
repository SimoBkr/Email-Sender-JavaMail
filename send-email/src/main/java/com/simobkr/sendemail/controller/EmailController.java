package com.simobkr.sendemail.controller;

import com.simobkr.sendemail.services.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sendEmail")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public String sendEmail() {
        emailService.sendMessage(
                "mohamed97@yopmail.com", //put here your target email
                "Testing Java Email Sender",
                "Hello I'm just learning how implement Email Sender"
        );
        return "Message sent !!";
    }
}
