package com.daejeo.tomato.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class controller {

    private final service service;

    @GetMapping("/orderRegister")
    public String index(Model model){


        model.addAttribute("num", service.get());


        return "/orderRegister";
    }
}
