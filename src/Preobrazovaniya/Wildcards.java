package Preobrazovaniya;

import Preobrazovaniya.Less32_Animal;
import Preobrazovaniya.Less32_Dog;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Less32_Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Less32_Animal(1));
        listOfAnimal.add(new Less32_Animal(2));

        List<Less32_Dog> listOfGogs = new ArrayList<>();
        listOfGogs.add(new Less32_Dog());
        listOfGogs.add(new Less32_Dog());

        test(listOfAnimal);
        test(listOfGogs);
    }

    private static void test(List<? extends Less32_Animal> list){// extends - класс и его потомки/super - класс и его родители
        for(Less32_Animal animal : list){
            animal.eat();
        }
    }
}
