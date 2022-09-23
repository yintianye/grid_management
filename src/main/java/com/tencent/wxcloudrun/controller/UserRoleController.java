package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.UserInfo;
import com.tencent.wxcloudrun.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/user-role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("/committee-list")
    public ApiResponse queryCommitteeList() {
        return ApiResponse.ok(userRoleService.queryCommitteeInfoList());
    }

    @GetMapping("/community-list")
    public ApiResponse queryCommunityList(@RequestParam("committeeId") Integer committeeId) {
        return ApiResponse.ok(userRoleService.queryCommunityInfoList(committeeId));
    }

    @GetMapping("/party-branch-list")
    public ApiResponse queryPartyBranchList(@RequestParam("communityId") Integer communityId) {
        return ApiResponse.ok(userRoleService.queryPartyBranchList(communityId));
    }

    @GetMapping("/grid-list")
    public ApiResponse queryGridList(@RequestParam("partyBranchId") Integer partyBranchId) {
        return ApiResponse.ok(userRoleService.queryGridInfoList(partyBranchId));
    }

    @GetMapping("/current")
    public ApiResponse queryCurrentUserRoleInfo(@RequestParam("openId") String openId) {
        return ApiResponse.ok(userRoleService.queryUserInfoByOpenId(openId));
    }

    @PostMapping("/submit")
    public ApiResponse submitUserRole(@RequestBody UserInfo userInfo) {
        return ApiResponse.ok(userRoleService.submitUserInfo(userInfo));
    }

    @PostMapping("/audit")
    public ApiResponse auditUserRoleSubmit(@RequestBody UserInfo userInfo) {
        return ApiResponse.ok(userRoleService.auditUserRoleSubmit(userInfo));
    }
}
