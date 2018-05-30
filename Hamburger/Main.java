package com.Rahmat;

public class Main {

    public static void main(String[] args) {
Hamburger hamburger = new Hamburger("Chess", "Storfe", "white",25);
double pris = hamburger.SpesifiserHam();
hamburger.HamTillegg0("Kyllingburger", 5.45);
hamburger.HamTillegg1("Kalvburger", 8.98);
hamburger.HamTillegg2("Sauburger", 15);
hamburger.HamTillegg3("Fiskeburger", 13.89);
        System.out.println("Totalt: "+hamburger.SpesifiserHam());
SunnBurger sunnBurger = new SunnBurger("Gold fish", 32);
sunnBurger.burtill0("Geit", 43);
sunnBurger.burtill1("Elg", 23);

        System.out.println("Totalt: "+sunnBurger.SpesifiserHam());

        Pakkeburger pakkeburger = new Pakkeburger();
        pakkeburger.HamTillegg0("ku", 23);
        double pb = pakkeburger.SpesifiserHam();
    }

}
