package com.daejeo.tomato.pay;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnpaidVo {

    String registDt;
    int tmtOrdIdx;
    String tmtPpNm;
    String ordererNm;
    String ordererMobile;
    String receiverNm;
    String receiverMobile;
    String receiverAdr;
    String shipMemo;
    String note;
}
