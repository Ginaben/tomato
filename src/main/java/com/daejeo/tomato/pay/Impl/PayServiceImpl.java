package com.daejeo.tomato.pay.Impl;

import com.daejeo.tomato.pay.PayMapper;
import com.daejeo.tomato.pay.PayService;
import com.daejeo.tomato.pay.UnpaidVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PayServiceImpl implements PayService {

    private final PayMapper payMapper;

    public List<UnpaidVo> getUnpaidList() {

        return payMapper.getUnpaidList();
    }
}
