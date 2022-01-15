package Files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.json");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
