package com.dung.cn.conf;

import com.dung.cn.utils.AspectUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by xueqijun on 2020/4/16.
 */
@Component
@Aspect
public class DSSelectorImpl {
    @Before("com.dung.cn.conf.DsPointcut.selectDsPointcut()")
    public void chageDS(JoinPoint joinPoint) throws Exception {
        /*
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Method realMethod = joinPoint.getTarget().getClass().getDeclaredMethod(signature.getName(),method.getParameterTypes());
        */
        Method realMethod = AspectUtil.INSTANCE.getMethod(joinPoint);
        DSSelector dataSourceSelector = realMethod.getAnnotation(DSSelector.class);
        if(null == dataSourceSelector){return;}
        MultipleDataSourceHelper.set(dataSourceSelector.value());
    }
}
