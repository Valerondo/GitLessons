package Exception_less;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        /*File file = new File("test2");//файл в корне проекта
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Ок");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("После эксепшена");*/

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в main'е");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test1");//файл в корне проекта
        Scanner scanner = new Scanner(file);
    }
}
