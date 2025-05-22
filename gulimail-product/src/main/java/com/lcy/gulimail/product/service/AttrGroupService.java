package com.lcy.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcy.common.utils.PageUtils;
import com.lcy.gulimail.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-21 17:40:49
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

