package com.jfreitas.email_service.controllers;

import com.jfreitas.email_service.application.EmailSenderService;
import com.jfreitas.email_service.core.dto.EmailRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emails")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequestDTO emailRequest) {

        emailSenderService.sendEmail(emailRequest.to(), emailRequest.subject(), emailRequest.body());

        return ResponseEntity.ok("Email sent successfully");
    }
}
