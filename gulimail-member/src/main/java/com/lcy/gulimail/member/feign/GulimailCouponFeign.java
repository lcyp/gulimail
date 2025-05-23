package com.lcy.gulimail.member.feign;


import com.lcy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("gulimail-coupon")
public interface GulimailCouponFeign {

    @GetMapping("coupon/coupon/member/list")
    public R memberCoupons();


}
