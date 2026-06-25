package com.beanconcept.maven.services.impl;

import com.beanconcept.maven.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "Green";
    }
}
