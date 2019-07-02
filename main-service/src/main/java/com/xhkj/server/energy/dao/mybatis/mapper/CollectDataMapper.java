package com.xhkj.server.energy.dao.mybatis.mapper;

import com.xhkj.server.energy.dao.mybatis.vo.CollectData;
import com.xhkj.server.energy.dao.mybatis.vo.CollectDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CollectDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    long countByExample(CollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int deleteByExample(CollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int insert(CollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int insertSelective(CollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    List<CollectData> selectByExample(CollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    CollectData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CollectData record, @Param("example") CollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CollectData record, @Param("example") CollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CollectData record);


    ////*******自定义开始********/

    /**
     * 获取最大批次号
     */
    Integer getMaxBatchNumber(@Param("endTime") String endTime,
                              @Param("companyId") int companyId);

    /**
     * 获取站的实时网络信息
     */
    List<Map<String, Object>> getStationRtNwData(@Param("maxBatchNumber") Integer maxBatchNumber);

    /**
     * 报表使用 --查询每个时间段最后一条机组信息
     */
    List<CollectData> getDataByOpTimeLast(@Param("beginTime") String beginTime,
                                          @Param("endTime") String endTime,
                                          @Param("companyId") int companyId);

    List<CollectData> getDataByOpTimeFirst(@Param("beginTime") String beginTime,
                                           @Param("endTime") String endTime,
                                           @Param("companyId") int companyId);

    //***********自定义结束****////
}