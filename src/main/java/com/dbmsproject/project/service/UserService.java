package com.dbmsproject.project.service;

import com.dbmsproject.project.entity.User;
import com.dbmsproject.project.dto.UserDto;

public interface UserService {
 User findByUsername(String username);

 User save(UserDto userDto);

}