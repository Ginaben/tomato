package com.daejeo.tomato.status;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatusMapper {

    List<StatusVo> getStatusList();

}
