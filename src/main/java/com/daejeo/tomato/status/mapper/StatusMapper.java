package com.daejeo.tomato.status.mapper;

import com.daejeo.tomato.status.vo.StatusVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatusMapper {

    List<StatusVo> getStatusList();

}
