package com.lcy.gulimail.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lcy.common.utils.PageUtils;
import com.lcy.common.utils.Query;
import com.lcy.gulimail.product.dao.CommentReplayDao;
import com.lcy.gulimail.product.entity.CommentReplayEntity;
import com.lcy.gulimail.product.service.CommentReplayService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}