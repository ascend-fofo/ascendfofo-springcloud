package com.dung.cn.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 * �˵�Ȩ�ޱ�
 * <p>
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_menu
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SysMenu {
    /**
     * Database Column Remarks:
     * �˵�ID
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menu_id
     *
     * @mbg.generated
     */
    private Integer menuId;

    /**
     * Database Column Remarks:
     * �˵�����
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     * �˵�Ȩ�ޱ�ʶ
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.permission
     *
     * @mbg.generated
     */
    private String permission;

    /**
     * Database Column Remarks:
     * ǰ��URL
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.path
     *
     * @mbg.generated
     */
    private String path;

    /**
     * Database Column Remarks:
     * ���˵�ID
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     * Database Column Remarks:
     * ͼ��
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.icon
     *
     * @mbg.generated
     */
    private String icon;

    /**
     * Database Column Remarks:
     * VUEҳ��
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.component
     *
     * @mbg.generated
     */
    private String component;

    /**
     * Database Column Remarks:
     * ����ֵ
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     * 0-������1- �ر�
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.keep_alive
     *
     * @mbg.generated
     */
    private String keepAlive;

    /**
     * Database Column Remarks:
     * �˵����� ��0�˵� 1��ť��
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * Database Column Remarks:
     * ����ʱ��
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     * ����ʱ��
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     * �߼�ɾ�����(0--���� 1--ɾ��)
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.del_flag
     *
     * @mbg.generated
     */
    private String delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_id
     *
     * @return the value of sys_menu.menu_id
     * @mbg.generated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_id
     *
     * @param menuId the value for sys_menu.menu_id
     * @mbg.generated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.name
     *
     * @return the value of sys_menu.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.name
     *
     * @param name the value for sys_menu.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.permission
     *
     * @return the value of sys_menu.permission
     * @mbg.generated
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.permission
     *
     * @param permission the value for sys_menu.permission
     * @mbg.generated
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.path
     *
     * @return the value of sys_menu.path
     * @mbg.generated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.path
     *
     * @param path the value for sys_menu.path
     * @mbg.generated
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.parent_id
     *
     * @return the value of sys_menu.parent_id
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.parent_id
     *
     * @param parentId the value for sys_menu.parent_id
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.icon
     *
     * @return the value of sys_menu.icon
     * @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.icon
     *
     * @param icon the value for sys_menu.icon
     * @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.component
     *
     * @return the value of sys_menu.component
     * @mbg.generated
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.component
     *
     * @param component the value for sys_menu.component
     * @mbg.generated
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.sort
     *
     * @return the value of sys_menu.sort
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.sort
     *
     * @param sort the value for sys_menu.sort
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.keep_alive
     *
     * @return the value of sys_menu.keep_alive
     * @mbg.generated
     */
    public String getKeepAlive() {
        return keepAlive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.keep_alive
     *
     * @param keepAlive the value for sys_menu.keep_alive
     * @mbg.generated
     */
    public void setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.type
     *
     * @return the value of sys_menu.type
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.type
     *
     * @param type the value for sys_menu.type
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.create_time
     *
     * @return the value of sys_menu.create_time
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.create_time
     *
     * @param createTime the value for sys_menu.create_time
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.update_time
     *
     * @return the value of sys_menu.update_time
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.update_time
     *
     * @param updateTime the value for sys_menu.update_time
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.del_flag
     *
     * @return the value of sys_menu.del_flag
     * @mbg.generated
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.del_flag
     *
     * @param delFlag the value for sys_menu.del_flag
     * @mbg.generated
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}