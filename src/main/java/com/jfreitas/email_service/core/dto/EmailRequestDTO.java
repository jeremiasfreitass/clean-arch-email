package com.jfreitas.email_service.core.dto;

public record EmailRequestDTO(
    String to,
    String subject,
    String body
) {
}
