package com.portfolio.backend.service;

import java.util.List;

import com.portfolio.backend.dto.ProjectDTO;
import com.portfolio.backend.entity.Project;

public interface ProjectService {
	Project createProject(Project project);

	List<ProjectDTO> getAllProjects();

	Project getProjectById(Long id);
	
	List<Project> searchProjectByTitle(String name);
	
	List<Project> getProjectSortBydate();

	void deleteProject(Long id);
	
	Project updateProject(Long id, Project project);

}
