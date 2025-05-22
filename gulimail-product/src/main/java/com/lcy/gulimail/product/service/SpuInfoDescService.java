package com.lcy.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcy.gulimail.product.entity.SpuInfoDescEntity;
import com.lcy.common.utils.PageUtils;
import java.util.Map;

/**
 * spu信息介绍
 *
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-21 17:40:49
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

