package com.dung.cn.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "user对象", description = "user对象实体类")
public class SysUserVo extends BaseRowModel implements Serializable {

    private Integer userId;


    @ExcelProperty(value = "用户名", index = 0)
    @ApiModelProperty(value = "用户名", name = "username")
    private String username;


    @ExcelProperty(value = "密码", index = 1)
    @ApiModelProperty(value = "密码", name = "password")
    private String password;


    @ExcelProperty(value = "随机盐", index = 2)
    @ApiModelProperty(value = "随机盐", name = "salt")
    private String salt;


    @ExcelProperty(value = "部门ID", index = 3)
    @ApiModelProperty(value = "部门ID", name = "deptId")
    private Integer deptId;


    @ExcelProperty(value = "创建时间", index = 4)
    @ApiModelProperty(value = "创建时间", name = "createTime")
    private Date createTime;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "修改时间", index = 5)
    @ApiModelProperty(value = "修改时间", name = "updateTime")
    private Date updateTime;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "是否锁定", index = 6)
    @ApiModelProperty(value = "是否锁定", name = "lockFlag")
    private String lockFlag;


    @ExcelProperty(value = "是否删除", index = 7)
    @ApiModelProperty(value = "是否删除", name = "delFlag")
    private String delFlag;

}
