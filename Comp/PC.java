package com.Rahmat;

public class PC {
    private Sak sak;
    private Monitor monitor;
    private Hovedkort hovedkort;

    public PC(Sak sak, Monitor monitor, Hovedkort hovedkort) {
        this.sak = sak;
        this.monitor = monitor;
        this.hovedkort = hovedkort;
    }
public void Startup(){
        sak.StartKnapp();
        tegnLogo();
}
private void tegnLogo(){
        monitor.piksel(2200, 1200, "Blue");

}
}
