package com.javastrong.photoapp.api.users.photoappusers.ui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestModel {
    private String email;
    private String password;
}
