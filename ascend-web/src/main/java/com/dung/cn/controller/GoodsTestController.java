package com.dung.cn.controller;


import com.dung.cn.feign.GoodsFeign;
import com.dung.cn.utils.RedisUtils;
import com.dung.cn.utils.ReturnResult;
import com.dung.cn.utils.ReturnResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/goods")
public class GoodsTestController {
    @Autowired
    private GoodsFeign goodsFeign;
    @Autowired
    private RedisUtils redisUtils;

    @GetMapping(value = "/take")
    public ReturnResult goods(@RequestParam(value = "count") int count) {
        redisUtils.set("tokenDw", 147);
        int num = Integer.parseInt(String.valueOf(redisUtils.get("tokenDw"))) + goodsFeign.getGoods(count);
        return ReturnResultUtils.returnSuccess(num);
    }
}
