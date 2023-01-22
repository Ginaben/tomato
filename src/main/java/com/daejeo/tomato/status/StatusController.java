package com.daejeo.tomato.status;

import com.daejeo.tomato.status.impl.StatusServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/status")
@AllArgsConstructor
@Slf4j
public class StatusController {

    private final StatusServiceImpl statusService;

    @GetMapping("/statusRegist")
    public String getStatusList(Model model) throws Exception{
        List<StatusVo> statusList =  statusService.getStatusList();
        log.info("-----------ben ------------ ", statusList);
        model.addAttribute("statusList", statusList);
        return "status";
    }

//    @GetMapping("/statusRegist")
//    public String statusRegist() {
//
//        return "/status";
//
//    }

}





