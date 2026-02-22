package com.portfolio.backend.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "skills")
@Getter
@Setter
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String name;

	private int proficiency;

	private String category; // Frontend, Backend, DevOps

	@ManyToMany(mappedBy = "skills")
	private List<Project> projects;

	@ManyToMany
	@JoinTable(name = "project_skill", 
	joinColumns = @JoinColumn(name = "Project_is"),
	inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private List<Skills> skills;

}
