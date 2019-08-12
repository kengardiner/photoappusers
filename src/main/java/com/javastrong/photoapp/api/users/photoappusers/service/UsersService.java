package com.javastrong.photoapp.api.users.photoappusers.service;

import com.javastrong.photoapp.api.users.photoappusers.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
    UserDto getUserDetailsByEmail(String email);
}
