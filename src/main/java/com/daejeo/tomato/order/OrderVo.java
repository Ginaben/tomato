package com.daejeo.tomato.order;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderVo {

    int ordererIdx;
    String ordererNm;
    String ordererMobile;
    String ordererAdr;
    String ordererDetailAdr;
    String ordererZipcode;
}
