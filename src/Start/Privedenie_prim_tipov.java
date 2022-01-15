package Start;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Privedenie_prim_tipov {
    public static void main(String[] args) {
        /*byte x = 23;
        long y = 123;
        double z = 12.3;
        float w = 12.2f;*/

        //float f = 123.2f;
       // long y = 1237667866688L;

        int a = 123;

        long l = a;//неявное
        int x = (int) l; //явное приведение

        System.out.println(x);

        //классы обертки: Double, Float, Integer, Short, Byte, Character, Boolean

        Integer x1 = 123;//= new Integer(123);
        int y = x1;
        Integer.parseInt("456");//статический метод

    }
}
