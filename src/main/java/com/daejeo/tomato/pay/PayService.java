package com.daejeo.tomato.pay;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PayService {

    private final PayMapper payMapper;

    public List<UnpaidVo> getUnpaidList() {

        return payMapper.getUnpaidList();
    }
}
