package com.Rahmat;

public class Pakkeburger extends Hamburger {
    public Pakkeburger() {
        super("Chips", "Rådyr", "Grov", 34);
        super.HamTillegg0("XXX", 00);
        super.HamTillegg1("xxx", 000);
    }

    @Override
    public void HamTillegg0(String navn, double pris) {
        System.out.println("Kan ikke legge noe ekstra i pakken");
    }

    @Override
    public void HamTillegg1(String navn, double pris) {
        System.out.println("Kan ikke legge noe ekstra i pakken");

    }

    @Override
    public void HamTillegg2(String navn, double pris) {
        System.out.println("Kan ikke legge noe ekstra i pakken");
    }

    @Override
    public void HamTillegg3(String navn, double pris) {
        System.out.println("Kan ikke legge noe ekstra i pakken");
    }
}
