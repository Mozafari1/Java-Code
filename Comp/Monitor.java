package com.Rahmat;

public class Monitor {
private String model;
private String produsent;
private int size;
private Vedtak opprin_vedtak;

    public Monitor(String model, String produsent, int size, Vedtak opprin_vedtak) {
        this.model = model;
        this.produsent = produsent;
        this.size = size;
        this.opprin_vedtak = opprin_vedtak;
    }
    public void piksel(int v, int w, String farge){
        System.out.println(" piksel "+v+" , "+w+ " farge "+ farge);
    }

    public String getModel() {
        return model;
    }

    public String getProdusent() {
        return produsent;
    }

    public int getSize() {
        return size;
    }

    public Vedtak getOpprin_vedtak() {
        return opprin_vedtak;
    }
}
