package com.portfolio.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.backend.entity.Skills;

public interface SkillRepository extends JpaRepository<Skills, Long>{
	
	List<Skills> findAllByOrderByProficiencyDesc();
	
	List<Skills> findByNameContainingIgnoreCase(String name);

}
