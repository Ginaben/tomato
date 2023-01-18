package com.daejeo.tomato.invoice;

import com.daejeo.tomato.component.ExcelUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
@AllArgsConstructor
@Slf4j
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping("/invoiceRegist")
    public void invoiceRegist() {

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
                new String[][]{new String[] {"주문번호","운송장번호","주소",
                        "매칭카테고리(사용자)(변경불가)","쇼핑몰 카테고리(변경불가)","제목",
                        "사용여부"}},
                new String[]{
                        "order_idx","invoice_idx","address","category_name","mall_category_name","title",
                        "use_yn"
                }
        );

        if (file == null) {
            throw new Exception("파일을 생성 할 수 없습니다.");
        } else {
            String fileName = "[쇼핑몰카테고리정보]엑셀 파일 다운로드.xlsx";

            ExcelUtils.downloadFile(request, response, file, fileName);
        }
    }

}





