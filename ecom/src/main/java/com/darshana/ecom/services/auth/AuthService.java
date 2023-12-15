package com.darshana.ecom.services.auth;

import com.darshana.ecom.dto.SignupRequest;
import com.darshana.ecom.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
