package com.dung.cn.service;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author ascendfofo
 * @date 2020/5/13
 * 扩展用户信息
 */
public class AscendUser extends User {

    @ApiModelProperty(value = "用户编号", name = "id")
    @Getter
    private Integer id;

    @ApiModelProperty(value = "部门ID", name = "deptId")
    @Getter
    private Integer deptId;


    public AscendUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public AscendUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;
        this.deptId = deptId;
    }
}
