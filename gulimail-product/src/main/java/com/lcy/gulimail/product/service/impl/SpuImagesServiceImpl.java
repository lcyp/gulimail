package com.lcy.gulimail.product.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lcy.common.utils.PageUtils;
import com.lcy.gulimail.product.dao.SpuImagesDao;
import com.lcy.gulimail.product.entity.SpuImagesEntity;
import com.lcy.gulimail.product.service.SpuImagesService;
import org.springframework.stereotype.Service;
import com.lcy.common.utils.Query;
import java.util.Map;

@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

        return new PageUtils(page);
    }

}