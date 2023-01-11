package com.daejeo.tomato.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class service {

    private final orderMapper orderMapper;

    public int get(){

        return orderMapper.getDual();
    }
}
