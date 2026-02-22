package com.portfolio.backend.service;

import java.util.List;

import com.portfolio.backend.entity.Skills;

public interface SkillService {
	
	Skills createSkill(Skills skill);
	
	List<Skills> getAllSkills();
	
	Skills getSkillById(Long id);
	
	List<Skills> searchSkill(String name);
	
	Skills updateSkill(Long id, Skills skill);
	
	void deleteSkills(Long id);
}
