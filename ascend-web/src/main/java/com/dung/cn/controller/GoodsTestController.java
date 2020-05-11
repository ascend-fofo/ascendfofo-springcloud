package com.dung.cn.controller;


import com.dung.cn.feign.GoodsFeign;
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

    @GetMapping(value = "/take")
    public int goods(@RequestParam(value = "count") int count){
        return goodsFeign.getGoods(count);
    }
}
