package com.smit.eclat_ai.service;

import com.smit.eclat_ai.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
