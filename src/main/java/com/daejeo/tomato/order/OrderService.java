package com.daejeo.tomato.order;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class OrderService {

    private final OrderMapper orderMapper;

    public List<Map<String, Objects>> get(){

        return orderMapper.getDual();
    }

    //주문 입력

}
