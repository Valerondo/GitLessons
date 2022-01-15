package Start;

public class StringBuilder {
    public static void main(String[] args) {
        /*String x = "hello";
        x = x.toUpperCase();//помещаем результат имьютбл(неизменяемых) объектов в переменную
        System.out.println(x);*/

        /*String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3;
        System.out.println(stringAll);*/

        /*StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        //sb.append(" friend");
        System.out.println(sb.toString());*/

        //System.out.printf("This is string, %s", "NICE"); //%s вставлет в строку строку, %d - число
        System.out.printf("String %10d \n",26);//%10 - кол-во пробелов между последним символом перед процентом и последним символом вставляемого числа/строки
        System.out.printf("String %10d \n",233333);
        System.out.printf("String %.2f",26.43567);//отображать сколько чисел после запятой
    }
}
