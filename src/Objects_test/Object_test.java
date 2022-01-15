package Objects_test;

public class Object_test { //все классы наслеуются от класса Object, поэтому доступны методы того класса
    public static void main (String[] args){
        String str = "Hello";
        System.out.println(str.toString()); //если в классе уже есть метод с именем метода в объекте, то будет вызываться метод из класса test_string
    }
}
class testString1 {
    private String str;

    public String toString(String str){
        this.str = str;
        return str;
    }
}
