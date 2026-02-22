package com.portfolio.backend.entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "past_employement")
@Getter
@Setter
public class PastEmployement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String companyName;
	private String jobRole;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean ifCurrent;
	private String discription;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
}
