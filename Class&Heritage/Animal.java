package com.Rahmat;

public class Animal {
    private String Name;
    private int brain;
    private int body;
    private int wight;
    private int size;

    public Animal(String name, int brain, int body, int wight, int size) {
        Name = name;
        this.brain = brain;
        this.body = body;
        this.wight = wight;
        this.size = size;
    }
    public void eat(){
        System.out.println("Eat meat");
    }
    public void move(int speed){
        System.out.println("Moving at "+speed);
    }

    public String getName() {
        return Name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWight() {
        return wight;
    }

    public int getSize() {
        return size;
    }
}
