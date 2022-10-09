package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.entity.SubmitUserInfo;
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

    @GetMapping("/current")
    public ApiResponse queryCurrentUserRoleInfo(@RequestParam("openId") String openId) {
        return ApiResponse.ok(userRoleService.queryUserInfoByOpenId(openId));
    }

    @PostMapping("/submit")
    public ApiResponse submitUserRole(@RequestBody SubmitUserInfo userInfo) {
        if (!"Test12345".equals(userInfo.getApplyCode()))
            return ApiResponse.error("申请码错误，请联系上级部门或系统管理员获取申请码.");
        return ApiResponse.ok(userRoleService.submitUserInfo(userInfo));
    }

    @PostMapping("/audit")
    public ApiResponse auditUserRoleSubmit(@RequestBody UserInfo userInfo) {
        return ApiResponse.ok(userRoleService.auditUserRoleSubmit(userInfo));
    }
}
