package com.bahati.demo.services.impl;

import com.bahati.demo.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print() {

        return "Spanish blue print";
    }
}
