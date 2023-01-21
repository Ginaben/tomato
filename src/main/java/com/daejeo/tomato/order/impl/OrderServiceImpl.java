package com.daejeo.tomato.order.impl;

import com.daejeo.tomato.order.OrderMapper;
import com.daejeo.tomato.order.OrderReqVo;
import com.daejeo.tomato.order.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public int orderInsert(OrderReqVo orderReqVo) throws Exception{

        Integer ordererIdx = orderMapper.ordererDupCheck(orderReqVo);
        if(ordererIdx == null){
            orderMapper.ordererInsert(orderReqVo);
        } else {
            orderReqVo.setOrdererIdx(ordererIdx);
        }

        Integer receiverIdx = orderMapper.receiverDupCheck(orderReqVo);
        if(receiverIdx == null){
            orderMapper.receiverInsert(orderReqVo);
        } else {
            orderReqVo.setReceiveIdx(receiverIdx);
        }

        orderMapper.orderInfoInsert(orderReqVo);
        return 1;
    }

    @Override
    public int ordererInsert(OrderReqVo orderReqVo) throws Exception {
        return 0;
    }

    @Override
    public int receiverInsert(OrderReqVo orderReqVo) throws Exception {
        return 0;
    }

    @Override
    public int orderInfoInsert(OrderReqVo orderReqVo) throws Exception {
        return 0;
    }


}
