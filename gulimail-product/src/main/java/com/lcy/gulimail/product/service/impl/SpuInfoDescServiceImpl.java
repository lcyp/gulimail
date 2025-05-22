package com.lcy.gulimail.product.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lcy.common.utils.PageUtils;
import com.lcy.gulimail.product.dao.SpuInfoDescDao;
import com.lcy.gulimail.product.entity.SpuInfoDescEntity;
import com.lcy.gulimail.product.service.SpuInfoDescService;
import org.springframework.stereotype.Service;
import com.lcy.common.utils.Query;
import java.util.Map;

@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoDescEntity> page = this.page(
                new Query<SpuInfoDescEntity>().getPage(params),
                new QueryWrapper<SpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}