package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //String separator = File.separator;
        //String path = "/Users/valeriikorzhov/Desktop/test.json";
        //File file = new File(path);
        File file = new File("test2");//файл в корне проекта
        Scanner scanner = new Scanner(file);

        /*while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }*/
        String line = scanner.nextLine();
        //String[] words = line.split(" ");
        //String[] words = line.split("\\.");
        String[] numbersString = line.split(" ");

        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
