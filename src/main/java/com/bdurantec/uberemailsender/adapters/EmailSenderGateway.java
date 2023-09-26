package com.bdurantec.uberemailsender.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
