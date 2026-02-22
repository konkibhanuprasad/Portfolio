package com.portfolio.backend.mapper;

import com.portfolio.backend.dto.ProjectDTO;
import com.portfolio.backend.entity.Project;

public class ProjectMapper {

    public static ProjectDTO toDTO(Project project){
        ProjectDTO dto = new ProjectDTO();

        dto.setId(project.getId());
        dto.setTitle(project.getTitle());
        dto.setDiscription(project.getDescription());

        if(project.getClient() != null){
            dto.setClientName(project.getClient().getName());
        }
        return dto;
    }
    
}