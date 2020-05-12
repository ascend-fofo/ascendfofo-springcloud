package com.dung.cn.service;

import java.util.Map;

public interface SysUserService {
    /**
     * 分页查询用户信息,根据用户名模糊查询
     *
     * @param searchName
     * @param pageNo
     * @param pageSize
     * @return
     */
    Map showUserListMap(String searchName, int pageNo, int pageSize);
}
