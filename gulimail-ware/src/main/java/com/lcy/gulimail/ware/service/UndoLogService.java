package com.lcy.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcy.common.utils.PageUtils;
import com.lcy.gulimail.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-22 20:16:30
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

