package com.lcy.gulimail.product.dao;

import com.lcy.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-21 17:40:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
