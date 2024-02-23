package com.codeWithProjects.Ecomm.services.jwt.auth;

import com.codeWithProjects.Ecomm.dto.SignupRequest;
import com.codeWithProjects.Ecomm.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    public Boolean hasUserWithEmail(String email);
}
