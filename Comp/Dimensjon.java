package com.Rahmat;

public class Dimensjon {
    private int bredde;
    private  int høyde;
    private int dypde;

    public Dimensjon(int bredde, int høyde, int dypde) {
        this.bredde = bredde;
        this.høyde = høyde;
        this.dypde = dypde;
    }

    public int getBredde() {
        return bredde;
    }

    public int getHøyde() {
        return høyde;
    }

    public int getDypde() {
        return dypde;
    }
}
