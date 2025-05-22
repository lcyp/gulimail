package com.lcy.gulimail.product;

import com.lcy.gulimail.product.entity.BrandEntity;
import com.lcy.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        boolean b = brandService.removeById(1L);
        System.out.println(b);
    }

}
