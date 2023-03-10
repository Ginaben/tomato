package com.daejeo.tomato.order.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderReqVo {
    //orderInfo
    int tmtOrdIdx;
    String tmtPpCd;
    String tmtPpEct;
    List<String> tmtSizeLi;
    List<Long> tmtSizeCntLi;
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
    int tmtTotalCnt;

    //orderer info
    int ordererIdx;
    String ordererNm;
    String ordererMobile;
    String ordererAdr;
    String ordererDetailAdr;
    String ordererZipcode;

    //receiver info
    int receiverIdx;
    String receiverNm;
    String receiverMobile;
    String receiverAdr;
    String receiverDetailAdr;
    String receiverZipcode;

}
