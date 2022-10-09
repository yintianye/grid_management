package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.UserInfo;
import com.tencent.wxcloudrun.service.ResidentStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resident")
public class ResidentManagementController {
    @Autowired
    private ResidentStatisticService residentStatisticService;

    @PostMapping("/statistic")
    public ApiResponse statistic(@RequestBody UserInfo userInfo) {
        return null;
    }
}
