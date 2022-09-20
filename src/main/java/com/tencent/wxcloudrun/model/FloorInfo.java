package com.tencent.wxcloudrun.model;

public class FloorInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column floor_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column floor_info.floor
     *
     * @mbggenerated
     */
    private Integer floor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column floor_info.building_id
     *
     * @mbggenerated
     */
    private Integer buildingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column floor_info.building_name
     *
     * @mbggenerated
     */
    private String buildingName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column floor_info.building_detail
     *
     * @mbggenerated
     */
    private String buildingDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column floor_info.grid_id
     *
     * @mbggenerated
     */
    private Integer gridId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column floor_info.grid_name
     *
     * @mbggenerated
     */
    private String gridName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column floor_info.id
     *
     * @return the value of floor_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column floor_info.id
     *
     * @param id the value for floor_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column floor_info.floor
     *
     * @return the value of floor_info.floor
     *
     * @mbggenerated
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column floor_info.floor
     *
     * @param floor the value for floor_info.floor
     *
     * @mbggenerated
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column floor_info.building_id
     *
     * @return the value of floor_info.building_id
     *
     * @mbggenerated
     */
    public Integer getBuildingId() {
        return buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column floor_info.building_id
     *
     * @param buildingId the value for floor_info.building_id
     *
     * @mbggenerated
     */
    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column floor_info.building_name
     *
     * @return the value of floor_info.building_name
     *
     * @mbggenerated
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column floor_info.building_name
     *
     * @param buildingName the value for floor_info.building_name
     *
     * @mbggenerated
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column floor_info.building_detail
     *
     * @return the value of floor_info.building_detail
     *
     * @mbggenerated
     */
    public String getBuildingDetail() {
        return buildingDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column floor_info.building_detail
     *
     * @param buildingDetail the value for floor_info.building_detail
     *
     * @mbggenerated
     */
    public void setBuildingDetail(String buildingDetail) {
        this.buildingDetail = buildingDetail == null ? null : buildingDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column floor_info.grid_id
     *
     * @return the value of floor_info.grid_id
     *
     * @mbggenerated
     */
    public Integer getGridId() {
        return gridId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column floor_info.grid_id
     *
     * @param gridId the value for floor_info.grid_id
     *
     * @mbggenerated
     */
    public void setGridId(Integer gridId) {
        this.gridId = gridId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column floor_info.grid_name
     *
     * @return the value of floor_info.grid_name
     *
     * @mbggenerated
     */
    public String getGridName() {
        return gridName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column floor_info.grid_name
     *
     * @param gridName the value for floor_info.grid_name
     *
     * @mbggenerated
     */
    public void setGridName(String gridName) {
        this.gridName = gridName == null ? null : gridName.trim();
    }
}