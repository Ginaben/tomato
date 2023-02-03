package com.daejeo.tomato.invoice;

import com.daejeo.tomato.invoice.mapper.InvoiceMapper;
import com.daejeo.tomato.invoice.vo.InvoiceAllVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InvoiceService {

    private final InvoiceMapper invoiceMapper;

    public List<InvoiceAllVo> getOneBoxList() {
        return invoiceMapper.getOneBoxList();
    }

    public List<InvoiceAllVo> getTwoBoxList() {
        return invoiceMapper.getTwoBoxList();
    }
}
