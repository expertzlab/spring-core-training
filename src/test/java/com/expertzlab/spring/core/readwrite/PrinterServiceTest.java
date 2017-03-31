package com.expertzlab.spring.core.readwrite;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gireeshbabu on 31/03/17.
 */


public class PrinterServiceTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("readwrite.xml");

    @Test
    public void testProcess(){
        PrinterService ps = (PrinterService) context.getBean("printerService");
        setScannerAndPrinter(ps);
        Assert.assertEquals("In printer - Document Returned",ps.process());
    }

    @Test
    public void testProcess1(){
        PrinterService ps = (PrinterService) context.getBean("printerService");
        setScannerAndScreen(ps);
        Assert.assertEquals("In Screen - Document Returned",ps.process());

    }

    private void setScannerAndScreen(PrinterService ps) {
        Reader reader = (Reader) context.getBean("scanner");
        Writer writer = (Writer) context.getBean("screen");
        ps.setmReader(reader);
        ps.setmWriter(writer);
    }


    private void setScannerAndPrinter(PrinterService ps) {
        Reader reader = (Reader) context.getBean("scanner");
        Writer writer = (Writer) context.getBean("printer");
        ps.setmReader(reader);
        ps.setmWriter(writer);
    }
}
