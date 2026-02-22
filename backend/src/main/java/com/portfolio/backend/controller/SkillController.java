package com.portfolio.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.entity.Skills;
import com.portfolio.backend.service.SkillService;

@RestController
@RequestMapping("/api/skill")
public class SkillController {
	
	private final SkillService skillService;
	
	public SkillController(SkillService skillService) {
		this.skillService = skillService;
	}
	
	@PostMapping
	public Skills createSkills(@RequestBody Skills skill) {
		return skillService.createSkill(skill);
	}
	
	@GetMapping
	public List<Skills> getAllSkills(){
		return skillService.getAllSkills();
	}
	
	@GetMapping("/{id}")
	public Skills getSkill(@PathVariable Long id) {
		return skillService.getSkillById(id);
	}
	
	@GetMapping("/{search}")
	public List<Skills> searchSkills(@RequestParam String name){
		return skillService.searchSkill(name);
	}
	
	@PutMapping("/{id}")
	public Skills updateSkill(@PathVariable Long id,@RequestBody Skills skills) {
		return skillService.updateSkill(id, skills);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSkill(@PathVariable Long id) {
		 skillService.deleteSkills(id);
	}

}
