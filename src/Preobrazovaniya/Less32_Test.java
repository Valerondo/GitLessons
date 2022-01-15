package Preobrazovaniya;

import Preobrazovaniya.Less32_Animal;
import Preobrazovaniya.Less32_Dog;

public class Less32_Test {
    public static void main(String[] args) {
        /*//Nasledovanie.Animal animal = new Nasledovanie.Dog(); //восходящее преобразование (норм, собака всегда живтное)
        //Upcasting
        Preobrazovaniya.Less32_Dog dog = new Preobrazovaniya.Less32_Dog();
        Preobrazovaniya.Less32_Animal animal = dog;

        //Downcasting - нисходящее преобразование - небезопасно(животное не всегда собака)
        Preobrazovaniya.Less32_Dog dog2 = (Preobrazovaniya.Less32_Dog) animal;
        dog2.bark();*/

        Less32_Animal a =  new Less32_Animal();
        Less32_Dog dog = (Less32_Dog) a;
        //dog.bark();//не будет работать
    }
}
