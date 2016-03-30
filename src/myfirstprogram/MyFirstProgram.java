package myfirstprogram;

import objects1.*;
import printclasses.PaperFormat;
import printclasses.Printer;

public class MyFirstProgram {

    public static void main(String[] args) {

//        Computer comp1 = new Computer("IBM", true);
//        Computer comp2 = new Computer("Apple", false);
//        IPad ipad1 = new IPad("IPad",true);
//        Notebook nb = new Notebook("ACER", true);
//        Monitor monitor = new Monitor();
//        
//        
//        comp1.getInfo();
//        comp1.on();
//        comp1.writeCd();
//        comp1.off();
//        
//        
//        //-----
//        
//        comp2.getInfo();
//        comp2.on();
//        comp2.writeCd();
//        comp2.off();
//        
//        //-----
//        
//        ipad1.getInfo();
//        ipad1.on();
//        ipad1.wifiOn();
//        ipad1.touchPadOn();
//        ipad1.hasLoginAppStore();
//        ipad1.writeCd();
//        ipad1.wifiOff();
//        ipad1.touchPadOff();
//        ipad1.off();
//        
//        //-----
//        
//        
//        nb.getInfo();
//        nb.on();
//        nb.wifiOn();
//        nb.touchPadOn();
//        nb.writeCd();
//        nb.touchPadOff();
//        nb.wifiOff();
//        nb.off();
//        
//        
//        //-----
//        
//        monitor.connectDevice(comp2);
//        monitor.connectDevice(ipad1);
//        monitor.connectDevice(nb);
//        monitor.connectDevice(comp1);
//        
//        
        
        
    Printer printer = new Printer();
    printer.print(PaperFormat.A5, "1112332213213");
    printer.print(PaperFormat.A4, "123213123123123123123");
    printer.print(PaperFormat.A5, "12345");
    
    

        
        
    }
    
}
