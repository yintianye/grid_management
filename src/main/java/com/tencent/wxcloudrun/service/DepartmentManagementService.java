package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.*;
import com.tencent.wxcloudrun.entity.deparment.DepartmentNode;
import com.tencent.wxcloudrun.model.*;
import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentManagementService {
    @Autowired
    private CommitteeInfoMapper committeeInfoMapper;

    @Autowired
    private CommunityInfoMapper communityInfoMapper;

    @Autowired
    private PartyBranchInfoMapper partyBranchInfoMapper;

    @Autowired
    private GridInfoMapper gridInfoMapper;

    @Autowired
    private ApartmentInfoMapper apartmentInfoMapper;

    @Autowired
    private BuildingInfoMapper buildingInfoMapper;

    @Autowired
    private UnitInfoMapper unitInfoMapper;

    @Autowired
    private FloorInfoMapper floorInfoMapper;

    @Autowired
    private FamilyInfoMapper familyInfoMapper;

    public boolean createDepartment(DepartmentNode node) {
        int level = 0;
        if (node.getCommitteeName() != null) level = 1;
        if (node.getCommunityName() != null) level = 2;
        if (node.getPartyBranchName() != null) level = 3;
        if (node.getGridName() != null) level = 4;
        if (node.getApartmentName() != null) level = 5;
        if (node.getBuildingName() != null) level = 6;
        if (node.getUnitName() != null) level = 7;
        if (node.getFloorName() != null) level = 8;

        if (level == 1) {
            CommitteeInfo committeeInfo = new CommitteeInfo();
            committeeInfo.setName(node.getCommitteeName());

            return committeeInfoMapper.insert(committeeInfo) == 1;
        } else if (level == 2) {
            CommunityInfo communityInfo = new CommunityInfo();
            communityInfo.setName(node.getCommunityName());
            communityInfo.setCommitteeId(node.getCommitteeId());

            return communityInfoMapper.insert(communityInfo) == 1;
        } else if (level == 3) {
            PartyBranchInfo partyBranchInfo = new PartyBranchInfo();
            partyBranchInfo.setName(node.getPartyBranchName());
            partyBranchInfo.setCommunityId(node.getCommunityId());

            return partyBranchInfoMapper.insert(partyBranchInfo) == 1;
        } else if (level == 4) {
            GridInfo gridInfo = new GridInfo();
            gridInfo.setName(node.getGridName());
            gridInfo.setPartyBranchId(node.getPartyBranchId());

            return gridInfoMapper.insert(gridInfo) == 1;
        } else if (level == 5) {
            ApartmentInfo apartmentInfo = new ApartmentInfo();
            apartmentInfo.setName(node.getApartmentName());
            apartmentInfo.setGridId(node.getGridId());

            return apartmentInfoMapper.insert(apartmentInfo) == 1;
        } else if (level == 6) {

        } else if (level == 7) {

        } else if (level == 8) {

        }

        return false;
    }

    public Object queryOptionList(DepartmentNode node) {
        if (node.getFloorId() != null) return queryFamilyInfoList(node.getFloorId());
        if (node.getUnitId() != null) return queryFloorInfoList(node.getUnitId());
        if (node.getBuildingId() != null) return queryUnitInfoList(node.getBuildingId());
        if (node.getApartmentId() != null) return queryBuildingInfoList(node.getApartmentId());
        if (node.getGridId() != null) return queryApartmentInfoList(node.getGridId());
        if (node.getPartyBranchId() != null) return queryGridInfoList(node.getPartyBranchId());
        if (node.getCommunityId() != null) return queryPartyBranchList(node.getCommunityId());
        if (node.getCommitteeId() != null) return queryCommunityInfoList(node.getCommitteeId());

        return queryCommitteeInfoList();
    }

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

    public List<ApartmentInfo> queryApartmentInfoList(Integer gridId) {
        ApartmentInfoExample example = new ApartmentInfoExample();
        if (gridId != null) example.createCriteria().andGridIdEqualTo(gridId);

        return apartmentInfoMapper.selectByExample(example);
    }

    public List<BuildingInfo> queryBuildingInfoList(Integer apartmentId) {
        BuildingInfoExample example = new BuildingInfoExample();
        if (apartmentId != null) example.createCriteria().andApartmentIdEqualTo(apartmentId);

        return buildingInfoMapper.selectByExample(example);
    }

    public List<UnitInfo> queryUnitInfoList(Integer buildingId) {
        UnitInfoExample example = new UnitInfoExample();
        if (buildingId != null) example.createCriteria().andBuildingIdEqualTo(buildingId);

        return unitInfoMapper.selectByExample(example);
    }

    public List<FloorInfo> queryFloorInfoList(Integer unitId) {
        FloorInfoExample example = new FloorInfoExample();
        if (unitId != null) example.createCriteria().andUnitIdEqualTo(unitId);

        return floorInfoMapper.selectByExample(example);
    }

    public List<FamilyInfo> queryFamilyInfoList(Integer floorId) {
        FamilyInfoExample example = new FamilyInfoExample();
        if (floorId != null) example.createCriteria().andFloorIdEqualTo(floorId);

        return familyInfoMapper.selectByExample(example);
    }
}
