package com.smit.eclat_ai.dto.member;

import com.smit.eclat_ai.enums.ProjectRole;

public record UpdateRoleRequest(
        ProjectRole role
) {
}
