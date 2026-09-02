package com.smit.eclat_ai.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user) {
}

//obj creation: new AuthResponse("", new UserProfileResponse());
