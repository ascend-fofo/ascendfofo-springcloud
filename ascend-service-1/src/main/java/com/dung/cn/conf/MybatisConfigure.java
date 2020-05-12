package com.dung.cn.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dung.cn.mapper")
public class MybatisConfigure {
}
