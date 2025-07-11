package com.jfreitas.email_service.application;

import com.jfreitas.email_service.adapters.EmailSenderGateway;
import com.jfreitas.email_service.core.EmailSenderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        emailSenderGateway.sendEmail(to, subject, body);
    }
}
