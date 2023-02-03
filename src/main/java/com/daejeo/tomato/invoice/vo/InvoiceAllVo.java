package com.daejeo.tomato.invoice.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class InvoiceAllVo {

    //invoice
    int invoiceIdx;
    int tmtBoxCnt;
    String waybillNum;
    String shipDt;

    //order
    int tmtOrdIdx;
    String tmtPpCd;
    String tmtPpEct;
    String tmtSizeJson;
    int tmtTotalCnt;
    List<Map<String,Object>> tmtSizeMap;
    int orderIdx;
    int receiveIdx;
    String shipMemo;
    String cashRecptNum;
    String depositYn;
    String depositDt;
    Long salesPrice;
    String note;

    //orderer info
    int ordererIdx;
    String ordererNm;
    String ordererMobile;

    //receiver info
    int receiverIdx;
    String receiverNm;
    String receiverMobile;
    String receiverAdr;
    String receiverDetailAdr;
    String receiverZipcode;

    //common_code
    String codeNm;
    String registDt;
    String updateDt;
}
