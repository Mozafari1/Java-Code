package com.Rahmat;

public class Hovedkort {
    private String model;
    private String produsent;
    private int ramspor;
    private int kortspor;
    private String bios;

    public Hovedkort(String model, String produsent, int ramspor, int kortspor, String bios) {
        this.model = model;
        this.produsent = produsent;
        this.ramspor = ramspor;
        this.kortspor = kortspor;
        this.bios = bios;
    }
    public void lastProgram(String prog){
        System.out.println("Program lastes nå. "+ prog);
    }

    public String getModel() {
        return model;
    }

    public String getProdusent() {
        return produsent;
    }

    public int getRamspor() {
        return ramspor;
    }

    public int getKortspor() {
        return kortspor;
    }

    public String getBios() {
        return bios;
    }
}
