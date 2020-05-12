package com.dung.cn.mapper;


import java.util.List;

import com.dung.cn.dto.SysDept;
import com.dung.cn.dto.SysDeptExample;
import org.apache.ibatis.annotations.Param;

public interface SysDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    long countByExample(SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int deleteByExample(SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int insert(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int insertSelective(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    List<SysDept> selectByExample(SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    SysDept selectByPrimaryKey(Integer deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysDept record, @Param("example") SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysDept record, @Param("example") SysDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysDept record);
}