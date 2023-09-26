package com.bdurantec.uberemailsender.core;

public record EmailRequest(
        String to,
        String subject,
        String body
) {
}