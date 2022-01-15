package Polimorfizm;

import Polimorfizm.Cat_polimorfizm;
import Polimorfizm.Dog_polimorfizm;

public class Test_polimorfizm {
    public static void main(String[] args) {
        /*Polimorfizm.Animal_polimorfizm animal = new Polimorfizm.Dog_polimorfizm();
        animal.eat();//вызывается метод потомка

        Polimorfizm.Dog_polimorfizm dog = new Polimorfizm.Dog_polimorfizm();
        dog.bark();
        dog.eat();*/

        Animal_polimorfizm animal = new Animal_polimorfizm();
        Dog_polimorfizm dog = new Dog_polimorfizm();
        Cat_polimorfizm cat = new Cat_polimorfizm();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal_polimorfizm animal) { //есть полиморфизм, переопределение методов на объекты других классов
        animal.eat();
    }
}
