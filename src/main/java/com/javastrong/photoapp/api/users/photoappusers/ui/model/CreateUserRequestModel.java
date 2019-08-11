package com.javastrong.photoapp.api.users.photoappusers.ui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestModel {
    @NotNull(message="Fill out your first name, yo!")
    @Size(min = 2, message = "First name must be longer than 1 character")
    private String firstName;
    @NotNull(message="Fill out your last name, yo!")
    @Size(min = 2, message = "Last name must be longer than 1 character")
    private String lastName;
    @NotNull(message = "Password can not be nullll")
    @Size(min=8, max = 16, message="Password must be between 8 and 16 chars")
    private String password;
    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
}
