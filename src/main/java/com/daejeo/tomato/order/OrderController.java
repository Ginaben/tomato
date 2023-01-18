package com.daejeo.tomato.order;

import com.daejeo.tomato.order.dto.testDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService OrderService;

    @GetMapping("/orderRegister")
    public String index(Model model){


        model.addAttribute("num", OrderService.get());


        return "/orderRegister";
    }

    @PostMapping("/order/regist")
    public String orderRegist(testDto testDto1, Model m) {
        log.info(testDto1.getTesta());
        log.info(testDto1.getTestb());
        log.info(testDto1.getTestc());
        m.addAttribute("num", "success");

        return "redirect:/order";

    }

}
