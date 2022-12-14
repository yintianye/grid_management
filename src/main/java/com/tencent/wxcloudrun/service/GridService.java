package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.GridInfoMapper;
import com.tencent.wxcloudrun.model.GridInfo;
import com.tencent.wxcloudrun.model.GridInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GridService {
    @Autowired
    private GridInfoMapper gridInfoMapper;

    public List<GridInfo> getGridInfoList() {
        return gridInfoMapper.selectByExample(new GridInfoExample());
    }

    public boolean addGridInfo(GridInfo gridInfo) {
        return gridInfoMapper.insert(gridInfo) == 1;
    }
}
