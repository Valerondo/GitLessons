package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных
        //char ch = 'a'; //примитивный тип данных
        //String s = "Hello"; //ссылочный тип данных
        //String s1 = new String("Hello"); //создание нового объекта класса
        //int[] numbers = {1,2,3}; //заранее создаем массив с данными
        int[] numbers = new int[5]; //ссылочный тип данных (0-4)
        //numbers[2] = 10;
        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
    }
}
