package com.daejeo.tomato.status;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/status")
@AllArgsConstructor
public class SatatusController {

    private final SatatusService satatusService;
    
    @PostMapping("/statusRegist")
    public void statusRegist() {

    }

}





