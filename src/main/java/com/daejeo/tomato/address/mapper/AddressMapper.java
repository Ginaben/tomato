package com.daejeo.tomato.address.mapper;

import com.daejeo.tomato.address.vo.OrdererVo;
import com.daejeo.tomato.address.vo.ReceiverVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {

    List<OrdererVo> getOrdererList();
    List<ReceiverVo> getReceiverList();
}
