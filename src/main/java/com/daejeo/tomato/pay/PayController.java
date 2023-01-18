package com.daejeo.tomato.pay;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/pay")
@AllArgsConstructor
public class PayController {

    private final PayService payService;
    
    @PostMapping("/payRegist")
    public void payRegist() {

    }

}





