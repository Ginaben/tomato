package com.daejeo.tomato.status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusVo {

    //order
    int tmtOrdIdx;
    String tmtPpCd;
    String tmtPpEct;
    String tmtSizeJson;
    int orderIdx;
    int receiveIdx;
    String shipMemo;
    String cashRecptNum;
    String depositYn;
    String depositDt;
    Long salesPrice;
    String note;
    String registDt;
    String updateDt;

    //orderer info
    int ordererIdx;
    String ordererNm;
    String ordererMobile;
    String ordererAdr;
    String ordererDetailAdr;
    String ordererZipNum;

    //receiver info
    int receiverIdx;
    String receiverNm;
    String receiverMobile;
    String receiverAdr;
    String receiverDetailAdr;
    String receiverZipNum;

    //common_code
    String codeNm;
}
