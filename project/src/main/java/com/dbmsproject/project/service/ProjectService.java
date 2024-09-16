package com.dbmsproject.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbmsproject.project.entity.Props;
import com.dbmsproject.project.repository.ProjectRepository;

@Component
public class ProjectService {
    
    @Autowired
    private ProjectRepository projectRepository;

    public void saveEntry(Props props){
        projectRepository.save(props);
    }

}
