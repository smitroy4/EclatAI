package com.smit.eclat_ai.service;

import com.smit.eclat_ai.dto.auth.AuthResponse;
import com.smit.eclat_ai.dto.auth.LoginRequest;
import com.smit.eclat_ai.dto.auth.SignupRequest;

public interface AuthService {

    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
