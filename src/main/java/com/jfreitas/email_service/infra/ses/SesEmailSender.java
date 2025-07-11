package com.jfreitas.email_service.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.jfreitas.email_service.adapters.EmailSenderGateway;
import com.jfreitas.email_service.core.exeptions.EmailServiceExeption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("jeremiasjmf@hotmail.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body()
                                .withText(new Content(body))));
        try {
            amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException exception) {
            throw new EmailServiceExeption("Error sending email to " + to, exception);
        }
    }
}
