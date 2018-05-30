package com.Rahmat;

public class Sak {
    private String model;
    private String produsent;
    private String kraft;
    private Dimensjon dimensjon;

    public Sak(String model, String produsent, String kraft, Dimensjon dimensjon) {
        this.model = model;
        this.produsent = produsent;
        this.kraft = kraft;
        this.dimensjon = dimensjon;
    }
    public void StartKnapp(){
        System.out.println("Start knappen er trykket inn");
    }
    public String getModel() {
        return model;
    }

    public String getProdusent() {
        return produsent;
    }

    public String getKraft() {
        return kraft;
    }

    public Dimensjon getDimensjon() {
        return dimensjon;
    }
}
