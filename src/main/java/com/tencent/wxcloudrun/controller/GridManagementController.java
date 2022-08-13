package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.*;
import com.tencent.wxcloudrun.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grid-management")
public class GridManagementController {
    @Autowired
    private GridService gridService;

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private FloorService floorService;

    @Autowired
    private FamilyService familyService;

    @Autowired
    private MemberService memberService;

    @PostMapping("/grid/list")
    public ApiResponse getGridList() {
        return ApiResponse.ok(gridService.getGridInfoList());
    }

    @PostMapping("/grid/creation")
    public ApiResponse createGridInfo(@RequestBody GridInfo gridInfo) {
        return ApiResponse.ok(gridService.addGridInfo(gridInfo));
    }

    @PostMapping("/building/list")
    public ApiResponse getBuildingList(@RequestParam("gridId") Integer gridId) {
        return ApiResponse.ok(buildingService.getBuildInfoList(gridId));
    }

    @PostMapping("/building/creation")
    public ApiResponse createBuildingInfo(@RequestBody BuildingInfo buildingInfo) {
        return ApiResponse.ok(buildingService.addBuildingInfo(buildingInfo));
    }

    @PostMapping("/floor/list")
    public ApiResponse getFloorList(@RequestParam("buildingId") Integer buildingId) {
        return ApiResponse.ok(floorService.getFloorInfoList(buildingId));
    }

    @PostMapping("/floor/creation")
    public ApiResponse createFloorInfo(@RequestBody FloorInfo floorInfo) {
        return ApiResponse.ok(floorService.addFloorInfo(floorInfo));
    }

    @PostMapping("/family/list")
    public ApiResponse getFamilyList(@RequestParam("floorId") Integer floorId) {
        return ApiResponse.ok(familyService.getFamilyInfoList(floorId));
    }

    @PostMapping("/family/creation")
    public ApiResponse createFamilyInfo(@RequestBody FamilyInfo familyInfo) {
        return ApiResponse.ok(familyService.addFamilyInfo(familyInfo));
    }

    @PostMapping("/member/list")
    public ApiResponse getMemberList(@RequestParam("familyId") Integer familyId) {
        return ApiResponse.ok(memberService.getMemberInfoList(familyId));
    }

    @PostMapping("/member/creation")
    public ApiResponse createMemberInfo(@RequestBody MemberInfo memberInfo) {
        return ApiResponse.ok(memberService.addMemberInfo(memberInfo));
    }
}
