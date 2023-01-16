package com.daejeo.tomato.pay;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PayService {

    private final PayMapper payMapper;
}
