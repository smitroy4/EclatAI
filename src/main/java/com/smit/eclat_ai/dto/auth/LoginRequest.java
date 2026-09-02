package com.smit.eclat_ai.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
