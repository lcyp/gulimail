package com.lcy.gulimail.coupon.dao;

import com.lcy.gulimail.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-22 19:51:45
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
