package com.bahati.demo.services.impl;


import com.bahati.demo.services.BluePrinter;
import com.bahati.demo.services.ColorPrinter;
import com.bahati.demo.services.GreenPrinter;
import com.bahati.demo.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print(){

        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());

    }
}
