package Start;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        ////////////// do 5 java //////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");//1
        animals.add("frog");

        String animal = (String) animals.get(1);//downcasting
        System.out.println(animal);

        ////////// posle 5 java ///////////
        //List<String> animals2 = new ArrayList<String>();
        List<String> animals2 = new ArrayList<>();//posle java 7
        animals2.add("cat");
        animals2.add("dog");//1
        animals2.add("frog");

        String animal2 = animals2.get(2);
        System.out.println(animal2);
    }
}
