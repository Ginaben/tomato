package com.daejeo.tomato.invoice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InvoiceService {

    private final InvoiceMapper invoiceMapper;
}
