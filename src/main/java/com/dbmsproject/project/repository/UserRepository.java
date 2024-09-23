package com.dbmsproject.project.repository;

import java.beans.JavaBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dbmsproject.project.entity.User;
import com.dbmsproject.project.dto.UserDto;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUsername(String username);

    User save(UserDto user);
}

