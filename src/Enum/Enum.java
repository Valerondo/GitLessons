package Enum;

public class Enum {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation()); // кошка
        System.out.println(animal.toString()); // CAT

        /*switch (animal) {
            case CAT:
                System.out.println("cat");
                break;
            case DOG:
                System.out.println("dog");
                break;
            case FROG:
                System.out.println("frog");
                break;
            default:
                System.out.println("other");
                break;
        }*/
    }
}
