package com.Rahmat;

public class Skirver {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Skirver(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1&& tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0&& tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100) {
                return -1;
            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint/=2;
            System.out.println("Duplex mode");
        }
        this.pagesPrinted+= pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}