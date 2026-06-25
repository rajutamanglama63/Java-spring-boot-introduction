package com.beanconcept.maven;

import com.beanconcept.maven.services.ColourPrinter;
import com.beanconcept.maven.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class BeanConceptsApplication implements CommandLineRunner {

    private ColourPrinter colourPrinter;

    // Spring injects the ColourPrinter bean here (constructor injection).
    // The bean is created by PrinterConfig.colourPrinter() and registered in the IoC container;
    // we do not call `new` ourselves — Spring resolves the dependency and passes the bean in.
    public BeanConceptsApplication(ColourPrinter colourPrinter) {
        this.colourPrinter = colourPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanConceptsApplication.class, args);
    }

    @Override
    public void run(final String @NonNull ... args) {
//        Before bean implementation
//        final ColourPrinter colourPrinter = new ColourPrinterImpl();
        log.info(colourPrinter.print());
    }
}
