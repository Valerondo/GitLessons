package Enum;

public class Test {
    public static void main(String[] args) {
        /*Animal animal = Animal.CAT;
        System.out.println(animal.name());*/

        //Animal cat = Animal.valueOf("CAT");
        //System.out.println(cat.getTranslation());

        Animal dog = Animal.DOG;
        System.out.println(dog.ordinal());//возращает идекс енам элемента

    }
}
