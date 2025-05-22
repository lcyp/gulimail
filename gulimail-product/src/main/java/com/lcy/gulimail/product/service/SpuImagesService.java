package com.lcy.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcy.gulimail.product.entity.SpuImagesEntity;
import com.lcy.common.utils.PageUtils;
import java.util.Map;

/**
 * spu图片
 *
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-21 17:40:48
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

