package Files;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject_1 {
    public static void main(String[] args) {
        //Person person1 = new Person(1, "Bob");
        //Person person2 = new Person(2, "Alex");
        Person[] people = {new Person("Bob1", "Bob2"), new Person("Alex1", "Alex2"), new Person("Mike1", "Mike2")};

        try {
            FileOutputStream fos = new FileOutputStream("people.json");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);//запись массива


            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
