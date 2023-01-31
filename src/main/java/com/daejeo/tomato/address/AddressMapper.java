package com.daejeo.tomato.address;

import com.daejeo.tomato.address.vo.OrdererVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {

    List<OrdererVo> getOrdererList();
}
