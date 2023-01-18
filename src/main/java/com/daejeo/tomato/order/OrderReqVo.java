package com.daejeo.tomato.order;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderReqVo {
    //orderInfo
    int tmtOrderIdx;
    String tmtPpCd;
    String tmtPpEct;
    String tmtSizeJson;
    int orderIdx;
    int receiveIdx;
    String shipMemo;
    String cashRecptNum;
    String depositYn;
    String depositDt;
    String salesPrice;
    String note;
    String registDt;
    String updateDt;

    //orderer info
    int ordererIdx;
    String ordererNm;
    String ordererNumber;
    String ordererAdr;
    String ordererDetailAdr;
    String ordererZipNum;

    //receiver info
    int receiverIdx;
    String receiverrNm;
    String receiverPhone;
    String receiverAdr;
    String receiverDetailAdr;
    String receiverZipNum;

}
