package com.portfolio.backend.entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true, nullable = false)
	private String username;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String passwordHash;

	private String fullname;
	private String bio;
	private String profileImageUrl;
	private long contactNumber;

	private LocalDateTime createdAt = LocalDateTime.now();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<PastEmployement> experinces;

	@OneToMany(mappedBy = "user")
	private List<ChatMessages> messages;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private UiSettings uiSettings;

}
