package com.zzw.serverorder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzw.serverorder.dto.SsOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<SsOrder> {
    String queryOrder();
}
