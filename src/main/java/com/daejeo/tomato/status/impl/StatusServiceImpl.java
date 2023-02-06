package com.daejeo.tomato.status.impl;

import com.daejeo.tomato.component.CommonUtils;
import com.daejeo.tomato.order.mapper.OrderMapper;
import com.daejeo.tomato.status.mapper.StatusMapper;
import com.daejeo.tomato.status.StatusService;
import com.daejeo.tomato.status.vo.StatusVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class StatusServiceImpl implements StatusService {

    private final StatusMapper statusMapper;

    private final OrderMapper  orderMapper;

    @Override
    public List<StatusVo> getStatusList() throws Exception {
        List<StatusVo> rst = statusMapper.getStatusList();
        int tmtBoxCnt = 0;
        int nowOrderIdx = rst.get(0).getTmtOrdIdx();
        for(StatusVo stv : rst){
            if(stv.getTmtSizeJson() != null && !stv.getTmtSizeJson().equals("")) {

                stv.setTmtSizeMap(CommonUtils.jsonStringToList(stv.getTmtSizeJson()));

                for(Map<String, Object> tmtKind : stv.getTmtSizeMap()){
                    String tmtSize = orderMapper.codeToNm((String)tmtKind.get("size"));
                    tmtKind.put("size", tmtSize);
                }
            }

            if(stv.getTmtOrdIdx() != nowOrderIdx){
                nowOrderIdx = stv.getTmtOrdIdx();
                tmtBoxCnt = 0;

            }
            tmtBoxCnt += stv.getTmtBoxCnt();
            stv.setTmtBoxStatus(tmtBoxCnt+"/"+stv.getTmtTotalCnt());
        }


        return rst;
    }


    @Override
    public void insert() {

    }
}
