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
    private CommitteeInfoMapper committeeInfoMapper;

    @Autowired
    private CommunityInfoMapper communityInfoMapper;

    @Autowired
    private PartyBranchInfoMapper partyBranchInfoMapper;

    @Autowired
    private GridInfoMapper gridInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<CommitteeInfo> queryCommitteeInfoList() {
        return committeeInfoMapper.selectByExample(new CommitteeInfoExample());
    }

    public List<CommunityInfo> queryCommunityInfoList(Integer committeeId) {
        CommunityInfoExample example = new CommunityInfoExample();
        if (committeeId != null) example.createCriteria().andCommitteeIdEqualTo(committeeId);

        return communityInfoMapper.selectByExample(example);
    }

    public List<PartyBranchInfo> queryPartyBranchList(Integer communityId) {
        PartyBranchInfoExample example = new PartyBranchInfoExample();
        if (communityId != null) example.createCriteria().andCommunityIdEqualTo(communityId);

        return partyBranchInfoMapper.selectByExample(example);
    }

    public List<GridInfo> queryGridInfoList(Integer partyBranchId) {
        GridInfoExample example = new GridInfoExample();
        if (partyBranchId != null) example.createCriteria().andPartyBranchIdEqualTo(partyBranchId);

        return gridInfoMapper.selectByExample(example);
    }

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
