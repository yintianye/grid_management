package com.tencent.wxcloudrun.entity.deparment;

import lombok.Data;

@Data
public class FamilyNode extends DepartmentNode {
    private Integer id;
    private String name;
    private String personCount;
    private String partyFlag;
    private String lowIncomeFlag;
    private String solitudeFlag;
    private String masterName;
    private String masterPhone;
}
