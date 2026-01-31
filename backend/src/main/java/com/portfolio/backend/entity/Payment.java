package com.portfolio.backend.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payements")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private BigDecimal amount;
	private String currency;
	private String transaction_id;
	private String status; // success, failed, pending
	private String payment_method;

	private LocalDateTime timestamp = LocalDateTime.now();

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = true)
	private User user;
}
