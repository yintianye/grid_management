package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.MemberInfoMapper;
import com.tencent.wxcloudrun.model.MemberInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {
    @Autowired
    private MemberInfoMapper memberInfoMapper;

    public List<MemberInfo> getMemberInfoList(Integer familyId) {
        return memberInfoMapper.selectAll().stream().filter(info -> familyId.equals(info.getFamilyId())).collect(Collectors.toList());
    }

    public boolean addMemberInfo(MemberInfo info) {
        return memberInfoMapper.insert(info) == 1;
    }
}
