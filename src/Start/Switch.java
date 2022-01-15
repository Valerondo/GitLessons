package Start;//Оператор для перебора условий (вместо кучи IFов)

import java.util.Scanner;

public class Switch {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        switch (age){
            case 0 :
                System.out.println("Birthday " + age);
                break;
            case 7 :
                System.out.println("School " + age);
                break;
            case 18 :
                System.out.println("18+ " + age);
                break;
            default:
                System.out.println("Other"); //Ниодно условие не подошло
        }
    }
}
