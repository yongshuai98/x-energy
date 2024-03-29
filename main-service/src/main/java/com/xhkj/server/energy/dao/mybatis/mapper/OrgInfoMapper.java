package com.xhkj.server.energy.dao.mybatis.mapper;

import com.xhkj.server.energy.dao.mybatis.vo.OrgInfo;
import com.xhkj.server.energy.dao.mybatis.vo.OrgInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrgInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    long countByExample(OrgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int deleteByExample(OrgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer orgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int insert(OrgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int insertSelective(OrgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    List<OrgInfo> selectByExample(OrgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    OrgInfo selectByPrimaryKey(Integer orgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrgInfo record, @Param("example") OrgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrgInfo record, @Param("example") OrgInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_org_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrgInfo record);


    ////*******自定义开始********/
    //***********自定义结束****////
}
