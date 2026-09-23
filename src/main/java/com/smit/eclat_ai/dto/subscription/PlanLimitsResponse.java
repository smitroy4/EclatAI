package com.smit.eclat_ai.dto.subscription;

public record PlanLimitsResponse(
       String planName,
       int maxTokensPerDay,
       int maxProjects,
       boolean unlimitedAi
) {
}
