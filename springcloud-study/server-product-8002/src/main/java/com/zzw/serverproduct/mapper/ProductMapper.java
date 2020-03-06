package com.zzw.serverproduct.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzw.serverproduct.dto.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
