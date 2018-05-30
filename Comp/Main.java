package com.Rahmat;

public class Main {

    public static void main(String[] args) {
Dimensjon dimensjon = new Dimensjon(30, 50, 4);
Sak sak = new Sak("core 8900", "Asus", "3,56 HZ", dimensjon);
Monitor monitor= new Monitor("IO8475", "Asus", 16, new Vedtak(2505, 3434));
    Hovedkort hovedkort = new Hovedkort("BO3445", "Dell", 4,8,"r5.43");
    PC pc = new PC(sak, monitor, hovedkort);
    pc.Startup();
    }
}
