package com.daejeo.tomato.pay;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("pay")
@AllArgsConstructor
public class PayController {

    private final PayService payService;
    
    @GetMapping("/payRegist")
    public String payRegist(HttpServletResponse response, HttpServletRequest request, Model model) {

        List<UnpaidVo> unPaidList = payService.getUnpaidList();

        model.addAttribute("unPaidList", unPaidList);

        return "/unpaid";

    }

}





