package com.Rahmat;

public class Hamburger {
    private String navn;
    private String kjøtt;
    private String hamburgerbrød;
    private double pris;
private String tillegsnavn0;
private double tillegspris0;
private String tillegsnavn1;
private double tillegspris1;
private String tillegsnavn2;
private double tillegspris2;
private String tillegsnavn3;
private double tillegspris3;
public void HamTillegg0(String navn, double pris){
    this.tillegsnavn0 = navn;
    this.tillegspris0 = pris;
}
public void HamTillegg1(String navn, double pris) {
    this.tillegsnavn1 = navn;
    this.tillegspris1 = pris;
}
public void HamTillegg2(String navn, double pris) {
    this.tillegsnavn2 = navn;
    this.tillegspris2 = pris;
}
public void HamTillegg3(String navn, double pris){
        this.tillegsnavn3 = navn;
        this.tillegspris3 = pris;
    }

    public Hamburger(String navn, String kjøtt, String hamburgerbrød, double pris) {
        this.navn = navn;
        this.kjøtt = kjøtt;
        this.hamburgerbrød = hamburgerbrød;
        this.pris = pris;
    }

    public double SpesifiserHam(){
    double HamburgerPris = this.pris;
        System.out.println(this.navn+" Hamburger "+ "on a "+this.hamburgerbrød+ " roll "+ "with "+this.kjøtt+" price is "+ this.pris);
   if(this.tillegsnavn0!=null){
       HamburgerPris += this.tillegspris0;
       System.out.println("Added "+this.tillegsnavn0+ " for an extra "+this.tillegspris0);
   }
        if(this.tillegsnavn1!=null){
            HamburgerPris += this.tillegspris1;
            System.out.println("Added "+this.tillegsnavn1+ " for an extra "+this.tillegspris1);
        }
        if(this.tillegsnavn2!=null){
            HamburgerPris += this.tillegspris2;
            System.out.println("Added "+this.tillegsnavn2+ " for an extra "+this.tillegspris2);
        }
        if(this.tillegsnavn3!=null){
            HamburgerPris += this.tillegspris3;
            System.out.println("Added "+this.tillegsnavn3+ " for an extra "+this.tillegspris3);
        }
        return HamburgerPris;
    }
}
