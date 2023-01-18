package com.daejeo.tomato.order;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface OrderMapper {


    List<Map<String, Objects>> getDual();

    //주문입력
    int orderInfoInsert(OrderReqVo orderReqVo);
    int ordererInsert(OrderReqVo orderReqVo);
    int receiverInsert(OrderReqVo orderReqVo);


}
