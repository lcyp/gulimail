package com.lcy.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcy.gulimail.product.entity.SpuCommentEntity;
import com.lcy.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品评价
 *
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-21 17:40:48
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

