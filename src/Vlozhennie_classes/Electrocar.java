package Vlozhennie_classes;

public class Electrocar {
    private int id;

    //вложенный нестатический класс
    private class Motor{
        public void stratMotor() {
            System.out.println("Motor is starting");
        }
    }

    //статический вложенны класс
    public static class Battery {//не имеет доступа к полям электрокара
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.stratMotor();

        final int x = 1;

        class SomeClass { //имеет доступ к нестатическим полям класса электро и полям метода(final)
            public void someMethod() {
                System.out.println(id);
                System.out.println(x);
            }
        }

        System.out.println("Electocar " + id + "is starting...");
    }
}
