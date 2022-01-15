package Files;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        //Person person1 = new Person(1, "Bob");
        //Person person2 = new Person(2, "Alex");
        //Person[] people = {new Person(1, "Bob"), new Person(2, "Alex"), new Person(3, "Mike")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //1
            /*oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }*/

            //2

            //oos.writeObject(people);//запись массива

            /*oos.writeObject(person1);
            oos.writeObject(person2);*/

            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
