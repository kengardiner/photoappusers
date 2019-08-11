package com.javastrong.photoapp.api.users.photoappusers.ui.controllers;

import com.javastrong.photoapp.api.users.photoappusers.service.UsersService;

import com.javastrong.photoapp.api.users.photoappusers.shared.UserDto;
import com.javastrong.photoapp.api.users.photoappusers.ui.model.CreateUserRequestModel;
import com.javastrong.photoapp.api.users.photoappusers.ui.model.CreateUserResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment environment;

    @Autowired
    UsersService usersService;


    @GetMapping("/status/check")
    public String status(){
        return "Running on port: " + environment.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity createUser(@Valid  @RequestBody CreateUserRequestModel userDetails){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(userDetails, UserDto.class);

        UserDto createdUser = usersService.createUser(userDto);

        CreateUserResponseModel returnValue = modelMapper.map(createdUser, CreateUserResponseModel.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
    }
}
