package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.FamilyInfoMapper;
import com.tencent.wxcloudrun.model.FamilyInfo;
import com.tencent.wxcloudrun.model.FamilyInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FamilyService {
    @Autowired
    private FamilyInfoMapper familyInfoMapper;

    public List<FamilyInfo> getFamilyInfoList(Integer unitId) {
        FamilyInfoExample example = new FamilyInfoExample();
        if (unitId != null) example.createCriteria().andUnitIdEqualTo(unitId);

        return familyInfoMapper.selectByExample(example);
    }

    public boolean addFamilyInfo(FamilyInfo info) {
        return familyInfoMapper.insert(info) == 1;
    }
}
