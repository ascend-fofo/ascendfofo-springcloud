package com.dung.cn.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ascend-springcloud-service", fallback = GoodsFeign.GoodsHystrix.class)
public interface GoodsFeign {

    @GetMapping(value = "api/goods")
    int getGoods(@RequestParam(value = "count") int count);

    @Component
    public class GoodsHystrix implements GoodsFeign {

        @Override
        public int getGoods(@RequestParam(value = "count") int count) {
            return count;
        }
    }
}
