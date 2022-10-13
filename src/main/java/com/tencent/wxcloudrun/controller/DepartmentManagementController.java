package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.entity.deparment.DepartmentNode;
import com.tencent.wxcloudrun.service.DepartmentManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentManagementController {
    @Autowired
    private DepartmentManagementService departmentManagementService;

    @PostMapping("/creation")
    public ApiResponse departmentCreation(@RequestBody DepartmentNode departmentNode) {
        return ApiResponse.ok(departmentManagementService.createDepartment(departmentNode));
    }

    @PostMapping("/options")
    public ApiResponse queryDepartmentOptions(@RequestBody DepartmentNode departmentNode) {
        return ApiResponse.ok(departmentManagementService.queryOptionList(departmentNode));
    }

    @PostMapping("/summary")
    public ApiResponse queryDepartmentSummary(@RequestBody DepartmentNode departmentNode) {
        return ApiResponse.ok(departmentManagementService.queryDepartmentSummary(departmentNode));
    }
}
