package com.daejeo.tomato.invoice;

import com.daejeo.tomato.component.ExcelUtils;
import com.daejeo.tomato.invoice.vo.InvoiceAllVo;
import com.daejeo.tomato.status.vo.StatusVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.InputStream;
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
        List<InvoiceAllVo> getOneBoxList = invoiceService.getOneBoxList();
        List<InvoiceAllVo> getTwoBoxList = invoiceService.getTwoBoxList();

        model.addAttribute("one", getOneBoxList);
        model.addAttribute("two", getTwoBoxList);

        return "exportInvoice";
    }

    @GetMapping("/invoiceRegist")
    public String invoiceRegist(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<InvoiceAllVo> getUnregistInvoiceList = invoiceService.getUnregistInvoiceList();
        model.addAttribute("unRegist", getUnregistInvoiceList);
        return "registerInvoice";
    }

    @GetMapping("/excelDownload")
    @ResponseBody
    public void excelDownload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.info("?????? ?????????");
        List<Map<String, Object>> results  = new ArrayList<>();

        Map<String, Object> a = new HashMap<>();
        a.put("order_idx",1);
        a.put("invoice_idx",11111);
        a.put("address","????????? 212-24 2???");
        results.add(a);

        File file = ExcelUtils.exportExcel(
                results,
                new String[][]{new String[] {"????????????","???????????????","??????",
                        "?????????","??????????????????","?????????", "???????????????"}},
                new String[]{
                        "order_idx","invoice_idx","address","category_name","mall_category_name","title",
                        "use_yn"
                }
        );

        if (file == null) {
            throw new Exception("????????? ?????? ??? ??? ????????????.");
        } else {
            String fileName = "????????? ???.xlsx";

            ExcelUtils.downloadFile(request, response, file, fileName);
        }
    }

    @PostMapping("/excel/read")
    public String readExcel(@RequestParam("file") MultipartFile file, Model model) throws Exception{
        List<Map<String,Object>> dataList = new ArrayList<>();

        try (InputStream is = file.getInputStream();) {

            Workbook workbook = WorkbookFactory.create(is);
//            Workbook workbook = new XSSFWorkbook(file.getInputStream());

            Sheet worksheet = workbook.getSheetAt(0);

            String atchFileId = null;

            for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) { // 1?????? ????????? ?????????
                Row row = worksheet.getRow(i);

                Map<String,Object> data = new HashMap<>();
                for(int j = 0 ; j < row.getPhysicalNumberOfCells();j++){
                    data.put(j+"",row.getCell(j));
                }

                dataList.add(data);

                System.out.println(data);
            }

            model.addAttribute("list", dataList);

        } catch (Exception e) {
          e.printStackTrace();
        }

        return "/order";
    }

}





