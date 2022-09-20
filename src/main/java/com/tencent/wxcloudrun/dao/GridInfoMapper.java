package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.GridInfo;
import com.tencent.wxcloudrun.model.GridInfoExample;
import java.util.List;

public interface GridInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grid_info
     *
     * @mbggenerated
     */
    int countByExample(GridInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grid_info
     *
     * @mbggenerated
     */
    int insert(GridInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grid_info
     *
     * @mbggenerated
     */
    int insertSelective(GridInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grid_info
     *
     * @mbggenerated
     */
    List<GridInfo> selectByExample(GridInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grid_info
     *
     * @mbggenerated
     */
    GridInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grid_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GridInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grid_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GridInfo record);
}