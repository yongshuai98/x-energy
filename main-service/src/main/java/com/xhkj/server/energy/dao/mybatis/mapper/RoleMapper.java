package com.xhkj.server.energy.dao.mybatis.mapper;

import com.xhkj.server.energy.dao.mybatis.vo.Role;
import com.xhkj.server.energy.dao.mybatis.vo.RoleExample;
import com.xhkj.server.energy.page.BootstrapTableParams;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Role record);


    ////*******自定义开始********/
    List<Role> getAll(BootstrapTableParams params);

    Role getById(@Param("roleId") String roleId);

    void deleteRoleItemRelByRoleId(String roleId);

    Integer insertRoleItemRel(List<Map<String, Object>> list);

    Integer deleteByRoleId(String roleId);

    void deleteRoleOprRelByRoleId(String roleId);

    List<Role> getRoleByOprId(String oprId);
    //***********自定义结束****////
}
