package Equals_StringPool;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x==y);//сравнение только для примитивных типов данных

        System.out.println("_______________");

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        //System.out.println(animal1 == animal2);//сравнение ссылок на объекты, а не самих объектов
        System.out.println(animal1.equals(animal2));//сравнение ссылок на объекты, а не самих объектов/сравниваем структурно если переопределяем метод

        //Object object = new Object();
        //object.equals();
        System.out.println("_______________");

        String string1 = "Hello";
        String string2 = "Hello33";

        System.out.println(string1.equals(string2));

    }
}

class Animal {
    private int id;

    public Animal (int id){
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}