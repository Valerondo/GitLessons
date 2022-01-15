package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        int value;
        do {
            System.out.println("Enter 5");
            value = scan.nextInt();
        } while (value != 5);
        System.out.println("You entered 5!");
    }
}
