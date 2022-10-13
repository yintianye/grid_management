package com.tencent.wxcloudrun.entity.deparment;

import lombok.Data;

@Data
public class DepartmentSummary {
    private Integer familyCount = 0;
    private Integer personCount;
    private Integer partyFamilyCount = 0;
    private Integer lowIncomeFamilyCount = 0;
    private Integer solitudeFamilyCount = 0;
}
