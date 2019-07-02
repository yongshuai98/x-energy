package com.xhkj.server.energy.dao.mybatis.mapper;

import com.xhkj.server.energy.dao.mybatis.vo.RoleItemRel;
import com.xhkj.server.energy.dao.mybatis.vo.RoleItemRelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleItemRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    long countByExample(RoleItemRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int deleteByExample(RoleItemRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int insert(RoleItemRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int insertSelective(RoleItemRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    List<RoleItemRel> selectByExample(RoleItemRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    RoleItemRel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RoleItemRel record, @Param("example") RoleItemRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RoleItemRel record, @Param("example") RoleItemRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RoleItemRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role_item_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RoleItemRel record);


    ////*******自定义开始********/
    //***********自定义结束****////
}