package com.beanconcept.maven.services.impl;

import com.beanconcept.maven.services.BluePrinter;
import com.beanconcept.maven.services.ColourPrinter;
import com.beanconcept.maven.services.GreenPrinter;
import com.beanconcept.maven.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private BluePrinter bluePrinter;

    private GreenPrinter greenPrinter;

    private RedPrinter redPrinter;

//    Before bean implementation
//    public ColourPrinterImpl() {
//        this.bluePrinter = new EnglishBluePrinter();
//        this.greenPrinter = new EnglishGreenPrinter();
//        this.redPrinter = new EnglishRedPrinter();
//    }


//  After bean implementation — Spring injects BluePrinter, GreenPrinter, and RedPrinter
//  beans into PrinterConfig.colourPrinter(); that @Bean method passes them here when it
//  creates this object (we no longer call `new` on the printer implementations ourselves).
    public ColourPrinterImpl(BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter) {
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", bluePrinter.print(), greenPrinter.print(), redPrinter.print());
    }
}
