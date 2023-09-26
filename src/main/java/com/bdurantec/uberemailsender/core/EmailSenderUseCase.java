package com.bdurantec.uberemailsender.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
