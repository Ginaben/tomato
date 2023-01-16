package com.daejeo.tomato.order;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface orderMapper {


    List<Map<String, Objects>> getDual();
}
