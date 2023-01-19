package com.daejeo.tomato.status;

import com.daejeo.tomato.status.impl.StatusServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("status")
@AllArgsConstructor
public class StatusController {

    private final StatusServiceImpl statusService;
    
    @GetMapping("/statusRegist")
    public String statusRegist() {

        return "/status";

    }

}





