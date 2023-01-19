package com.daejeo.tomato.pay;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayMapper {
    List<UnpaidVo> getUnpaidList();
}
