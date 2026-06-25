package com.beanconcept.maven.config;

import com.beanconcept.maven.services.BluePrinter;
import com.beanconcept.maven.services.ColourPrinter;
import com.beanconcept.maven.services.GreenPrinter;
import com.beanconcept.maven.services.RedPrinter;
import com.beanconcept.maven.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
//        return new EnglishBluePrinter();
        return new NepaliBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
//        return new EnglishGreenPrinter();
        return new NepaliGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
//        return new EnglishRedPrinter();
        return new NepaliRedPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter) {
        return new ColourPrinterImpl(bluePrinter, greenPrinter, redPrinter);
    }
}
