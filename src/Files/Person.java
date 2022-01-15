package Files;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -822061715152895904L;
    private String id;
    private String name;
    private int age;
    private byte type;

    //private transient String name;//transient то поле которое не хотим сериализовывать



    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " " + name;
    }
}
