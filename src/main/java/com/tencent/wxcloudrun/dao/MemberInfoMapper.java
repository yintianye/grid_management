package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.MemberInfo;
import java.util.List;

public interface MemberInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated
     */
    int insert(MemberInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated
     */
    MemberInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated
     */
    List<MemberInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MemberInfo record);
}