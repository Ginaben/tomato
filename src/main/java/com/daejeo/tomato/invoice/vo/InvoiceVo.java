package com.daejeo.tomato.invoice.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceVo {

    int invoiceIdx;
    int intOrdIdx;

    String waybillNum;
    String shipDt;
    String registDt;
}
