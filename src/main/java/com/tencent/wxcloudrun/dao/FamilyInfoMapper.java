package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.FamilyInfo;
import java.util.List;

public interface FamilyInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table family_info
     *
     * @mbggenerated
     */
    int insert(FamilyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table family_info
     *
     * @mbggenerated
     */
    FamilyInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table family_info
     *
     * @mbggenerated
     */
    List<FamilyInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table family_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FamilyInfo record);
}