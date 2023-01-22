package com.daejeo.tomato.invoice;

import com.daejeo.tomato.component.ExcelUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("invoice")
@AllArgsConstructor
@Slf4j
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping("/invoiceExport")
    public String invoiceExport(HttpServletRequest request, HttpServletResponse response, Model model) {

//        model.addAttribute("",);

        return "/exportInvoice";
    }

    @GetMapping("/invoiceRegist")
    public String invoiceRegist(HttpServletRequest request, HttpServletResponse response, Model model) {

//        model.addAttribute("",);

        return "/registerInvoice";
    }

    @GetMapping("/excelDownload")
    @ResponseBody
    public void excelDownload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.info("통신 테스트");
        List<Map<String, Object>> results  = new ArrayList<>();

        Map<String, Object> a = new HashMap<>();
        a.put("order_idx",1);
        a.put("invoice_idx",11111);
        a.put("address","잠실동 212-24 2층");
        results.add(a);

        File file = ExcelUtils.exportExcel(
                results,
                new String[][]{new String[] {"주문번호","토마토품질","수량",
                        "받는분","받는분연락처","배송지", "배송메세지"}},
                new String[]{
                        "order_idx","invoice_idx","address","category_name","mall_category_name","title",
                        "use_yn"
                }
        );

        if (file == null) {
            throw new Exception("파일을 생성 할 수 없습니다.");
        } else {
            String fileName = "운송장 폼.xlsx";

            ExcelUtils.downloadFile(request, response, file, fileName);
        }
    }

}





