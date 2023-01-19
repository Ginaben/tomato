package com.daejeo.tomato.order.impl;

import com.daejeo.tomato.order.OrderMapper;
import com.daejeo.tomato.order.OrderReqVo;
import com.daejeo.tomato.order.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    public List<Map<String, Objects>> get(){
        return orderMapper.getDual();
    }

    //주문 등록
    public int orderInsert(OrderReqVo orderReqVo) throws Exception {
        orderMapper.ordererInsert(orderReqVo);
        orderMapper.receiverInsert(orderReqVo);
        int result = orderMapper.orderInfoInsert(orderReqVo);

        return result;
    }
}
