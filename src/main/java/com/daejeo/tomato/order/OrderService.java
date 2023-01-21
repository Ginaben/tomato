package com.daejeo.tomato.order;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface OrderService {

    public List<Map<String, Objects>> get();
    //주문 등록
    int orderInsert(OrderReqVo orderReqVo) throws Exception;
     int ordererInsert(OrderReqVo orderReqVo) throws Exception;
     int receiverInsert(OrderReqVo orderReqVo) throws Exception;
     int orderInfoInsert(OrderReqVo orderReqVo) throws Exception;

}
