package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.FloorInfoMapper;
import com.tencent.wxcloudrun.model.FamilyInfoExample;
import com.tencent.wxcloudrun.model.FloorInfo;
import com.tencent.wxcloudrun.model.FloorInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FloorService {
    @Autowired
    private FloorInfoMapper floorInfoMapper;

    public List<FloorInfo> getFloorInfoList(Integer buildingId) {
        FloorInfoExample example = new FloorInfoExample();
        if (buildingId != null) example.createCriteria().andUnitIdEqualTo(buildingId); //FIXME.

        return floorInfoMapper.selectByExample(example);
    }

    public boolean addFloorInfo(FloorInfo info) {
        return floorInfoMapper.insert(info) == 1;
    }
}
