package com.portfolio.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.dto.ProjectDTO;
import com.portfolio.backend.entity.Project;
import com.portfolio.backend.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping
	public Project create(@RequestBody Project project) {
		return projectService.createProject(project);
	}
	
	@GetMapping
	public List<ProjectDTO> getAll(){
		return projectService.getAllProjects();
	}
	
	@DeleteMapping("/api/projects/{id}")
	public void deleteProject(@PathVariable Long id) {
		 projectService.deleteProject(id);
	}
	
	@PutMapping("/api/projects/{id}")
	public Project updateProject(@PathVariable Long id, Project updateProject) {
		return projectService.updateProject(id, updateProject);
	}

}
