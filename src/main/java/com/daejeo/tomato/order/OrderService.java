package com.daejeo.tomato.order;

import com.daejeo.tomato.order.vo.OrderReqVo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface OrderService {

    public List<Map<String, Objects>> get();
    //주문 등록
    int orderInsert(OrderReqVo orderReqVo) throws Exception;

}
