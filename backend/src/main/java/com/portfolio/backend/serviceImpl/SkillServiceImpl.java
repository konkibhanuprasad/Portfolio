package com.portfolio.backend.serviceImpl;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.portfolio.backend.entity.Skills;
import com.portfolio.backend.repository.SkillRepository;
import com.portfolio.backend.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService{
	
	private final SkillRepository skillRepo;
	
	public SkillServiceImpl(SkillRepository skillRepository){
		this.skillRepo = skillRepository;
	}

	@Override
	public Skills createSkill(Skills skill) {
		// TODO Auto-generated method stub
		return skillRepo.save(skill);
	}

	@Override
	public List<Skills> getAllSkills() {
		// TODO Auto-generated method stub
		List<Skills> skills = skillRepo.findAll();
		skills.sort(Comparator.comparing(Skills::getProficiency).reversed());
		return skills;
	}

	@Override
	public void deleteSkills(Long id) {
		// TODO Auto-generated method stub
		skillRepo.deleteById(id);
		
	}

	@Override
	public Skills getSkillById(Long id) {
		// TODO Auto-generated method stub
		return skillRepo.findById(id).orElseThrow(() -> new RuntimeException("Skill not Found"));
	}

	@Override
	public List<Skills> searchSkill(String name) {
		// TODO Auto-generated method stub
		return skillRepo.findByNameContainingIgnoreCase(name);
	}

	@Override
	public Skills updateSkill(Long id, Skills updateSkill) {
		// TODO Auto-generated method stub
		Skills skills = getSkillById(id);
		skills.setName(updateSkill.getName());
		skills.setProficiency(updateSkill.getProficiency());
		return skillRepo.save(skills);
	}
	
	
	

}
