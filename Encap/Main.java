package com.Rahmat;

public class Main {

    public static void main(String[] args) {
Skirver skriver = new Skirver(40,true);
        System.out.println("Initial page count = "+ skriver.getPagesPrinted());
        int pagesprinted = skriver.printPages(10);
        System.out.println("Pages printed was "+pagesprinted + " Total ="+skriver.getPagesPrinted());
    }
}
