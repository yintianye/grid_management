package com.tencent.wxcloudrun.entity;

import com.tencent.wxcloudrun.model.UserInfo;
import lombok.Data;

@Data
public class SubmitUserInfo extends UserInfo {
    private String applyCode;
}
