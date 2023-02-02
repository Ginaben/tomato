package com.daejeo.tomato.invoice.mapper;

import com.daejeo.tomato.invoice.vo.InvoiceReqVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InvoiceMapper {

    int invoiceListInsert(InvoiceReqVo invoiceReqVo);
}
