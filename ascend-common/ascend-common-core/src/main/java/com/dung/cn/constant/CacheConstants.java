package com.dung.cn.constant;

/**
 * 缓存的key常量
 */
public interface CacheConstants {
    /**
     * oauth 缓存前缀
     */
    String PROJECT_OAUTH_ACCESS = "pig_oauth:access:";

    /**
     * 验证码前缀
     */
    String DEFAULT_CODE_KEY = "DEFAULT_CODE_KEY:";


    /**
     * 菜单信息缓存
     */
    String MENU_DETAILS = "menu_details";

    /**
     * 用户信息缓存
     */
    String USER_DETAILS = "user_details";

    /**
     * 字典信息缓存
     */
    String DICT_DETAILS = "dict_details";


    /**
     * oauth 客户端信息
     */
    String CLIENT_DETAILS_KEY = "pig_oauth:client:details";

}
