package com.Rahmat;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int wight, int size, int gills, int eyes, int fins) {
        super(name, 1, 1, wight, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    public void rest(){
        System.out.println("rest().called");
    }
    public void moveMuscles(){
        System.out.println("movemuscles().called");

    }
    public void moveBackFin(){
        System.out.println("movebackfin().called");

    }
    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        rest();
        super.move(speed);
    }

}
