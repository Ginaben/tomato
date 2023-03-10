package com.daejeo.tomato.pay.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnpaidVo {

    String registDt;
    int tmtOrdIdx;
    String tmtPpNm;
    int tmtTotalCnt;
    String ordererNm;
    String ordererMobile;
    String receiverNm;
    String receiverMobile;
    String receiverAdr;
    String shipMemo;
    String note;
    String cashRecptNum;
    String depositDt;
    Long salesPrice;
    String shipDt;
    Long shippingFee;
    String waybillNum;
    String ordererEtc;


}
