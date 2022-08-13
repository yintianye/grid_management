package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.FamilyInfoMapper;
import com.tencent.wxcloudrun.model.FamilyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FamilyService {
    @Autowired
    private FamilyInfoMapper familyInfoMapper;

    public List<FamilyInfo> getFamilyInfoList(Integer floorId) {
        return familyInfoMapper.selectAll().stream().filter(info -> floorId.equals(info.getFloorId())).collect(Collectors.toList());
    }

    public boolean addFamilyInfo(FamilyInfo info) {
        return familyInfoMapper.insert(info) == 1;
    }
}
