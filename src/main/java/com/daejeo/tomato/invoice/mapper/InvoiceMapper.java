package com.daejeo.tomato.invoice.mapper;

import com.daejeo.tomato.invoice.vo.InvoiceAllVo;
import com.daejeo.tomato.invoice.vo.InvoiceReqVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InvoiceMapper {

    int invoiceListInsert(InvoiceReqVo invoiceReqVo);

    List<InvoiceAllVo> getOneBoxList();
    List<InvoiceAllVo> getTwoBoxList();
}
