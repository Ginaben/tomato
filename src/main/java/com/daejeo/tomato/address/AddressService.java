package com.daejeo.tomato.address;

import com.daejeo.tomato.address.vo.OrdererVo;
import com.daejeo.tomato.address.vo.ReceiverVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class AddressService {

    private final AddressMapper addressMapper;

    public List<OrdererVo> getOrdererList() throws Exception {
        return addressMapper.getOrdererList();
    }

    public List<ReceiverVo> getReceiverList() throws Exception {
        return addressMapper.getReceiverList();
    }
}
