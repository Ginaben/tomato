package com.daejeo.tomato.invoice.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceReqVo {

    int invoiceIdx;
    int tmtOrdIdx;
    int tmtBoxCnt;
    String waybillNum;
    String shipDt;
    String registDt;
}
