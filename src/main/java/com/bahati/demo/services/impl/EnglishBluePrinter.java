package com.bahati.demo.services.impl;

import com.bahati.demo.services.BluePrinter;
import com.bahati.demo.services.RedPrinter;
import org.springframework.stereotype.Component;

public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print(){
        return "blue";
    }
}
