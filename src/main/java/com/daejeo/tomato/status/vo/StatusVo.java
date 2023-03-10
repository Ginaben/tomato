package com.daejeo.tomato.status.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class StatusVo {

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
    String tmtOrderSize;
    String tmtQlt;

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

    //invoice
    int invoiceIdx;
    int tmtBoxCnt;
    String tmtBoxStatus;
    String waybillNum;
    String shipDt;
    String shippingFee;

    //common_code
    String codeNm;
    String registDt;
    String updateDt;
}
