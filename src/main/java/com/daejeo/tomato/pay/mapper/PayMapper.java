package com.daejeo.tomato.pay.mapper;

import com.daejeo.tomato.pay.UnpaidVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayMapper {
    List<UnpaidVo> getUnpaidList();
}
