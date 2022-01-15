package Nasledovanie;

import Nasledovanie.Animal;

public class Dog extends Animal {

    public void eat(){
        System.out.println("Nasledovanie.Dog is eating");
    }

    public void bark() {
        System.out.println("I am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}
