package com.daejeo.tomato.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Service
public class service {

    private final orderMapper orderMapper;

    public List<Map<String, Objects>> get(){

        return orderMapper.getDual();
    }
}
