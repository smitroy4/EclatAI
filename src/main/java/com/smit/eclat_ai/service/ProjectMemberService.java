package com.smit.eclat_ai.service;

import com.smit.eclat_ai.dto.member.InviteMemberRequest;
import com.smit.eclat_ai.dto.member.MemberResponse;
import com.smit.eclat_ai.dto.member.UpdateRoleRequest;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, Long userId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId);
}
