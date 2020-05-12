package com.dung.cn.feignapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class GoodsController {

    @GetMapping(value = "goods")
    public int getGoods(@RequestParam(value = "count") int count){
        return count+2;
    }
}
