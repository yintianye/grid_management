package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.*;
import com.tencent.wxcloudrun.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo queryUserInfoByOpenId(String openId) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);

        return ObjectUtils.isEmpty(userInfoList) ? null : userInfoList.get(0);
    }

    public boolean submitUserInfo(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo) == 1;
    }

    public boolean auditUserRoleSubmit(UserInfo userInfo) {
        if (userInfo.getId() == null || userInfo.getStatus() == null) return false;

        return userInfoMapper.updateByPrimaryKeySelective(userInfo) == 1;
    }

}
