package com.abhinaygarg;

public class EnhancedPrinter {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public EnhancedPrinter(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <=100){
            this.tonerLevel = (this.tonerLevel + tonerAmount > 100) ? -1 : this.tonerLevel + tonerAmount;
            return tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}

