package com.dbmsproject.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbmsproject.project.entity.Props;

public interface ProjectRepository extends JpaRepository<Props, Long>{
    
}
