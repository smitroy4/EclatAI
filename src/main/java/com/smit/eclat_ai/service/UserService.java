package com.smit.eclat_ai.service;

import com.smit.eclat_ai.dto.auth.UserProfileResponse;

public interface UserService {

    UserProfileResponse getProfile(Long userId);

}
