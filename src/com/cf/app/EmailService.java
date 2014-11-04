package com.cf.app;

public interface EmailService {
	void send(String recipient, String subject, String content);
}
