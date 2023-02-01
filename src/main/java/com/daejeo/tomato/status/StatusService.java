package com.daejeo.tomato.status;

import com.daejeo.tomato.status.vo.StatusVo;

import java.io.Serializable;
import java.util.List;

public interface StatusService extends Serializable {

    List<StatusVo> getStatusList() throws Exception;
    void insert();
}
