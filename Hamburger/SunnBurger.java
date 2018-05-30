package com.Rahmat;

public class SunnBurger extends Hamburger {
    private String burbernavn0;
    private double burgerpris0;
    private String burgernavn1;
    private double burgerpris1;
    public SunnBurger(String kjøtt, double pris){
        super("Sunn ", kjøtt,"Brown fine", pris);
    }
    public void burtill0(String navn, double pris){
        this.burbernavn0 = navn;
        this.burgerpris0 = pris;
    }
     public void burtill1(String navn, double pris){
        this.burgernavn1 = navn;
        this.burgerpris1 = pris;
    }

    @Override
    public double SpesifiserHam() {
        double hampris=super.SpesifiserHam();
        if(this.burbernavn0!=null){
            hampris += this.burgerpris0;
            System.out.println("Added "+ this.burbernavn0+" for an extra "+ this.burgerpris0);
        }if(this.burgernavn1!=null){
            hampris += this.burgerpris1;
            System.out.println("Added "+ this.burgernavn1+" for an extra "+ this.burgerpris1);

        }
        return hampris;
    }
}
