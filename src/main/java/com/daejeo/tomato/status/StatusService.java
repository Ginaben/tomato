package com.daejeo.tomato.status;

import java.io.Serializable;
import java.util.List;

public interface StatusService extends Serializable {

    List<StatusVo> getStatusList() throws Exception;
    void insert();
}
