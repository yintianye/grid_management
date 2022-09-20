package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.PartyBranchInfo;
import com.tencent.wxcloudrun.model.PartyBranchInfoExample;
import java.util.List;

public interface PartyBranchInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table party_branch_info
     *
     * @mbggenerated
     */
    int countByExample(PartyBranchInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table party_branch_info
     *
     * @mbggenerated
     */
    int insert(PartyBranchInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table party_branch_info
     *
     * @mbggenerated
     */
    int insertSelective(PartyBranchInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table party_branch_info
     *
     * @mbggenerated
     */
    List<PartyBranchInfo> selectByExample(PartyBranchInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table party_branch_info
     *
     * @mbggenerated
     */
    PartyBranchInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table party_branch_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PartyBranchInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table party_branch_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PartyBranchInfo record);
}