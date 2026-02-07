package com.bahati.demo.services.impl;

import com.bahati.demo.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print(){
        return "red";
    }
}
