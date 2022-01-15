package Start;

public class Les20_Constructors {
    public static void main(String[] args){
        Human1 h1 = new Human1("Alex", 7);//если задаем значение, то джава сама понимает какой метод вызыввать
        Human1 h2 = new Human1("Bob", 10);
        //Start.Human1.description = "Nice"; //общая переменная для всех объектов класса хуман1, позволяет не создавать объект
        //Start.Human1.getDescription();
        //System.out.println(Math.pow(2,4));//статические методы не требуют создания объекта класса с переменными
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();

    }
}

class Human1 {

    String name;
    int age;

    private static int countPeople;
    public static String description;


    public Human1(){ //конструктор, имеет имя класса
        //System.out.println("Hello from 1st const");
        this.name = "Bob";
        this.age = 43;
        System.out.println(name+" "+age);
    }

    public Human1(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
        //System.out.println(name+" "+age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public static void getDescription(){
        System.out.println(description);
    }*/

    public void getAllFields(){
        System.out.println(name + " " + age + " " + description);
    }

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}