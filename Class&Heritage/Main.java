package com.Rahmat;

public class Main {

    public static void main(String[] args) {
    Animal animal = new Animal("Animal",1,1,5,4);
    Dog dog = new Dog("Pope", 5, 4,2,4,1,10,"Unknown");
    dog.eat();
    dog.move(5);
    dog.walk();
    dog.run();
    Fish fish =new Fish("Lax",1, 1, 10, 3, 7, 2,4);
    fish.move(23);
    fish.rest();
fish.moveBackFin();
fish.swim(4);
fish.moveMuscles();
    }

}
