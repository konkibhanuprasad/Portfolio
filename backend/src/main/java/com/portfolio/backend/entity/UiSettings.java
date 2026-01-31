package com.portfolio.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ui_Settings")
public class UiSettings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private boolean dark_mode; // theme
	private boolean animation_enabled;
	private String layout_preference;
	private String language;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
}
