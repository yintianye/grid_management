package com.tencent.wxcloudrun.entity.deparment;

import lombok.Data;

@Data
public class DepartmentNode {
    private Integer committeeId;
    private String committeeName;
    private Integer communityId;
    private String communityName;
    private Integer partyBranchId;
    private String partyBranchName;
    private Integer gridId;
    private String gridName;
    private Integer apartmentId;
    private String apartmentName;
    private Integer buildingId;
    private String buildingName;
    private Integer unitId;
    private String unitName;
    private Integer floorId;
    private String floorName;
}
