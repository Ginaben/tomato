package com.daejeo.tomato.order.impl;

import com.daejeo.tomato.component.CommonUtils;
import com.daejeo.tomato.order.mapper.OrderMapper;
import com.daejeo.tomato.order.vo.OrderReqVo;
import com.daejeo.tomato.order.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@AllArgsConstructor
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    public List<Map<String, Objects>> get(){
        return orderMapper.getDual();
    }

    @Override
    @Transactional
    public int orderInsert(OrderReqVo orderReqVo) throws Exception{

        Integer ordererIdx = orderMapper.ordererDupCheck(orderReqVo);
        log.info("30: ", ordererIdx);
        if(ordererIdx == null){
            orderMapper.ordererInsert(orderReqVo);
        } else {
            orderReqVo.setOrdererIdx(ordererIdx);
        }

        Integer receiverIdx = orderMapper.receiverDupCheck(orderReqVo);
        if(receiverIdx == null){
            orderMapper.receiverInsert(orderReqVo);
        } else {
            orderReqVo.setReceiveIdx(receiverIdx);
        }

        List<Map<String,Object>> sizeLi = new ArrayList<>();
        for(int i=0; i< orderReqVo.getTmtSizeLi().size() ; i++){
            Map<String, Object> sizeJson = new HashMap<>();
            String tmtSize = orderReqVo.getTmtSizeLi().get(i);
            Long tmtSizeCnt = orderReqVo.getTmtSizeCntLi().get(i);
            sizeJson.put("size", tmtSize);
            sizeJson.put("cnt", tmtSizeCnt);
            sizeLi.add(sizeJson);
        }
        orderReqVo.setTmtSizeJson(CommonUtils.listToJsonString(sizeLi));

        orderMapper.orderInfoInsert(orderReqVo);
        return 1;
    }

}
