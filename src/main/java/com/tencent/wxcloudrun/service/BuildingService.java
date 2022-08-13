package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.BuildingInfoMapper;
import com.tencent.wxcloudrun.model.BuildingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildingService {
    @Autowired
    private BuildingInfoMapper buildingInfoMapper;

    public List<BuildingInfo> getBuildInfoList(Integer gridId) {
        return buildingInfoMapper.selectAll().stream().filter(info -> gridId.equals(info.getGridId())).collect(Collectors.toList());
    }

    public boolean addBuildingInfo(BuildingInfo info) {
        return buildingInfoMapper.insert(info) == 1;
    }
}
