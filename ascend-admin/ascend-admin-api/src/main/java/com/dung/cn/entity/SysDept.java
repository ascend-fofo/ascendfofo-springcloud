package com.dung.cn.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 * ���Ź���
 * <p>
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_dept
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SysDept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.dept_id
     *
     * @mbg.generated
     */
    private Integer deptId;

    /**
     * Database Column Remarks:
     * ��������
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     * ����
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     * ����ʱ��
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     * �޸�ʱ��
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     * �Ƿ�ɾ��  -1����ɾ��  0������
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.del_flag
     *
     * @mbg.generated
     */
    private String delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.dept_id
     *
     * @return the value of sys_dept.dept_id
     * @mbg.generated
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.dept_id
     *
     * @param deptId the value for sys_dept.dept_id
     * @mbg.generated
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.name
     *
     * @return the value of sys_dept.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.name
     *
     * @param name the value for sys_dept.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.sort
     *
     * @return the value of sys_dept.sort
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.sort
     *
     * @param sort the value for sys_dept.sort
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_time
     *
     * @return the value of sys_dept.create_time
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_time
     *
     * @param createTime the value for sys_dept.create_time
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.update_time
     *
     * @return the value of sys_dept.update_time
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.update_time
     *
     * @param updateTime the value for sys_dept.update_time
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.del_flag
     *
     * @return the value of sys_dept.del_flag
     * @mbg.generated
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.del_flag
     *
     * @param delFlag the value for sys_dept.del_flag
     * @mbg.generated
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}