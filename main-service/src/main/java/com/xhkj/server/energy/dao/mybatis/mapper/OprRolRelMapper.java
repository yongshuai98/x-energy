package com.xhkj.server.energy.dao.mybatis.mapper;

import com.xhkj.server.energy.dao.mybatis.vo.OprRolRel;
import com.xhkj.server.energy.dao.mybatis.vo.OprRolRelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OprRolRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    long countByExample(OprRolRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int deleteByExample(OprRolRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int insert(OprRolRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int insertSelective(OprRolRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    List<OprRolRel> selectByExample(OprRolRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    OprRolRel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OprRolRel record, @Param("example") OprRolRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OprRolRel record, @Param("example") OprRolRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OprRolRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_opr_rol_rel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OprRolRel record);


    ////*******自定义开始********/
    //***********自定义结束****////
}