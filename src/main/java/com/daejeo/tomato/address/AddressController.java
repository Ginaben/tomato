package com.daejeo.tomato.address;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
@AllArgsConstructor
@Slf4j
public class AddressController {

    private AddressService addressService;

    @GetMapping("/addressList")
    public String getAddressList(){
        return "addressList";
    }


}
