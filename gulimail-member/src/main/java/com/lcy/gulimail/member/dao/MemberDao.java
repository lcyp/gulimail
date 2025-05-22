package com.lcy.gulimail.member.dao;

import com.lcy.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liangchenyang
 * @email sunlightcs@gmail.com
 * @date 2025-05-22 20:01:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
