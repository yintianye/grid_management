package com.tencent.wxcloudrun.model;

public class CommunityInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community_info.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community_info.committee_id
     *
     * @mbggenerated
     */
    private Integer committeeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community_info.id
     *
     * @return the value of community_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community_info.id
     *
     * @param id the value for community_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community_info.name
     *
     * @return the value of community_info.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community_info.name
     *
     * @param name the value for community_info.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community_info.committee_id
     *
     * @return the value of community_info.committee_id
     *
     * @mbggenerated
     */
    public Integer getCommitteeId() {
        return committeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community_info.committee_id
     *
     * @param committeeId the value for community_info.committee_id
     *
     * @mbggenerated
     */
    public void setCommitteeId(Integer committeeId) {
        this.committeeId = committeeId;
    }
}