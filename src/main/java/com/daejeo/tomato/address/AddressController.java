package com.daejeo.tomato.address;

import com.daejeo.tomato.address.vo.OrdererVo;
import com.daejeo.tomato.address.vo.ReceiverVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/address")
@AllArgsConstructor
@Slf4j
public class AddressController {

    private AddressService addressService;

    @GetMapping("/addressList")
    public String getAddressList(Model model) throws Exception {
        List<OrdererVo> ordererList = addressService.getOrdererList();
        List<ReceiverVo> receiverList = addressService.getReceiverList();
        model.addAttribute("orderer", ordererList);
        model.addAttribute("receiver", receiverList);
        return "addressList";
    }


}
