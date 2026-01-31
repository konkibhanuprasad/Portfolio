package com.portfolio.backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chat_messages")
public class ChatMessages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String sessionId;
	private String messageContent;
	private String senderType;
	private LocalDateTime timeStamp = LocalDateTime.now();
	private boolean isRead;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = true)
	private User user;
}
