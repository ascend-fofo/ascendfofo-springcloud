package com.dung.cn.conf;


import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by xueqijun on 2020/4/16.
 */
@Component
public class DsPointcut {
    @Pointcut("execution(public * com.dung.cn.service.*.*(..))")
    public void selectDsPointcut(){

    }
}
