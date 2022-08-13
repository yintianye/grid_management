package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.FloorInfoMapper;
import com.tencent.wxcloudrun.model.FloorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FloorService {
    @Autowired
    private FloorInfoMapper floorInfoMapper;

    public List<FloorInfo> getFloorInfoList(Integer buildingId) {
        return floorInfoMapper.selectAll().stream().filter(info -> buildingId.equals(info.getBuildingId())).collect(Collectors.toList());
    }

    public boolean addFloorInfo(FloorInfo info) {
        return floorInfoMapper.insert(info) == 1;
    }
}
