package com.bahati.demo.services.impl;

import com.bahati.demo.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override

    public String print() {
        return "green";
    }
}
