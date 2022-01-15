package Start;

public class ClassesAndObjects {
    public static void main(String[] args){

        Person person1 = new Person();
        person1.setNameAge("Alex", 5);
        person1.sayHello();
        person1.speak();
        //person1.calc_years();
        int year1 = person1.calc_years();
        System.out.println("Do pensii " + year1);

        System.out.println();

        Person person2 = new Person();
        String name2 = "Vova";
        int age = 5;
        person2.setNameAge(name2, age);
        person2.sayHello();
        //person2.speak();
        System.out.println(person2.getName() + " " + person2.getAge());
        System.out.println("Do pensii " + person2.calc_years());
    }
}

class Person{
    private String name;
    private int age;

    public void setNameAge(String userName, int userAge){
        if (userName.isEmpty()){
            System.out.println("Name is incorrect!");
        } else {
        name = userName;}

        if (userAge < 0) {
            System.out.println("Age is incorrect!");
        } else {
        age = userAge;}
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    int calc_years(){
        int year = 65-age;
        return year; //после ретурна код не пишем
    }

    void speak(){
            System.out.println(name + " " + age);
    }

    void sayHello(){
        System.out.println("Hello");
    }
}
