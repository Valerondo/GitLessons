package Anonim_classes;

class Animal35 {
    public void eat() {
        System.out.println("Nasledovanie.Animal is eating");
    }
}

public class Less35_Test {
    public static void main(String[] args) {

        Animal35 animal2 = new Animal35() {
            public void eat(){
                System.out.println("Other animals is eating");
            }
        };

        animal2.eat();
    }
}
