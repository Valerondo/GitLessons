package Loops;

public class Break_Continue {
    public static void main(String [] args){
        int i = 0;
        while(true){
            if (i == 15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Exit from loop");

        for (int a = 0; a <= 15; a++){
            if (a%2 == 0){ //остаток от деления
                continue;
            }
            System.out.println("This is odd number" + a);
        }
    }
}
