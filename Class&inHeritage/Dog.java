package com.Rahmat;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,int wight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, wight, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    public void chew(){
        System.out.println("chews sausage");
    }

    @Override
    public void eat() {
        System.out.println("Eat apple");
        chew();
        super.eat();
    }
    public void walk(){
        move(3);
        System.out.println(" km/h");
    }
    public void run(){
    move(6);
        System.out.println(" km/h");

    }
    private void moveLegs(int speed){
        System.out.println("Movlegs was called");

    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }
}
