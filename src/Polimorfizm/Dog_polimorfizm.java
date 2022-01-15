package Polimorfizm;

public class Dog_polimorfizm extends Animal_polimorfizm {
    @Override
    public void eat(){
        System.out.println("Nasledovanie.Dog is eating");
    }

    public void bark(){
        System.out.println("Nasledovanie.Dog is barking");
    }
}
