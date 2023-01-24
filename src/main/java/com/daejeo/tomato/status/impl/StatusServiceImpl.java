package com.daejeo.tomato.status.impl;

import com.daejeo.tomato.component.CommonUtils;
import com.daejeo.tomato.status.StatusMapper;
import com.daejeo.tomato.status.StatusService;
import com.daejeo.tomato.status.StatusVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class StatusServiceImpl implements StatusService {

    private final StatusMapper statusMapper;

    @Override
    public List<StatusVo> getStatusList() throws Exception {
        List<StatusVo> rst = statusMapper.getStatusList();
        for(StatusVo stv : rst){
            if(stv.getTmtSizeJson() != null && !stv.getTmtSizeJson().equals(""))
            stv.setTmtSizeMap(CommonUtils.jsonStringToMap(stv.getTmtSizeJson()));
        }
        return rst;
    }


    @Override
    public void insert() {

    }
}
