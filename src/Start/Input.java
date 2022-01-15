package Start;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);//new - новый объект класса Scanner, System.in - входной поток
        System.out.println("Enter something");
        //String test_s = s.nextLine(); - считывает строку
        int test_num = s.nextInt();
        System.out.println("You entered " + test_num);
    }
}
