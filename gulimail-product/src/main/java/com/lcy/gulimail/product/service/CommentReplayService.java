package com.lcy.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcy.gulimail.product.entity.CommentReplayEntity;
import com.lcy.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-21 17:40:49
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

