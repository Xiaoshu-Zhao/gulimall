package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author Xiaoshu Zhao
 * @email pittiexiaoshuzhao@gmail.com
 * @date 2023-12-16 20:50:54
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
